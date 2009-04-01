// Interchange two values

import console.*

print 'enter first value: '
def first = Console.readInteger()
print 'enter second value: '
def second = Console.readInteger()

  // exchange the order
if (first > second) {
    def temp = first
    first = second
    second = temp
}

println "${first} and ${second}"