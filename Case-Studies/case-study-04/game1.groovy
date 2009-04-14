import console.Console

def readMenuSelection() {
	println()
	println('0: Quit')
	println('1: Add new weighty item')
	println('2: Add new magical item')
	println('3: Display inventory')
	println('4: Display available items')
	println('5: Display items being carried')
	println('6: Register new player')
	println('7: Display players')
	println('8: Pick up an item')
	println('9: Drop an item')
	
	print('\n\tEnter choice>>>> ')
	return Console.readInteger()	
}

	// make the Action object
def action = new Action(game : new Game(name : 'The Discworld'))

	// make first selection
def choice = readMenuSelection()
while (choice != 0) {
	switch (choice) {
		case 1:
			action.addWeightyItem()
			break
		case 2:
			action.addMagicalItem()
			break		
		case 3:
			action.displayInventory()
			break
		case 4:
			action.displayAvailableItems()
			break
		case 5:
			action.displayItemsBeingCarried()
			break
		case 6:
			action.registerPlayer()
			break
		case 7:
			action.displayPlayers()
			break
		case 8:
			action.pickupItem()
			break
		case 9:
			action.dropItem()
			break
		default:
			println "Unknown selection"
	}
	choice = readMenuSelection()
}
println '\n\nGame closing ... thanks for playing'
