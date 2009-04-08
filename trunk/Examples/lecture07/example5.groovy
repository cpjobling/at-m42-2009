// List of items

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
    
    String toString() { // redefines Object.toString()
        return "Item: ${name} has value ${value}"
    }

}

    // Create some instances
def sword = new Item(name : 'Magical sword', value : 1000)
def cloak = new Item(name : 'Cloak of invisibility', value : 500)
def amulet = new Item(name : 'Amulet of protection', value : 700)

   // populate a list with the instances
def items = [sword, cloak, amulet]

   // now display each
items.each { item ->
    println item.toString()
}