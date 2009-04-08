// Redefining the toString method

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

    // Populate a list with the instances
def items = [new Item(name : 'Magical sword', value : 1000),
             new Item(name : 'Cloak of invisibility', value : 500),
             new Item(name : 'Amulet of protection', value : 700)]

   // now display each
items.each { item ->
    println item // automatically calls toString
}