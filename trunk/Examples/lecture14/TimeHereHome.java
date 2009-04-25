// Home Interface of TimeHereBean.

import java.rmi.*;
import javax.ejb.*;

public interface TimeHereHome extends EJBHome {
  public TimeHere create() throws
      CreateException, RemoteException;
}