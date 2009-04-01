// Regular expressions for case labels

def number = '1234'

switch (number) {
	case ~'[0-9]{3}-[0-0]{4}' : 
		println 'number is a telephone number'
		break
	case ~'[0-9]{4}' : 
		println 'number is a 4-digit sequence'
		break
	default: 
		println 'number type is unknown'
		break
}