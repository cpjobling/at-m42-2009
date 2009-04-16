// The implementation of the TimeHere remote object.

package uk.ac.swan.atm42.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

class TimeHere extends UnicastRemoteObject implements TimeHereI {
	// Implementation of the interface:
	public String getTimeHere() throws RemoteException {
		return new Date().toString();
	}

	// Must implement constructor
	// to throw RemoteException:
	public TimeHere() throws RemoteException {
		// super(); // Called automatically
	}

} ///:~
