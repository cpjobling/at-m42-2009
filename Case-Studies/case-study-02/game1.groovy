// A simple adventure game

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


// Test cases

	// initialize the items in a game
def game = [
  'bread' : ['Chris', 'John'],
  'fork' : ['Chris'],
  'sword' : ['John', 'Sally'],
  'magic amulet' : ['Sally'],
  'apple' : []
]

	// Test case: Display items in a game
println 'Test case: Display items in a game'
displayItems(game)

	// Test Case: Add a new item
println 'Test Case: Add a new item'
addItem(game, 'knife')
displayItems(game)

	// Test Case: Remove an item
println 'Test Case: Remove an item'
removeItem(game, 'knife')
displayItems(game)

	// Test Case: player picks up an item
println 'Test Case: player picks up an item'
pickUpItem(game, 'apple', 'Chris')
displayItems(game)

	// Test Case: player drops an item
println 'Test Case: player drops an item'
dropItem(game, 'apple', 'Chris')
displayItems(game)

	// Test Case: Display the number of items being carried by a player
println 'Test Case: Display the number of items being carried by a player'
println "Number of items being carried by Chris: ${readNumberOfItemsBeingCarried(game, 'Chris')}\n"

	// Test Case: Display the number of carriers of an item
println 'Test Case: Display the number of carriers of an item'
println "Number of players carrying a sword: ${readNumberOfPlayersHoldingItem(game, 'sword')}\n"

