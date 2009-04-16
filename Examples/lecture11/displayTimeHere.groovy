// Uses remote object TimeHere.

package uk.ac.swan.atm42.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

System.setSecurityManager(new RMISecurityManager());
def t = (TimeHereI) Naming.lookup("//dell-laptop:2005/TimeHere");
for (i in 0..< 10) {
	println "Time on remote server: ${t.getTimeHere()}"
} ///:~
