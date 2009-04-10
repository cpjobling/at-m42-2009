// A constructor method

class Item {
    
    def Item(name, value) { // constructor method
        this.name = name
        this.value = value
    }
    
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

    def name  // name of the item
    def value // value of the item in game points

}

    // Populate a list with the instances
def items = [new Item('Magical sword', 1000),
             new Item('Cloak of invisibility', 500),
             new Item('Amulet of protection', 700)]

   // now display each
items.each { item ->
    println item // automatically calls toString
}

//def grail = new Item(name : 'Holy Grail', value : 10000) // no matching constructor