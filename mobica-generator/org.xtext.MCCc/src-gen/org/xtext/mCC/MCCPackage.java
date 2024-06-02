/**
 * generated by Xtext 2.34.0
 */
package org.xtext.mCC;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.mCC.MCCFactory
 * @model kind="package"
 * @generated
 */
public interface MCCPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mCC";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/MCC";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mCC";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MCCPackage eINSTANCE = org.xtext.mCC.impl.MCCPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.mCC.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mCC.impl.ModelImpl
   * @see org.xtext.mCC.impl.MCCPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DEVICES = 0;

  /**
   * The feature id for the '<em><b>Applications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__APPLICATIONS = 1;

  /**
   * The feature id for the '<em><b>Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SYSTEMS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.mCC.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mCC.impl.DeviceImpl
   * @see org.xtext.mCC.impl.MCCPackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Cpu Instructions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__CPU_INSTRUCTIONS = 1;

  /**
   * The feature id for the '<em><b>Applications</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__APPLICATIONS = 2;

  /**
   * The number of structural features of the '<em>Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.mCC.impl.CloudImpl <em>Cloud</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mCC.impl.CloudImpl
   * @see org.xtext.mCC.impl.MCCPackageImpl#getCloud()
   * @generated
   */
  int CLOUD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD__NAME = DEVICE__NAME;

  /**
   * The feature id for the '<em><b>Cpu Instructions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD__CPU_INSTRUCTIONS = DEVICE__CPU_INSTRUCTIONS;

  /**
   * The feature id for the '<em><b>Applications</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD__APPLICATIONS = DEVICE__APPLICATIONS;

  /**
   * The number of structural features of the '<em>Cloud</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOUD_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.mCC.impl.MobileImpl <em>Mobile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mCC.impl.MobileImpl
   * @see org.xtext.mCC.impl.MCCPackageImpl#getMobile()
   * @generated
   */
  int MOBILE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBILE__NAME = DEVICE__NAME;

  /**
   * The feature id for the '<em><b>Cpu Instructions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBILE__CPU_INSTRUCTIONS = DEVICE__CPU_INSTRUCTIONS;

  /**
   * The feature id for the '<em><b>Applications</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBILE__APPLICATIONS = DEVICE__APPLICATIONS;

  /**
   * The feature id for the '<em><b>Battery</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBILE__BATTERY = DEVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Network</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBILE__NETWORK = DEVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Memory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBILE__MEMORY = DEVICE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mobile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBILE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.mCC.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mCC.impl.ApplicationImpl
   * @see org.xtext.mCC.impl.MCCPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__FRAGMENTS = 1;

  /**
   * The feature id for the '<em><b>Structure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__STRUCTURE = 2;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.mCC.impl.StructureImpl <em>Structure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mCC.impl.StructureImpl
   * @see org.xtext.mCC.impl.MCCPackageImpl#getStructure()
   * @generated
   */
  int STRUCTURE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE__EDGES = 1;

  /**
   * The number of structural features of the '<em>Structure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mCC.impl.EdgeImpl <em>Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mCC.impl.EdgeImpl
   * @see org.xtext.mCC.impl.MCCPackageImpl#getEdge()
   * @generated
   */
  int EDGE = 6;

  /**
   * The feature id for the '<em><b>Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE__START = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Stop</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE__STOP = 2;

  /**
   * The number of structural features of the '<em>Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.mCC.impl.FragmentImpl <em>Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mCC.impl.FragmentImpl
   * @see org.xtext.mCC.impl.MCCPackageImpl#getFragment()
   * @generated
   */
  int FRAGMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__INSTRUCTIONS = 1;

  /**
   * The feature id for the '<em><b>Memory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__MEMORY = 2;

  /**
   * The feature id for the '<em><b>Sync</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__SYNC = 3;

  /**
   * The feature id for the '<em><b>Is Offlodable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__IS_OFFLODABLE = 4;

  /**
   * The feature id for the '<em><b>Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__INIT = 5;

  /**
   * The number of structural features of the '<em>Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.mCC.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mCC.impl.SystemImpl
   * @see org.xtext.mCC.impl.MCCPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Devices</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__DEVICES = 1;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.mCC.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.mCC.Operator
   * @see org.xtext.mCC.impl.MCCPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 9;


  /**
   * Returns the meta object for class '{@link org.xtext.mCC.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.mCC.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mCC.Model#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Devices</em>'.
   * @see org.xtext.mCC.Model#getDevices()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Devices();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mCC.Model#getApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Applications</em>'.
   * @see org.xtext.mCC.Model#getApplications()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Applications();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mCC.Model#getSystems <em>Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Systems</em>'.
   * @see org.xtext.mCC.Model#getSystems()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Systems();

  /**
   * Returns the meta object for class '{@link org.xtext.mCC.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device</em>'.
   * @see org.xtext.mCC.Device
   * @generated
   */
  EClass getDevice();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Device#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mCC.Device#getName()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Device#getCpuInstructions <em>Cpu Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cpu Instructions</em>'.
   * @see org.xtext.mCC.Device#getCpuInstructions()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_CpuInstructions();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.mCC.Device#getApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Applications</em>'.
   * @see org.xtext.mCC.Device#getApplications()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_Applications();

  /**
   * Returns the meta object for class '{@link org.xtext.mCC.Cloud <em>Cloud</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cloud</em>'.
   * @see org.xtext.mCC.Cloud
   * @generated
   */
  EClass getCloud();

  /**
   * Returns the meta object for class '{@link org.xtext.mCC.Mobile <em>Mobile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mobile</em>'.
   * @see org.xtext.mCC.Mobile
   * @generated
   */
  EClass getMobile();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Mobile#getBattery <em>Battery</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Battery</em>'.
   * @see org.xtext.mCC.Mobile#getBattery()
   * @see #getMobile()
   * @generated
   */
  EAttribute getMobile_Battery();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Mobile#getNetwork <em>Network</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Network</em>'.
   * @see org.xtext.mCC.Mobile#getNetwork()
   * @see #getMobile()
   * @generated
   */
  EAttribute getMobile_Network();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Mobile#getMemory <em>Memory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memory</em>'.
   * @see org.xtext.mCC.Mobile#getMemory()
   * @see #getMobile()
   * @generated
   */
  EAttribute getMobile_Memory();

  /**
   * Returns the meta object for class '{@link org.xtext.mCC.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.xtext.mCC.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mCC.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mCC.Application#getFragments <em>Fragments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fragments</em>'.
   * @see org.xtext.mCC.Application#getFragments()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Fragments();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.mCC.Application#getStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structure</em>'.
   * @see org.xtext.mCC.Application#getStructure()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Structure();

  /**
   * Returns the meta object for class '{@link org.xtext.mCC.Structure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure</em>'.
   * @see org.xtext.mCC.Structure
   * @generated
   */
  EClass getStructure();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Structure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mCC.Structure#getName()
   * @see #getStructure()
   * @generated
   */
  EAttribute getStructure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.mCC.Structure#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see org.xtext.mCC.Structure#getEdges()
   * @see #getStructure()
   * @generated
   */
  EReference getStructure_Edges();

  /**
   * Returns the meta object for class '{@link org.xtext.mCC.Edge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge</em>'.
   * @see org.xtext.mCC.Edge
   * @generated
   */
  EClass getEdge();

  /**
   * Returns the meta object for the reference '{@link org.xtext.mCC.Edge#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Start</em>'.
   * @see org.xtext.mCC.Edge#getStart()
   * @see #getEdge()
   * @generated
   */
  EReference getEdge_Start();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Edge#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.xtext.mCC.Edge#getOperator()
   * @see #getEdge()
   * @generated
   */
  EAttribute getEdge_Operator();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.mCC.Edge#getStop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stop</em>'.
   * @see org.xtext.mCC.Edge#getStop()
   * @see #getEdge()
   * @generated
   */
  EReference getEdge_Stop();

  /**
   * Returns the meta object for class '{@link org.xtext.mCC.Fragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fragment</em>'.
   * @see org.xtext.mCC.Fragment
   * @generated
   */
  EClass getFragment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Fragment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mCC.Fragment#getName()
   * @see #getFragment()
   * @generated
   */
  EAttribute getFragment_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Fragment#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instructions</em>'.
   * @see org.xtext.mCC.Fragment#getInstructions()
   * @see #getFragment()
   * @generated
   */
  EAttribute getFragment_Instructions();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Fragment#getMemory <em>Memory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memory</em>'.
   * @see org.xtext.mCC.Fragment#getMemory()
   * @see #getFragment()
   * @generated
   */
  EAttribute getFragment_Memory();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Fragment#getSync <em>Sync</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sync</em>'.
   * @see org.xtext.mCC.Fragment#getSync()
   * @see #getFragment()
   * @generated
   */
  EAttribute getFragment_Sync();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Fragment#getIsOfflodable <em>Is Offlodable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Offlodable</em>'.
   * @see org.xtext.mCC.Fragment#getIsOfflodable()
   * @see #getFragment()
   * @generated
   */
  EAttribute getFragment_IsOfflodable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.Fragment#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init</em>'.
   * @see org.xtext.mCC.Fragment#getInit()
   * @see #getFragment()
   * @generated
   */
  EAttribute getFragment_Init();

  /**
   * Returns the meta object for class '{@link org.xtext.mCC.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see org.xtext.mCC.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.mCC.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.mCC.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.mCC.System#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Devices</em>'.
   * @see org.xtext.mCC.System#getDevices()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Devices();

  /**
   * Returns the meta object for enum '{@link org.xtext.mCC.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see org.xtext.mCC.Operator
   * @generated
   */
  EEnum getOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MCCFactory getMCCFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.mCC.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mCC.impl.ModelImpl
     * @see org.xtext.mCC.impl.MCCPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DEVICES = eINSTANCE.getModel_Devices();

    /**
     * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__APPLICATIONS = eINSTANCE.getModel_Applications();

    /**
     * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SYSTEMS = eINSTANCE.getModel_Systems();

    /**
     * The meta object literal for the '{@link org.xtext.mCC.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mCC.impl.DeviceImpl
     * @see org.xtext.mCC.impl.MCCPackageImpl#getDevice()
     * @generated
     */
    EClass DEVICE = eINSTANCE.getDevice();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

    /**
     * The meta object literal for the '<em><b>Cpu Instructions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__CPU_INSTRUCTIONS = eINSTANCE.getDevice_CpuInstructions();

    /**
     * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__APPLICATIONS = eINSTANCE.getDevice_Applications();

    /**
     * The meta object literal for the '{@link org.xtext.mCC.impl.CloudImpl <em>Cloud</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mCC.impl.CloudImpl
     * @see org.xtext.mCC.impl.MCCPackageImpl#getCloud()
     * @generated
     */
    EClass CLOUD = eINSTANCE.getCloud();

    /**
     * The meta object literal for the '{@link org.xtext.mCC.impl.MobileImpl <em>Mobile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mCC.impl.MobileImpl
     * @see org.xtext.mCC.impl.MCCPackageImpl#getMobile()
     * @generated
     */
    EClass MOBILE = eINSTANCE.getMobile();

    /**
     * The meta object literal for the '<em><b>Battery</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBILE__BATTERY = eINSTANCE.getMobile_Battery();

    /**
     * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBILE__NETWORK = eINSTANCE.getMobile_Network();

    /**
     * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBILE__MEMORY = eINSTANCE.getMobile_Memory();

    /**
     * The meta object literal for the '{@link org.xtext.mCC.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mCC.impl.ApplicationImpl
     * @see org.xtext.mCC.impl.MCCPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__FRAGMENTS = eINSTANCE.getApplication_Fragments();

    /**
     * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__STRUCTURE = eINSTANCE.getApplication_Structure();

    /**
     * The meta object literal for the '{@link org.xtext.mCC.impl.StructureImpl <em>Structure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mCC.impl.StructureImpl
     * @see org.xtext.mCC.impl.MCCPackageImpl#getStructure()
     * @generated
     */
    EClass STRUCTURE = eINSTANCE.getStructure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE__NAME = eINSTANCE.getStructure_Name();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE__EDGES = eINSTANCE.getStructure_Edges();

    /**
     * The meta object literal for the '{@link org.xtext.mCC.impl.EdgeImpl <em>Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mCC.impl.EdgeImpl
     * @see org.xtext.mCC.impl.MCCPackageImpl#getEdge()
     * @generated
     */
    EClass EDGE = eINSTANCE.getEdge();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE__START = eINSTANCE.getEdge_Start();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE__OPERATOR = eINSTANCE.getEdge_Operator();

    /**
     * The meta object literal for the '<em><b>Stop</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE__STOP = eINSTANCE.getEdge_Stop();

    /**
     * The meta object literal for the '{@link org.xtext.mCC.impl.FragmentImpl <em>Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mCC.impl.FragmentImpl
     * @see org.xtext.mCC.impl.MCCPackageImpl#getFragment()
     * @generated
     */
    EClass FRAGMENT = eINSTANCE.getFragment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRAGMENT__NAME = eINSTANCE.getFragment_Name();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRAGMENT__INSTRUCTIONS = eINSTANCE.getFragment_Instructions();

    /**
     * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRAGMENT__MEMORY = eINSTANCE.getFragment_Memory();

    /**
     * The meta object literal for the '<em><b>Sync</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRAGMENT__SYNC = eINSTANCE.getFragment_Sync();

    /**
     * The meta object literal for the '<em><b>Is Offlodable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRAGMENT__IS_OFFLODABLE = eINSTANCE.getFragment_IsOfflodable();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRAGMENT__INIT = eINSTANCE.getFragment_Init();

    /**
     * The meta object literal for the '{@link org.xtext.mCC.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mCC.impl.SystemImpl
     * @see org.xtext.mCC.impl.MCCPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__DEVICES = eINSTANCE.getSystem_Devices();

    /**
     * The meta object literal for the '{@link org.xtext.mCC.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.mCC.Operator
     * @see org.xtext.mCC.impl.MCCPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

  }

} //MCCPackage
