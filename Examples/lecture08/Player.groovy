// A player

class Player {
    
    def pickUp(item) {
        inventory[item.id] = item
        item.pickedUpBy(this)
    }
    
    def drop(item) {
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