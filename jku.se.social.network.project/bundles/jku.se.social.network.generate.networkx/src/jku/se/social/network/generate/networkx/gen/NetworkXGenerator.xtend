package jku.se.social.network.generate.networkx.gen

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.EObject
import jku.se.social.network.mm.SocialNetwork.SocialNetwork

class NetworkXGenerator extends AbstractGenerator{
	
	override doGenerate(Resource res, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var EObject rootEObject = res.contents.get(0);
		if (rootEObject instanceof SocialNetwork) {
			var SocialNetwork sn = rootEObject;
			fsa.generateFile('networkX/' + sn.name + '.ipynb', sn.generateNetworkX);
		}
	}	
	
	def generateNetworkX(SocialNetwork sn) {
		'''
		import networkx as nx
		G = nx.Graph()
		«FOR person : sn.persons»
		G.add_node(«person.name»)
		«ENDFOR»
		«FOR relation : sn.relationships»
		G.add_edge(«relation.source.name», «relation.target.name»)
		«ENDFOR»
		'''
	}	
}