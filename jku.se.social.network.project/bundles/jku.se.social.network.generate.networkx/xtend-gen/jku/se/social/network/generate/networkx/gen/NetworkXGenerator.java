package jku.se.social.network.generate.networkx.gen;

import jku.se.social.network.mm.SocialNetwork.Person;
import jku.se.social.network.mm.SocialNetwork.Relationship;
import jku.se.social.network.mm.SocialNetwork.SocialNetwork;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class NetworkXGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource res, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject rootEObject = res.getContents().get(0);
    if ((rootEObject instanceof SocialNetwork)) {
      SocialNetwork sn = ((SocialNetwork)rootEObject);
      String _name = sn.getName();
      String _plus = ("networkX/" + _name);
      String _plus_1 = (_plus + ".ipynb");
      fsa.generateFile(_plus_1, this.generateNetworkX(sn));
    }
  }
  
  public CharSequence generateNetworkX(final SocialNetwork sn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import networkx as nx");
    _builder.newLine();
    _builder.append("G = nx.Graph()");
    _builder.newLine();
    {
      EList<Person> _persons = sn.getPersons();
      for(final Person person : _persons) {
        _builder.append("G.add_node(");
        String _name = person.getName();
        _builder.append(_name);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Relationship> _relationships = sn.getRelationships();
      for(final Relationship relation : _relationships) {
        _builder.append("G.add_edge(");
        String _name_1 = relation.getSource().getName();
        _builder.append(_name_1);
        _builder.append(", ");
        String _name_2 = relation.getTarget().getName();
        _builder.append(_name_2);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
