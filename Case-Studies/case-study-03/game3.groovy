// Reimplement the user interface

import console.Console

class Item {

    String toString() { // redefinition
        def s = "Item: ${id}; name = ${name}: value = ${value};"
        if ( description.size() > 0 ) {
            s += " description: ${description};"
        }
        return s
    }
    
    def pickedUpBy(player) {
        this.carrier = player
    }
    
    def dropped() {
        this.carrier = null        
    }

// ----- properties -----------------------------

    def name
    def description = ''
    def id
    def value
    def carrier = null

}

class Player {
    
    def pickUp(item) {
        inventory[item.id] = item
        item.pickedUpBy(this)
    }
    
    def drop(item) {
        inventory.remove(item.id)
        item.dropped()
    }
    
    String toString() {
        return "Player: ${id}; ${nickname} (${email})"
    }
    
// ----- properties -----------------------------

    def nickname
    def email
    def id
    def inventory = [ : ]

}

class Game {

    def addItem(item) {
        inventory[item.id] = item
    }

    def registerPlayer(player) {
        players[player.id] = player
    }

    def pickupItem(itemId, playerId) {
        def inventoryEntry = inventory.find { entry -> entry.key == itemId }
        def playersEntry = players.find { entry -> entry.key == playerId }   
        playersEntry.value.pickUp(inventoryEntry.value)
    }
    
    def dropItem(itemId) {
        def inventoryEntry = inventory.find { entry -> entry.key == itemId }
        def player = inventoryEntry.value.carrier
        player.drop(inventoryEntry.value)
    }
        
// ----- properties -----------------------------

    def name
    def inventory = [ : ]
    def players = [ : ]

}

class Action {

	def addItem() {
		print('\nEnter item id: ')
		def itemId = Console.readInteger()
		print('\nEnter item name: ')
		def name = Console.readLine()
		print('\nEnter item value: ')
		def value = Console.readLine()	
		print('\nEnter item description (return for none): ')
		def description = Console.readLine()
		
		def item = new Item(id : itemId, name : name, value : value,
		                    description : description)
		
		game.addItem(item)		
	}
	
    def displayInventory() {
        println "\n\nGame: ${game.name}"
        println "=========================================="
        
        game.inventory.each { id, item -> println "  ${item}" }
    }	
    
    def displayAvailableItems() {
        println "\n\nGame: ${game.name} : Available items"
        println "=========================================="
        
        game.inventory.each { id, item -> 
            if (item.carrier == null) {
                println "  ${item}" 
            }
        }                
    }    

    def displayItemsBeingCarried() {
        println "\n\nGame: ${game.name} : Items being carried"
        println "=========================================="
        
        game.inventory.each { id, item -> 
            if (item.carrier != null) {
                println "  ${item}" 
            }
        }                
    }    

    def registerPlayer() {
    	print('\nEnter player id: ')
		def playerId = Console.readInteger()
		print('\nEnter player nickname: ')
		def nickname = Console.readLine()
		print('\nEnter player email address: ')
		def email = Console.readLine()	
		
		def player = new Player(id : playerId, nickname : nickname, 
		                        email : email)

		game.registerPlayer(player)
    }
    
    def displayPlayers() {
        println "\n\nGame: ${game.name} : Player Details"
        println "=========================================="
        
        game.players.each { id, player -> 
            println "  ${player}"
            player.inventory.each { playerId, item -> println "    ${item}" }
        }                    
    }

    def pickupItem() {
    	print '\nEnter item id: '
    	def itemId = Console.readInteger()
    	print '\nEnter player id: '
    	def playerId = Console.readInteger()
        game.pickupItem(itemId, playerId)
    }
    
    def dropItem() {
    	print '\nEnter item id: '
    	def itemId = Console.readInteger()
        game.dropItem(itemId)
    }
    
// ----- properties -----------------------

	def game

}

def readMenuSelection() {
	println()
	println('0: Quit')
	println('1: Add new item')
	println('2: Display inventory')
	println('3: Display available items')
	println('4: Display items being carried')
	println('5: Register new player')
	println('6: Display players')
	println('7: Pick up an item')
	println('8: Drop an item')
	
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
			action.addItem()
			break
		case 2:
			action.displayInventory()
			break
		case 3:
			action.displayAvailableItems()
			break
		case 4:
			action.displayItemsBeingCarried()
			break
		case 5:
			action.registerPlayer()
			break
		case 6:
			action.displayPlayers()
			break
		case 7:
			action.pickupItem()
			break
		case 8:
			action.dropItem()
			break
		default:
			println "Unknown selection"
	}
	choice = readMenuSelection()
}
println '\n\nGame closing ... thanks for playing'
