/*
 * generated by Xtext 2.34.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.mCC.Application;
import org.xtext.mCC.Cloud;
import org.xtext.mCC.Edge;
import org.xtext.mCC.Fragment;
import org.xtext.mCC.MCCPackage;
import org.xtext.mCC.Mobile;
import org.xtext.mCC.Model;
import org.xtext.mCC.Structure;
import org.xtext.services.MCCGrammarAccess;

@SuppressWarnings("all")
public class MCCSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MCCGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MCCPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MCCPackage.APPLICATION:
				sequence_Application(context, (Application) semanticObject); 
				return; 
			case MCCPackage.CLOUD:
				sequence_Cloud(context, (Cloud) semanticObject); 
				return; 
			case MCCPackage.EDGE:
				sequence_Edge(context, (Edge) semanticObject); 
				return; 
			case MCCPackage.FRAGMENT:
				sequence_Fragment(context, (Fragment) semanticObject); 
				return; 
			case MCCPackage.MOBILE:
				sequence_Mobile(context, (Mobile) semanticObject); 
				return; 
			case MCCPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MCCPackage.STRUCTURE:
				sequence_Structure(context, (Structure) semanticObject); 
				return; 
			case MCCPackage.SYSTEM:
				sequence_System(context, (org.xtext.mCC.System) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Application returns Application
	 *
	 * Constraint:
	 *     (name=ID fragments+=Fragment+ structure=Structure)
	 * </pre>
	 */
	protected void sequence_Application(ISerializationContext context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Device returns Cloud
	 *     Cloud returns Cloud
	 *
	 * Constraint:
	 *     (name=ID cpuInstructions=INT applications+=[Application|ID])
	 * </pre>
	 */
	protected void sequence_Cloud(ISerializationContext context, Cloud semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Edge returns Edge
	 *
	 * Constraint:
	 *     (start=[Fragment|ID] operator=Operator stop+=[Fragment|ID] stop+=[Fragment|ID]*)
	 * </pre>
	 */
	protected void sequence_Edge(ISerializationContext context, Edge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Fragment returns Fragment
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         instructions=INT 
	 *         memory=INT 
	 *         sync=INT 
	 *         (isOfflodable='true' | isOfflodable='false') 
	 *         init='init'?
	 *     )
	 * </pre>
	 */
	protected void sequence_Fragment(ISerializationContext context, Fragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Device returns Mobile
	 *     Mobile returns Mobile
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         cpuInstructions=INT 
	 *         applications+=[Application|ID] 
	 *         battery=INT 
	 *         network=INT 
	 *         memory=INT
	 *     )
	 * </pre>
	 */
	protected void sequence_Mobile(ISerializationContext context, Mobile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (devices+=Device | applications+=Application | systems+=System)+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Structure returns Structure
	 *
	 * Constraint:
	 *     (name=ID edges+=Edge+)
	 * </pre>
	 */
	protected void sequence_Structure(ISerializationContext context, Structure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     System returns System
	 *
	 * Constraint:
	 *     (name=ID devices+=[Device|ID] devices+=[Device|ID]*)
	 * </pre>
	 */
	protected void sequence_System(ISerializationContext context, org.xtext.mCC.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}