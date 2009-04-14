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
		
		def item = new Item(id : itemId, name : name, value : value,
		                    description : description,
		                    weight : weight)
		
		game.addItem(item)		
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
		
		def item = new Item(id : itemId, name : name, value : value,
		                    description : description,
		                    potency : potency)
		
		game.addItem(item)		
	}
	
    void displayInventory() {
        println "\n\nGame: ${game.name}"
        println "=========================================="
        
        game.inventory.each { id, item -> println "  ${item}" }
    }	
    
    void displayAvailableItems() {
        println "\n\nGame: ${game.name} : Available items"
        println "=========================================="
        
        game.inventory.each { id, item -> 
            if (item.carrier == null) {
                println "  ${item}" 
            }
        }                
    }    

    void displayItemsBeingCarried() {
        println "\n\nGame: ${game.name} : Items being carried"
        println "=========================================="
        
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

		game.registerPlayer(player)
    }
    
    void displayPlayers() {
        println "\n\nGame: ${game.name} : Player Details"
        println "=========================================="
        
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
        game.pickupItem(itemId, playerId)
    }
    
    void dropItem() {
    	print '\nEnter item id: '
    	def itemId = Console.readInteger()
        game.dropItem(itemId)
    }
    
// ----- properties -----------------------

	def game

}