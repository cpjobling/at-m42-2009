// Unexpected switch behaviour.

def n = 2
switch (n) {
	case 1: 
		println 'One'
		break
	case 2: 
		println 'Two'
		break
	case 3: 
		println 'Three'
		break
	case 4: 
		println 'Four'
		break
	default: 
		println 'Default'
		break
}
println 'End of switch'