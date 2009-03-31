// Interchange method

import console.*

def swap(x, y) {
    def temp = x
    x = y
    y = temp
}

print 'Enter the first value: '
def first = Console.readInteger()
print 'Enter the second value: '
def second = Console.readInteger()

  // Now call the swap method
swap(first, second)
println "First: ${first}"
println "Second: ${second}"