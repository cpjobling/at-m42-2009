// A simple groovy class

class Item {
    def name  // name of the item
    def value // value of the item in game points
}

    // Create a new item instance
def sword = new Item(name : 'Magical sword', value : 1000)

   // Validate the state
assert sword.name == 'Magical sword'
assert sword.value == 1000
println "Item sword: ${sword.name} has value ${sword.value}."