// Sum of a series of positive integers.

import console.*

	// Running total
def sum = 0

print 'Enter first value: '
def data = Console.readInteger()
while ( data > 0 ) {
	sum += data
	print 'Enter next value [-ve to quit]: '
	data = Console.readInteger()
}

println "The sum is: ${sum}"