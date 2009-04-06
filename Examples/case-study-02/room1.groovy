// A simple adventure game

    // The methods
def addItem(room, item) {
    room[item] = []
}

def removeItem(room, item) {
	room.remove(item)
}

def pickUpItem(room, item, player) {
	room[item] << player
}

def dropItem(room, item, player) {
	room[item].remove(player)
}

def displayItems(room) {
	println "The room contains: ${room} \n"
}

def readNumberOfItemsBeingCarried(room, player) {
	
	// get a List of each List of the players from the room
	def playerNames = room.values().asList()
	
	// create a single list fo the players' names
	playerNames = playerNames.flatten()
	
	// return the number of palyer names in the List
	return playerNames.count(player)
}

def readNumberOfPlayersHoldingItem(room, item) {
   return room[item].size()
}


// Test cases

	// initialize the items in a room
def banquetingRoom = [
  'bread' : ['Chris', 'John'],
  'fork' : ['Chris'],
  'sword' : ['John', 'Sally'],
  'magic amulet' : ['Sally'],
  'apple' : []
]

	// Test case: Display items in a room
println 'Test case: Display items in a room'
displayItems(banquetingRoom)

	// Test Case: Add a new item
println 'Test Case: Add a new item'
addItem(banquetingRoom, 'knife')
displayItems(banquetingRoom)

	// Test Case: Remove an item
println 'Test Case: Remove an item'
removeItem(banquetingRoom, 'knife')
displayItems(banquetingRoom)

	// Test Case: player picks up an item
println 'Test Case: player picks up an item'
pickUpItem(banquetingRoom, 'apple', 'Chris')
displayItems(banquetingRoom)

	// Test Case: player drops an item
println 'Test Case: player drops an item'
dropItem(banquetingRoom, 'apple', 'Chris')
displayItems(banquetingRoom)

	// Test Case: Display the number of items being carried by a player
println 'Test Case: Display the number of items being carried by a player'
println "Number of items being carried by Chris: ${readNumberOfItemsBeingCarried(banquetingRoom, 'Chris')}\n"

	// Test Case: Display the number of carriers of an item
println 'Test Case: Display the number of carriers of an item'
println "Number of players carrying a sword: ${readNumberOfPlayersHoldingItem(banquetingRoom, 'sword')}\n"

