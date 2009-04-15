import console.Console

def readMenuSelection() {
	println()
	println('0: Quit\n')
	println('1: Add new weighty item')
	println('2: Add new magical item')
	println('3: Remove an item\n')
	println('4: Display inventory')
	println('5: Display selected items')
	println('6: Display one item')
	println('7: Display available items')
	println('8: Display items being carried\n')
	println('9: Register new player')
	println('10: Display all players')
	println('11: Display selected players')
	println('12: Display one player\n')
	println('13: Pick up an item')
	println('14: Drop an item')
	
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
			action.removeItem()
			break
		case 4:
			action.displayInventory()
			break
		case 5:
			action.displaySelectedItems()
			break
		case 6:
			action.displayOneItem()
			break
		case 7:
			action.displayAvailableItems()
			break
		case 8:
			action.displayItemsBeingCarried()
			break
		case 9:
			action.registerPlayer()
			break
		case 10:
			action.displayPlayers()
			break
		case 11:
			action.displayeSelectedPlayers()
			break
		case 12:
			action.displayOnePlayer()
			break
		case 13:
			action.pickupItem()
			break
		case 14:
			action.dropItem()
			break
		default:
			println "Unknown selection"
	}
	choice = readMenuSelection()
}
println '\n\nGame closing ... thanks for playing'
