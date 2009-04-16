// Uses remote object TimeHere.

package uk.ac.swan.egm42.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class DisplayTimeHere {
	public static void main(String[] args) throws Exception {
		System.setSecurityManager(new RMISecurityManager());
		TimeHereI t = (TimeHereI) Naming
				.lookup("//dell-laptop:2005/TimeHere");
		for (int i = 0; i < 10; i++)
			System.out.println("Time on remote server: " + t.getTimeHere());
	}
} ///:~
