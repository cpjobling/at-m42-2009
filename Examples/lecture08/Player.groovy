// A player

class Player {
    
    void pickUp(Item item) {
        inventory[item.id] = item
        item.pickedUpBy(this)
    }
    
    void drop(Item item) {
        inventory.remove(item.id)
        item.dropped()
    }
    
    String toString() {
        return "Player: ${id}; ${nickname} (${email})"
    }
    
// ----- properties -----------------------------

    def nickname
    def email
    def id
    def inventory = [ : ]

}