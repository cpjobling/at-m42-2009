// Simple Stateless Session Bean
// that returns current system time.

import java.rmi.*;
import javax.ejb.*;

@Stateless
public class TimeHereBean implements TimeHere {
  public String getTimeHere() {
    return new Date().toString();
  }
}