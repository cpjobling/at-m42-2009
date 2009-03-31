// A method with variables

import console.*

def reverse() {
  print 'Enter two integer values: '
  def first = Console.readInteger()
  def second = Console.readInteger()
  println "Reversed values: ${second} and ${first}"
}

reverse()
