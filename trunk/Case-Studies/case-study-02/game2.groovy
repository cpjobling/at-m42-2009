// A simple adventure game

import console.*

    // The methods
def addItem(game, item) {
    game[item] = []
}

def removeItem(game, item) {
	game.remove(item)
}

def pickUpItem(game, item, player) {
	game[item] << player
}

def dropItem(game, item, player) {
	game[item].remove(player)
}

def displayItems(game) {
	println "The game contains: ${game} \n"
}

def readNumberOfItemsBeingCarried(game, player) {
	
	// get a List of each List of the players from the game
	def playerNames = game.values().asList()
	
	// create a single list fo the players' names
	playerNames = playerNames.flatten()
	
	// return the number of palyer names in the List
	return playerNames.count(player)
}

def readNumberOfPlayersHoldingItem(game, item) {
   return game[item].size()
}


def readItemName() {
	print('\tEnter item name: ')
	return Console.readLine()
}

def readPlayerName() {
	print('\tEnter player name: ')
	return Console.readLine()
}

def readMenuSelection() {
	println()
	println('0: Quit')
	println('1: Add new item')
	println('2: Remove item')
	println('3: Pick up item')
	println('4: Drop item')
	println('5: Display items')
	println('6: Display number of items being carried by a player')
	println('7: Display number of players carrying an item')
	
	print('\tEnter choice: ')
	return Console.readInteger()	
}

	// initialize the items in a game
def game = [
  'bread' : ['Chris', 'John'],
  'fork' : ['Chris'],
  'sword' : ['John', 'Sally'],
  'magic amulet' : ['Sally'],
  'apple' : []
]

def choice = readMenuSelection()

while (choice != 0)	{
	switch (choice) {
		case 1:
			addItem(game, readItemName())
			break
		case 2:
			removeItem(game, readItemName())
			break
		case 3:
			pickUpItem(game, 
				readItemName(), readPlayerName())
			break
		case 4:
			dropItem(game, 
				readItemName(), readPlayerName())
			break
		case 5:
			displayItems(game)
			break
		case 6:
			def player = readPlayerName()
			def count = 
			    readNumberOfItemsBeingCarried(game, player)
			println "\n${player} is carrying ${count} items\n"
			break
		case 7:
			def item = readItemName()
			def count = 
			    readNumberOfPlayersHoldingItem(game, item)
			println "\n${item} is being carried by ${count} players\n"
			break
		default:
			println('\nUnknown selection\n')
	}
	
	   // next selection
	choice = readMenuSelection()
}

println '\nGame closing'
