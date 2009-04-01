// A simple if statement

import console.*

print 'enter first value: '
def first = Console.readInteger()
print 'enter second value: '
def second = Console.readInteger()

if (first < second) {
	println "${first} and ${second}"
}
else {
	println "${second} and ${first}"
}