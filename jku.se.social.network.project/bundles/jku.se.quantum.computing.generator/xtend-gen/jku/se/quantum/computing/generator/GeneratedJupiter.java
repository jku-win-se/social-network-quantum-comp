package jku.se.quantum.computing.generator;

import jku.se.quantum.computing.deployment.QCDeployment.AlgorithmExecution;
import jku.se.quantum.computing.deployment.QCDeployment.Deployment;
import jku.se.quantum.computing.mm.QuantumComputing.DATATYPE;
import jku.se.quantum.computing.mm.QuantumComputing.Parameter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class GeneratedJupiter extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource res, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject rootEObject = res.getContents().get(0);
    if ((rootEObject instanceof Deployment)) {
      Deployment deployElement = ((Deployment)rootEObject);
      String _name = deployElement.getName();
      String _plus = ("qc/" + _name);
      String _plus_1 = (_plus + ".ipynb");
      fsa.generateFile(_plus_1, this.generateQuantumDeployment(deployElement));
    }
  }
  
  public CharSequence generateQuantumDeployment(final Deployment deployElement) {
    CharSequence _xblockexpression = null;
    {
      int counter = 0;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("// ALgorithm Execution");
      _builder.newLine();
      {
        EList<AlgorithmExecution> _algorithmexecution = deployElement.getAlgorithmexecution();
        for(final AlgorithmExecution algorithm : _algorithmexecution) {
          _builder.append("res_");
          int _plusPlus = counter++;
          _builder.append(_plusPlus);
          _builder.append("=");
          String _name = algorithm.getAlgorithmexecution().getName();
          _builder.append(_name);
          _builder.append(".");
          String _name_1 = algorithm.getAlgorithmexecution().getName();
          _builder.append(_name_1);
          _builder.append("(");
          CharSequence _format = this.format(algorithm);
          _builder.append(_format);
          _builder.append(")");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence format(final AlgorithmExecution algorithmExecution) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("graphname=\"");
    String _name = algorithmExecution.getData().getName();
    _builder.append(_name);
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    {
      EList<Parameter> _parameters = algorithmExecution.getAlgorithmexecution().getParameters();
      for(final Parameter parameter : _parameters) {
        _builder.append(",");
        String _name_1 = parameter.getName();
        _builder.append(_name_1);
        CharSequence _format = this.format(parameter);
        _builder.append(_format);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence format(final Parameter parameter) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((parameter.getValue() != null) && (parameter.getValue().isEmpty() == false))) {
        {
          DATATYPE _dataType = parameter.getDataType();
          boolean _tripleEquals = (_dataType == DATATYPE.STRING);
          if (_tripleEquals) {
            _builder.append("=\'");
            String _value = parameter.getValue();
            _builder.append(_value);
            _builder.append("\'");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          DATATYPE _dataType_1 = parameter.getDataType();
          boolean _tripleEquals_1 = (_dataType_1 == DATATYPE.INTEGER);
          if (_tripleEquals_1) {
            _builder.append("=");
            String _value_1 = parameter.getValue();
            _builder.append(_value_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
}
