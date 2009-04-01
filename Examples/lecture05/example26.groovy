// for looop and break statement

import console.*

def MAX = 100
def sum = 0

for (k in 1..MAX) {
	print 'Enter next value: '
	def value = Console.readInteger()
	if (value < 0) {
		break
	}
	sum += value
}
println "sum: ${sum}"