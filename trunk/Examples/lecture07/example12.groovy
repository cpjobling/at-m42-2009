// Polymorphism example

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
def pipe = new Item(name : 'clay pipe', description : 'This pipe is excellent for smoking a good tobacco.', value : 0)

  // add them to the game
lotr.addItem(ring)
lotr.addItem(food)
lotr.addItem(pipe)

  // Now display them all
displayGame(lotr)