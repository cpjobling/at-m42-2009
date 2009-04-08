// Using the implicit getter and setter methods

class Item {
    def name  // name of the item
    def value // value of the item in game points
}

    // Create two instances
def sword = new Item(name : 'Magical sword', value : 1000)
def cloak = new Item(name : 'Cloak of invisibility', value : 500)

  // access the state using properties
println "Item cloak: ${sword.name} has value ${sword.value}."

  // access the state using getters
println "Item cloak: ${cloak.getName()} has value ${cloak.getValue()}."

  // modify the state using a property
sword.value = sword.value - 100
println "Item sword: ${sword.getName()} now has value ${sword.getValue()}."

  // modify the state using a setter
cloak.setValue(cloak.getValue() + 100)
println "Item cloak: ${cloak.getName()} now has value ${cloak.value}."