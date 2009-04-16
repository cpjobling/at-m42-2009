// : c15:rmi:TimeHereI.java
//From 'Thinking in Java, 2nd ed.' by Bruce Eckel
//www.BruceEckel.com. See copyright notice in CopyRight.txt.
//The TimeHere remote interface.
package uk.ac.swan.egm42.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface TimeHereI extends Remote {
	long getTimeHere() throws RemoteException;
} ///:~
