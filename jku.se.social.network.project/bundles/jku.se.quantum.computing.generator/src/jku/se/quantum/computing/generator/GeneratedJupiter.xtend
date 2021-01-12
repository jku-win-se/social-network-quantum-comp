package jku.se.quantum.computing.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.EObject
import jku.se.quantum.computing.mm.QuantumComputing.QuantumLibrary
import jku.se.quantum.computing.mm.QuantumComputing.Parameter
import jku.se.quantum.computing.mm.QuantumComputing.DATATYPE

class GeneratedJupiter extends AbstractGenerator{
	
	override doGenerate(Resource res, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var EObject rootEObject = res.contents.get(0);
		if (rootEObject instanceof QuantumLibrary) {
			var QuantumLibrary qLib = rootEObject;
			fsa.generateFile('qc/' + qLib.name + '.ipynb', qLib.generateQuantumExecution);
		}
	}
	
	def generateQuantumExecution(QuantumLibrary qLib) {
		var int counter = 0;
		'''
		import networkx as nx		
		«FOR qAlgorithm: qLib.quantumalgorithms»
		res_«counter++»=«qAlgorithm.name»(
			nx.read_gpickle(«qAlgorithm.name»)
			«FOR parameter : qAlgorithm.parameters»
					,«parameter.name»«parameter.formatParameter.toString»
			«ENDFOR»					
		)
		«ENDFOR»		 
		'''
	}
	
	def formatParameter(Parameter parameter) {
		'''
		«IF parameter.value !== null && parameter.value.isEmpty == false»
			«IF parameter.dataType === DATATYPE.STRING »
			='«parameter.value»'
			«ENDIF»		
			«IF parameter.dataType === DATATYPE.INTEGER »
			=«parameter.value»
			«ENDIF»
		«ENDIF»
		'''
	}
	
}