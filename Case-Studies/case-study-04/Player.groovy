class Player {
    
    Boolean pickUp(Item item) {
    	if (! inventory.containsKey(item.id)) {
	        inventory[item.id] = item
    	    item.pickedUpBy(this)
    	    return true
    	}
    	else {
    		return false
    	}
    }
    
    Boolean drop(Item item) {
    	if (inventory.containsKey(item.id)) {
        	inventory.remove(item.id)
        	item.dropped()
        	return true
        }
        else {
        	return false
        }
    }
    
    String toString() {
        return "Player: ${id}; ${nickname} (${email})"
    }
    
// ----- properties -----------------------------

    def nickname
    def email
    def id
    static public final LIMIT = 4
    def inventory = [ : ]

}