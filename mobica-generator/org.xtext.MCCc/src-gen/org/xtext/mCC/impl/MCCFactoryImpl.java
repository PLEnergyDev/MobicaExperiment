/**
 * generated by Xtext 2.34.0
 */
package org.xtext.mCC.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.mCC.Application;
import org.xtext.mCC.Cloud;
import org.xtext.mCC.Device;
import org.xtext.mCC.Edge;
import org.xtext.mCC.Fragment;
import org.xtext.mCC.MCCFactory;
import org.xtext.mCC.MCCPackage;
import org.xtext.mCC.Mobile;
import org.xtext.mCC.Model;
import org.xtext.mCC.Operator;
import org.xtext.mCC.Structure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MCCFactoryImpl extends EFactoryImpl implements MCCFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MCCFactory init()
  {
    try
    {
      MCCFactory theMCCFactory = (MCCFactory)EPackage.Registry.INSTANCE.getEFactory(MCCPackage.eNS_URI);
      if (theMCCFactory != null)
      {
        return theMCCFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MCCFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MCCFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MCCPackage.MODEL: return createModel();
      case MCCPackage.DEVICE: return createDevice();
      case MCCPackage.CLOUD: return createCloud();
      case MCCPackage.MOBILE: return createMobile();
      case MCCPackage.APPLICATION: return createApplication();
      case MCCPackage.STRUCTURE: return createStructure();
      case MCCPackage.EDGE: return createEdge();
      case MCCPackage.FRAGMENT: return createFragment();
      case MCCPackage.SYSTEM: return createSystem();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MCCPackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MCCPackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cloud createCloud()
  {
    CloudImpl cloud = new CloudImpl();
    return cloud;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mobile createMobile()
  {
    MobileImpl mobile = new MobileImpl();
    return mobile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Structure createStructure()
  {
    StructureImpl structure = new StructureImpl();
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Edge createEdge()
  {
    EdgeImpl edge = new EdgeImpl();
    return edge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fragment createFragment()
  {
    FragmentImpl fragment = new FragmentImpl();
    return fragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.xtext.mCC.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperatorFromString(EDataType eDataType, String initialValue)
  {
    Operator result = Operator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MCCPackage getMCCPackage()
  {
    return (MCCPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MCCPackage getPackage()
  {
    return MCCPackage.eINSTANCE;
  }

} //MCCFactoryImpl
