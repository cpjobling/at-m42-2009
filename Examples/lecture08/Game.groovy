// a game class

class Game {

    def addItem(item) {
        inventory[item.id] = item
    }

    def displayInventory() {
        println "Game: ${name}"
        println "====================="
        
        inventory.each { id, item -> println item }
    }
    
// ----- properties -----------------------------

    def name
    def inventory = [ : ]

}