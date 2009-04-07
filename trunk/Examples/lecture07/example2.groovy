// Two object instances

class Item {
    def name  // name of the item
    def value // value of the item in game points
}

    // Create two item instances
def sword = new Item(name : 'Magical sword', value : 1000)
def cloak = new Item(name : 'Cloak of invisibility', value : 500)
  // report on both
println "Item sword: ${sword.name} has value ${sword.value}."
println "Item cloak: ${cloak.name} has value ${cloak.value}."