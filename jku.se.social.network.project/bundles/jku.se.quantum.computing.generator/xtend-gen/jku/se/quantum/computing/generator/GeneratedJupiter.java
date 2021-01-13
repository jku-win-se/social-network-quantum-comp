package jku.se.quantum.computing.generator;

import jku.se.quantum.computing.mm.QuantumComputing.DATATYPE;
import jku.se.quantum.computing.mm.QuantumComputing.Parameter;
import jku.se.quantum.computing.mm.QuantumComputing.QuantumAlgorithm;
import jku.se.quantum.computing.mm.QuantumComputing.QuantumLibrary;
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
    if ((rootEObject instanceof QuantumLibrary)) {
      QuantumLibrary qLib = ((QuantumLibrary)rootEObject);
      String _name = qLib.getName();
      String _plus = ("qc/" + _name);
      String _plus_1 = (_plus + ".ipynb");
      fsa.generateFile(_plus_1, this.generateQuantumExecution(qLib));
    }
  }
  
  public CharSequence generateQuantumExecution(final QuantumLibrary qLib) {
    CharSequence _xblockexpression = null;
    {
      int counter = 0;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import import_ipynb");
      _builder.newLine();
      {
        EList<QuantumAlgorithm> _quantumalgorithms = qLib.getQuantumalgorithms();
        for(final QuantumAlgorithm qAlgorithm : _quantumalgorithms) {
          _builder.append("import ");
          String _name = qAlgorithm.getName();
          _builder.append(_name);
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<QuantumAlgorithm> _quantumalgorithms_1 = qLib.getQuantumalgorithms();
        for(final QuantumAlgorithm qAlgorithm_1 : _quantumalgorithms_1) {
          _builder.append("res_");
          int _plusPlus = counter++;
          _builder.append(_plusPlus);
          _builder.append("=");
          String _name_1 = qAlgorithm_1.getName();
          _builder.append(_name_1);
          _builder.append(".");
          String _name_2 = qAlgorithm_1.getName();
          _builder.append(_name_2);
          _builder.append("(");
          _builder.newLineIfNotEmpty();
          _builder.append("graphname=\"");
          String _name_3 = qAlgorithm_1.getFile().getName();
          _builder.append(_name_3);
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          {
            EList<Parameter> _parameters = qAlgorithm_1.getParameters();
            for(final Parameter parameter : _parameters) {
              _builder.append("\t");
              _builder.append(",");
              String _name_4 = parameter.getName();
              _builder.append(_name_4, "\t");
              String _string = this.formatParameter(parameter).toString();
              _builder.append(_string, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append(")");
          _builder.newLine();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence formatParameter(final Parameter parameter) {
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
