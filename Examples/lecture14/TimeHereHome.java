// Home Interface of TimeHereBean.

package uk.ac.swan.atm42.ejb;

import java.rmi.*;
import javax.ejb.*;

public interface TimeHereHome extends EJBHome {
  public TimeHere create() throws
      CreateException, RemoteException;
}