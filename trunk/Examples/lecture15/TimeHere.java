//# You must install the Java Enterprise
//# Edition from java.sun.com and add javaee.jar
//# to your CLASSPATH in order to compile
//# this file. See details at java.sun.com.
// Remote Interface of TimeHereBean

package uk.ac.swan.atm42.ejb;

import javax.ejb.Remote;

@Remote
public interface TimeHere {
  public String getTimeHere();
}
