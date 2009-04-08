// Class inheritance

class WeightyItem extends Item {
    
    String toString() {
        return "WeightyItem: ${name}; value: ${value}; weight: ${weight}"
    }

// ---- properties -------------------------

    def weight = 0
}

  // populate a list with weighty items
def items = [new WeightyItem(name : 'Magical sword', value : 1000, weight : 10),
             new WeightyItem(name : 'Cloak of invisibility', value : 500),
             new Item(name : 'Magic Amulet', value : 700) ]

items.each { item ->
    println item
}