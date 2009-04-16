package uk.ac.swan.atm42.rmi

import java.rmi.Naming
import java.rmi.RMISecurityManager

System.setSecurityManager(new RMISecurityManager())
def pt = new TimeHere()
Naming.bind("//dell-laptop:2005/TimeHere", pt)
println "Ready to tell time"