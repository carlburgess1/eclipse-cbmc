/*******************************************************************************
 * Copyright (c) 2014 Rapicorp, Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rapicorp, Inc - initial API and implementation
 *******************************************************************************/
/**
 */
package process;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import trace.Assignment;
import trace.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link process.VariableManager#getVariables <em>Variables</em>}</li>
 *   <li>{@link process.VariableManager#getPreviousValues <em>Previous Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see process.ProcessPackage#getVariableManager()
 * @model
 * @generated
 */
public interface VariableManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link trace.Assignment},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' map.
	 * @see process.ProcessPackage#getVariableManager_Variables()
	 * @model mapType="process.StringToAssignmentEntry<org.eclipse.emf.ecore.xml.type.String, trace.Assignment>"
	 * @generated
	 */
	EMap<String, Assignment> getVariables();

	/**
	 * Returns the value of the '<em><b>Previous Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link trace.Assignment},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Values</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Values</em>' map.
	 * @see process.ProcessPackage#getVariableManager_PreviousValues()
	 * @model mapType="process.StringToAssignmentEntry<org.eclipse.emf.ecore.xml.type.String, trace.Assignment>"
	 * @generated
	 */
	EMap<String, Assignment> getPreviousValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expressionDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	Assignment getAssignment(String expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expressionDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	Value getValue(String expression);

} // VariableManager
