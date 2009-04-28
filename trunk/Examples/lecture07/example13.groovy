// Abstract class

abstract class Item {

    String toString() { // redefines Object.toString()
        return "Item: ${name} has value ${value}"
    }
    
    Boolean hasDescription() {
        return ! (description == '')
    }

// ----- properties ----------------------------------

    def name  // name of the item
    def value // value of the item in game points
    def description = '' // a description of the item

}

// Inherited features

class WeightyItem extends Item {
    
    String toString() {
        return 'WeightyItem: ' + super.toString() + "; weight: ${weight}."
    }

// ---- properties -------------------------

    def weight = 0
}

class MagicalItem extends Item {

    String toString() {
        return 'MagicalItem: ' + super.toString() + "; potency: ${potency}."
    }

// ---- properties -------------------------

   def potency = 0
}

class Game {
    
    Item findItem(name) {
        def item = items.find { entry -> entry.key == name }
        return (item == null) ? null : item.value
    }
    
    // See example 12
    void addItem(Item item) {
        items[item.name] = item
    }
 
// ----properties -----------------------------

    def name             // name of game
    def items = [ : ]    // items in the game
    
}
    

def displayGame(game) {
    println "Game: ${game.name}"
    println '==========================='
    
    game.items.each { name, item -> 
        println "${item}"
        if (item.hasDescription()) {
            println item.description
        }
   }
}  

  // create a new Game object
def lotr = new Game(name : 'Lord of the Rings')

  // create some items
def ring = new MagicalItem(name : 'The One Ring', value : 1000, potency : 500)
def food = new WeightyItem(name : 'Rations', value : 10, weight : 20)
def dagger = new WeightyItem(name : 'Elvish Dagger', value: 50, weight: 2)

  // add them to the game
lotr.addItem(ring)
lotr.addItem(food)
lotr.addItem(dagger)

  // Now display them all
displayGame(lotr)

//def pipe = new Item(name : 'clay pipe', description : 'This pipe is excellent for smoking a good tobacco.', value : 0)
