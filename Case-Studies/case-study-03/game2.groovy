// Augmented Model

class Item {

    String toString() { // redefinition
        def s = "Item: ${id}; name = ${name}: value = ${value};"
        if ( description.size() > 0 ) {
            s += " description: ${description};"
        }
        return s
    }
    
    void pickedUpBy(Player player) {
        this.carrier = player
    }
    
    void dropped() {
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
    
    void pickUp(Item item) {
        inventory[item.id] = item
        item.pickedUpBy(this)
    }
    
    void drop(item) {
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

    void addItem(Item item) {
        inventory[item.id] = item
    }

    void displayInventory() {
        println "\n\nGame: ${name}"
        println "=========================================="
        
        inventory.each { id, item -> println "  ${item}" }
    }

    void displayAvailableItems() {
        println "\n\nGame: ${name} : Available items"
        println "=========================================="
        
        inventory.each { id, item -> 
            if (item.carrier == null) {
                println "  ${item}" 
            }
        }                
    }    
    
    void displayItemsBeingCarried() {
        println "\n\nGame: ${name} : Items being carried"
        println "=========================================="
        
        inventory.each { id, item -> 
            if (item.carrier != null) {
                println "  ${item}" 
            }
        }                
    }    
    
    void registerPlayer(Player player) {
        players[player.id] = player
    }
    
    void displayPlayers() {
        println "\n\nGame: ${name} : Player Details"
        println "=========================================="
        
        players.each { id, player -> 
            println "  ${player}"
            player.inventory.each { playerId, item -> println "    ${item}" }
        }                    
    }
        
    void pickupItem(Integer itemId, Integer playerId) {
        def inventoryEntry = inventory.find { entry -> entry.key == itemId }
        def playersEntry = players.find { entry -> entry.key == playerId }
        
        playersEntry.value.pickUp(inventoryEntry.value)
    }
    
    void dropItem(Integer itemId) {
        def inventoryEntry = inventory.find { entry -> entry.key == itemId }
        def player = inventoryEntry.value.carrier
        player.drop(inventoryEntry.value)
    }
        
// ----- properties -----------------------------

    def name
    def inventory = [ : ]
    def players = [ : ]

}

   // Create a game object
def discworld = new Game(name : 'The Discworld')

  // Create some items
def luggage = new Item(id : 1, name : 'Luggage', value : 1000,
    description : 'Sentient pear wood with lots of little legs')
def hat = new Item(id : 2, name : 'Pointy hat', value : 10)
def gold = new Item(id : 3, name : 'A bag of gold', value : 100)

  // add them to the inventory
discworld.addItem(luggage)
discworld.addItem(hat)
discworld.addItem(gold)

  // See inventory
discworld.displayInventory()

  // introduce some players
rincewind = new Player(id : 1, nickname : 'Rincewind', 
                       email : 'p1@diskworld.com')
twoflower = new Player(id : 2, nickname : 'Twoflower', 
                       email : 'p2@diskworld.com')    
                       
discworld.registerPlayer(rincewind)
discworld.registerPlayer(twoflower)

  // See players
discworld.displayPlayers()

  // Make some transactions
discworld.displayAvailableItems()

discworld.pickupItem(1, 1)
discworld.pickupItem(2, 2)

discworld.displayAvailableItems()
discworld.displayItemsBeingCarried()
discworld.displayPlayers()

discworld.dropItem(2)

discworld.displayAvailableItems()
discworld.displayItemsBeingCarried()
discworld.displayPlayers()