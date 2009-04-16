//The implementation of the TimeHere remote object.

package uk.ac.swan.atm42.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TimeHere extends UnicastRemoteObject implements TimeHereI {
	// Implementation of the interface:
	public String getSystemDate() throws RemoteException {
		return new Date().toString();
	}

	// Must implement constructor
	// to throw RemoteException:
	public TimeHere() throws RemoteException {
		// super(); // Called automatically
	}

	// Registration for RMI serving. Throw
	// exceptions out to the console.
	public static void main(String[] args) throws Exception {
		System.setSecurityManager(new RMISecurityManager());
		TimeHere pt = new TimeHere();
		Naming.bind("//dell-laptop:2005/TimeHere", pt);
		System.out.println("Ready to tell time");
	}
} ///:~
