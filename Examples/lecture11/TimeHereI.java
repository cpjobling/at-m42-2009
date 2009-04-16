// The TimeHere remote interface.

package uk.ac.swan.atm42.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface TimeHereI extends Remote {
	String getTimeHere() throws RemoteException;
} ///:~
