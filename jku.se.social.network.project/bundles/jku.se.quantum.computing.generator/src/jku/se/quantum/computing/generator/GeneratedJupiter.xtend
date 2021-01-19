package jku.se.quantum.computing.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.EObject
import jku.se.quantum.computing.mm.QuantumComputing.Parameter
import jku.se.quantum.computing.mm.QuantumComputing.DATATYPE
import jku.se.quantum.computing.deployment.QCDeployment.Deployment
import jku.se.quantum.computing.deployment.QCDeployment.Credential
import jku.se.quantum.computing.deployment.QCDeployment.Token
import jku.se.quantum.computing.deployment.QCDeployment.BasicAuth
import jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution

class GeneratedJupiter extends AbstractGenerator{
	
	override doGenerate(Resource res, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var EObject rootEObject = res.contents.get(0);
		if (rootEObject instanceof Deployment) {
			var Deployment deployElement = rootEObject;
			fsa.generateFile('qc/' + deployElement.name + '.ipynb', deployElement.generateQuantumDeployment);
		}
	}
	
	def generateQuantumDeployment(Deployment deployElement) {
		var int counter = 0;
		'''
		// Credentials
		«FOR credential: deployElement.credential»
			«credential.format»
		«ENDFOR»
		// ALgorithm Execution
		«FOR algorithm: deployElement.algorithmexecution»
			res_«counter++»=«algorithm.algorithmexecution.name».«algorithm.algorithmexecution.name»(«algorithm.format»)
		«ENDFOR»				 
		'''
	}
	
	def format(AlgorithmExecution algorithmExecution) {
		'''
		graphname="«algorithmExecution.data.name»",
		«FOR parameter : algorithmExecution.algorithmexecution.parameters»
			,«parameter.name»«parameter.format»
		«ENDFOR»
		'''
	}
	
	def format(Parameter parameter) {
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
	
	def format(Credential credential) {
		if (credential instanceof Token) {
			'''
			token = "«credential.tokenValue»"
			'''
		} else if (credential instanceof BasicAuth) {
			'''
			username = "«credential.username»";
			pasword = "«credential.password»";
			'''
		}
	}	
}