// A simple adventure game

    // The methods
def addItem(location, item) {
    location[item] = []
}

def removeItem(location, item) {
	location.remove(item)
}

def pickUpItem(location, item, player) {
	location[item] << player
}

def dropItem(location, item, player) {
	location[item].remove(player)
}

def displayItems(location) {
	println "The location contains: ${location} \n"
}

def readNumberOfItemsBeingCarried(location, player) {
	
	// get a List of each List of the players from the location
	def playerNames = location.values().asList()
	
	// create a single list fo the players' names
	playerNames = playerNames.flatten()
	
	// return the number of palyer names in the List
	return playerNames.count(player)
}

def readNumberOfPlayersHoldingItem(location, item) {
   return location[item].size()
}


// Test cases

	// initialize the items in a location
def location = [
  'bread' : ['Chris', 'John'],
  'fork' : ['Chris'],
  'sword' : ['John', 'Sally'],
  'magic amulet' : ['Sally'],
  'apple' : []
]

	// Test case: Display items in a location
println 'Test case: Display items in a location'
displayItems(location)

	// Test Case: Add a new item
println 'Test Case: Add a new item'
addItem(location, 'knife')
displayItems(location)

	// Test Case: Remove an item
println 'Test Case: Remove an item'
removeItem(location, 'knife')
displayItems(location)

	// Test Case: player picks up an item
println 'Test Case: player picks up an item'
pickUpItem(location, 'apple', 'Chris')
displayItems(location)

	// Test Case: player drops an item
println 'Test Case: player drops an item'
dropItem(location, 'apple', 'Chris')
displayItems(location)

	// Test Case: Display the number of items being carried by a player
println 'Test Case: Display the number of items being carried by a player'
println "Number of items being carried by Chris: ${readNumberOfItemsBeingCarried(location, 'Chris')}\n"

	// Test Case: Display the number of carriers of an item
println 'Test Case: Display the number of carriers of an item'
println "Number of players carrying a sword: ${readNumberOfPlayersHoldingItem(location, 'sword')}\n"

