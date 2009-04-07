// A simple groovy class

class Item {
    def name  // name of the item
    def value // value of the item in game points
}

    // Create a new item instance
def item = new Item(name : 'Magical Sword', value : 1000)

   // display its state values
println "Item: ${item.name} has value ${item.value}."