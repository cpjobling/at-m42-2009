// A player

class Player {
    
    Boolean pickUp(item) {
    	if ( ! inventory.containsKey(item.id) ) {
        	inventory[item.id] = item
        	item.pickedUpBy(this)
        	return true
        } else {
        	return false
        }
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