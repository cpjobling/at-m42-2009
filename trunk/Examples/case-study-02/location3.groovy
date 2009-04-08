// A simple adventure game: implemented with closures

import console.*

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


def readItemName() {
    print('\tEnter item name: ')
    return Console.readLine()
}

def readPlayerName() {
    print('\tEnter player name: ')
    return Console.readLine()
}

    // initialize the items in a location
def location = [
  'bread' : ['Chris', 'John'],
  'fork' : ['Chris'],
  'sword' : ['John', 'Sally'],
  'magic amulet' : ['Sally'],
  'apple' : []
]

def doAddItem = { addItem(location, readItemName()) }

def doRemoveItem = { removeItem(location, readItemName()) }

def doPickupItem = { pickUpItem(location, readItemName(), readPlayerName()) }

def doDroupItem = { dropItem(location, readItemName(), , readPlayerName()) }

def doDisplayItems = { displayItems(location) }

def doDisplayNumberOfItemsBeingCarriedByPlayer = { 
    def player = readPlayerName()
    def count = readNumberOfItemsBeingCarried(location, player)
    println "\n${player} is carrying ${count} items\n"
}

def doDisplayNumberOfPlayersCarryingItem  = {  
    def item = readItemName()
    def count = readNumberOfPlayersHoldingItem(location, item)
    println "\n${item} is being carried by ${count} players\n"
}

def menu = [
    1: doAddItem,
    2: doRemoveItem,
    3: doPickupItem,
    4: doDroupItem,
    5: doDisplayItems,
    6: doDisplayNumberOfItemsBeingCarriedByPlayer,
    7: doDisplayNumberOfPlayersCarryingItem,
]

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



def choice = readMenuSelection()

while (choice != 0)    {
    menu[choice].call()
    choice = readMenuSelection()
}

println '\nGame closing'