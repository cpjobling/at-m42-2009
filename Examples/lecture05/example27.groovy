// for looop and continue statement

import console.*

def MAX = 10
def sum = 0

for (k in 1..MAX) {
	print 'Enter next value: '
	def value = Console.readInteger()
	if (value < 0) {
		continue
	}
	sum += value
}
println "sum: ${sum}"