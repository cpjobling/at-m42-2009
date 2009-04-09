// A simple adventure game: implemented with closures

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

    // initialize the items in a game
def game = [
  'bread' : ['Chris', 'John'],
  'fork' : ['Chris'],
  'sword' : ['John', 'Sally'],
  'magic amulet' : ['Sally'],
  'apple' : []
]

def doAddItem = { addItem(game, readItemName()) }

def doRemoveItem = { removeItem(game, readItemName()) }

def doPickupItem = { pickUpItem(game, readItemName(), readPlayerName()) }

def doDropItem = { dropItem(game, readItemName(), readPlayerName()) }

def doDisplayItems = { displayItems(game) }

def doDisplayNumberOfItemsBeingCarriedByPlayer = { 
    def player = readPlayerName()
    def count = readNumberOfItemsBeingCarried(game, player)
    println "\n${player} is carrying ${count} items\n"
}

def doDisplayNumberOfPlayersCarryingItem  = {  
    def item = readItemName()
    def count = readNumberOfPlayersHoldingItem(game, item)
    println "\n${item} is being carried by ${count} players\n"
}

def menu = [
    1: doAddItem,
    2: doRemoveItem,
    3: doPickupItem,
    4: doDropItem,
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