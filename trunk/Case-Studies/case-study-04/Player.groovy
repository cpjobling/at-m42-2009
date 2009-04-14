// A player

class Player {
    
    String pickUp(Item item) {
    	def message 
    	if ( ! inventory.containsKey(item.id) ) {
        	inventory[item.id] = item
        	item.pickedUpBy(this)
        	message = 'Item picked up'
        } else {
        	message = 'Cannot pick up: already carrying item'
        }
        return message
    }
    
    String drop(Item item) {
    	def message
    	if ( inventory.containsKey(item.id) == true ) {
        	inventory.remove(item.id)
        	item.dropped()
        	message = 'Item dropped'
        }
        else {
        	message = 'Cannot drop: no such item'
        }
        return message
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