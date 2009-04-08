// Class methods

class Item {
    def name  // name of the item
    def value // value of the item in game points
    
    def increaseValue(amount) {
        value += amount
    }
    
    def reduceValue(amount) {
        if (value >= amount) { // only if result won't be negative
            value -= amount
        }
    }
    
    def display() {
        println "Item: ${name} has value ${value}"
    }

}

    // Create a new instance
def sword = new Item(name : 'Magical sword', value : 1000)
sword.display()

   // raise value
sword.increaseValue(200)
sword.display()

  // other transactions
sword.reduceValue(800)    // value now 400
sword.reduceValue(500)    // value remains unchanged at 400
sword.display()