/*
 * generated by Xtext 2.34.0
 */
package org.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MCCStandaloneSetup extends MCCStandaloneSetupGenerated {

	public static void doSetup() {
		new MCCStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
