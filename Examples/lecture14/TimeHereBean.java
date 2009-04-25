// Simple Stateless Session Bean
// that returns current system time.

package uk.ac.swan.atm42.ejb;

import javax.ejb.Stateless;

@Stateless
public class TimeHereBean implements TimeHere {
  public String getTimeHere() {
    return new Date().toString();
  }
}