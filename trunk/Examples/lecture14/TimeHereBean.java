// Simple Stateless Session Bean
// that returns current system time.

import javax.ejb.Stateless;

@Stateless
public class TimeHereBean implements TimeHere {
  public String getTimeHere() {
    return new Date().toString();
  }
}