// a game class

class Game {

Boolean addItem(Item item) {
        if ( ! inventory.containsKey(item.id) ) {
            inventory[item.id] = item
            return true
        } else {
            return false
        }
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