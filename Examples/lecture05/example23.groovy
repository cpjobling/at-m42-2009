// switch and a range

import console.*

print 'Enter examination score: '
def score = Console.readInteger()
def grade

switch (score) {
	case 70..100: 
		grade = 'A'
		break
	case 60..69: 
		grade = 'B'
		break
	case 50..59: 
		grade = 'C'
		break
	case 40..49: 
		grade = 'D'
		break
	case 0..39: 
		grade = 'E'
		break
}

println "Score: ${score}; grade: ${grade}"