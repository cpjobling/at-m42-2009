// Inherited features

class WeightyItem extends Item {
    
    String toString() {
        return 'WeightyItem: ' + super.toString() + "; weight: ${weight}"
    }

// ---- properties -------------------------

    def weight = 0
}

  // populate a list with weighty items
def items = [new WeightyItem(name : 'Magical sword', value : 1000, weight : 10),
             new WeightyItem(name : 'Cloak of invisibility', value : 500),
             new Item(name : 'Magic Amulet', value : 700) ]

items.each { item ->
    println item    // automatically call toString
}

def wine = new WeightyItem(name : 'A Flagon of Wine', value : 2, weight : 2)

    // use methods and inherited methods
println "Weight: ${wine.weight}"
println "Name: ${wine.name}"

def spell = new Item(name : 'A Magic Spell', value: 10)
println "Name: ${spell.name}"        // OK
//println "Weight: ${spell.weight}"  // ERROR: no such property