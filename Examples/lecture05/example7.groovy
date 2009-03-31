// implicit returns

import console.*

def hmsToSeconds(h, m=0, s=0) {
   def totaSeconds = (60 * h + m) * 60 + s
   totalSeconds
}

   // Get input from the user
print 'Enter the time to be converted [hours minutes seconds]: '
def hours = Console.readInteger()
def minutes = Console.readInteger()
def seconds = Console.readInteger()
  // now call the method
def totalSeconds = hmsToSeconds(hours, minutes, seconds)
println "Total number of seconds=${totalSeconds} seconds"