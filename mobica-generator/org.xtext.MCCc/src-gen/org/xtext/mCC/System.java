/**
 * generated by Xtext 2.34.0
 */
package org.xtext.mCC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mCC.System#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mCC.System#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see org.xtext.mCC.MCCPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.mCC.MCCPackage#getSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mCC.System#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Devices</b></em>' reference list.
   * The list contents are of type {@link org.xtext.mCC.Device}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' reference list.
   * @see org.xtext.mCC.MCCPackage#getSystem_Devices()
   * @model
   * @generated
   */
  EList<Device> getDevices();

} // System