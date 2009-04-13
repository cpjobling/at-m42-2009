// a game class

class Game {

    void addItem(Item item) {
        inventory[item.id] = item
    }

    void displayInventory() {
        println "Game: ${name}"
        println "====================="
        
        inventory.each { id, item -> println item }
    }
    
// ----- properties -----------------------------

    def name
    def inventory = [ : ]

}