import console.Console

class Action {

	void addWeightyItem() {
		print('\nEnter item id: ')
		def itemId = Console.readInteger()
		print('\nEnter item name: ')
		def name = Console.readLine()
		print('\nEnter item value: ')
		def value = Console.readInteger()	
		print('\nEnter item description (return for none): ')
		def description = Console.readLine()
		print('\nEnter item weight: ')
		def weight = Console.readInteger()
		
		def item = new WeightyItem(id : itemId, name : name, value : value,
		                    description : description,
		                    weight : weight)
		
		def message = game.addItem(item)
		println "\nResult: ${message}"		
	}
	
	void addMagicalItem() {
		print('\nEnter item id: ')
		def itemId = Console.readInteger()
		print('\nEnter item name: ')
		def name = Console.readLine()
		print('\nEnter item value: ')
		def value = Console.readInteger()	
		print('\nEnter item description (return for none): ')
		def description = Console.readLine()
		print('\nEnter item potency: ')
		def potency = Console.readInteger()
		
		def item = new MagicalItem(id : itemId, name : name, value : value,
		                    description : description,
		                    potency : potency)
			
		def message = game.addItem(item)
		println "\nResult: ${message}"		
	}
	
    void displayInventory() {
        this.printHeader('')
        
        game.inventory.each { id, item -> println "  ${item}" }
    }	
    
    void displayAvailableItems() {
        this.printHeader('Available items')
        
        game.inventory.each { id, item -> 
            if (item.carrier == null) {
                println "  ${item}" 
            }
        }                
    }    

    void displayItemsBeingCarried() {
        this.printHeader('Items being carried')
        
        game.inventory.each { id, item -> 
            if (item.carrier != null) {
                println "  ${item}" 
            }
        }                
    }    

    void registerPlayer() {
    	print('\nEnter player id: ')
		def playerId = Console.readInteger()
		print('\nEnter player nickname: ')
		def nickname = Console.readLine()
		print('\nEnter player email address: ')
		def email = Console.readLine()	
		
		def player = new Player(id : playerId, nickname : nickname, 
		                        email : email)

		def message = game.registerPlayer(player)
		println "\nResult: ${message}"	
    }
    
    void displayPlayers() {
        this.printHeader('Player Details')
        
        game.players.each { id, player -> 
            println "  ${player}"
            player.inventory.each { playerId, item -> println "    ${item}" }
        }                    
    }

    void pickupItem() {
    	print '\nEnter item id: '
    	def itemId = Console.readInteger()
    	print '\nEnter player id: '
    	def playerId = Console.readInteger()
        
    	def message = game.pickupItem(itemId, playerId)
        println "\nResult: ${message}"	
    }
    
    void dropItem() {
    	print '\nEnter item id: '
    	def itemId = Console.readInteger()
        
    	def message = game.dropItem(itemId)
        println "\nResult: ${message}"	
    }
    
    def removePublication() {
    	print('\nEnter item id: ')
    	def itemId = Console.readInteger()
    	
    	def message = game.removeItem(itemId)
    	println "\nResult: ${message}"
    }
    
    def displayOneItem() {
    	print('\nEnter item id: ')
    	def itemId = Console.readInteger()
    	
    	def item = game.inventory[itemId]
    	if ( item != null ) {
    		this.printHeader('One item display')
    		println item
    	}
    	else {
    		println '\nCannot print: no such item\n'
    	}
    }
    
    def displaySelectedItems() {
    	print('\nEnter start of item ids: ')
    	def pattern = Console.readLine()
    	pattern = '^' + pattern + '.*'
    	def found = false
    	
    	this.printHeader('Selected publications display')
    	game.inventory.each { itemId, item -> 
    		if ( itemId.toString() =~ pattern ) {
    			found = true
    			println " ${item}" 
    		}
    	}
    	
    	if (found == false) {
    		println '\nCannot print: No such publications\n'
    	}
    }
    	
    def displayOnePlayer() {
    	print('\nEnter player id: ')
    	def playerId = Console.readInteger()
    	
    	def player = game.players[playerId]
    	if ( player != null ) {
    		this.printHeader('One player display')
    		println player
    		def items = player.inventory
    		items.each { id, item -> println " ${item}" }
    	}
    	else {
    		println '\nCannot print: no such player\n'
    	}
    }
    
    def displaySelectedPlayers() {
    	print('\nEnter start of player ids: ')
    	def pattern = Console.readLine()
    	pattern = '^' + pattern + '.*'
    	def found = false
    	
    	this.printHeader('Selected players display')
    	game.players.each { playerId, player -> 
    		if ( playerId.toString() =~ pattern ) {
    			found = true
    			println player
    			def items = player.inventory
    			items.each { itemId, item -> println " ${item}" }
    		}
    	}
    	
    	if (found == false) {
    		println '\nCannot print: No such borrowers\n'
    	}
    }	
    
    private printHeader(detail) {
    	println "\nGame: ${game.name}: ${detail}"
    	println '===============================\n'
    }
    
// ----- properties -----------------------

	private game

}