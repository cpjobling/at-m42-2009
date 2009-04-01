// List case expressions

def number = 32

switch (number) {
	case [21, 22, 23, 24] : 
		println 'Number is twenty something'
		break
	case [31, 32, 33, 34] : 
		println 'Number is thirty something'
		break
	default: 
		println 'Number type is unknown'
		break
}