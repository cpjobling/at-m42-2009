class Item {

    String toString() { // redefinition
        def s = "Item: ${id}; name = ${name}: value = ${value};"
        if ( description.size() > 0 ) {
            s += " description: ${description};"
        }
        return s
    }

// ----- properties -----------------------------

    def name
    def description = ''
    def id
    def value

}

class Game {

    def addItem(item) {
        inventory[item.id] = item
    }

    def displayInventory() {
        println "Game: ${name}"
        println "====================="
        
        inventory.each { id, item -> println item }
    }
    
// ----- properties -----------------------------

    def name
    def inventory = [ : ]

}

   // Create a game object
def discworld = new Game(name : 'The Discworld')

  // Create some items
def luggage = new Item(id : '111', name : 'Luggage', value : 1000,
    description : 'Sentient pearwood with lots of little legs')
def hat = new Item(id : '222', name : 'Pointy hat', value : 10)
def gold = new Item(id : '333', name : 'A bag of gold', value : 100)

  // add them to the inventory
discworld.addItem(luggage)
discworld.addItem(hat)
discworld.addItem(gold)

  // See inventory
discworld.displayInventory()
    