class Game {

    String addItem(Item item) {
    	def message
        if (! inventory.containsKey(item.id) ) {
        	inventory[item.id] = item
        	message = 'Item added'
        } 
        else {
        	message = 'Cannot add: item already present'
        }
        return message
    }

    String removeItem(Integer itemId) {
    	def message
        if ( inventory.containsKey(itemId) == true ) {
        	def item = inventory[itemId]
        	//
        	//note: use of safe navigation
            item.carrier?.drop(item)
            item.carrier = null
        	inventory.remove(itemId)
        	message = 'Item removed'
        } 
        else {
        	message = 'Cannot remove: item not present'
        }
        return message
    }
    
    String registerPlayer(Player player) {
    	def message
        if ( players.containsKey(player.id) == false ) {
        	players[player.id] = player
        	message = 'Player registered'
        }
        else {
        	message = 'Cannot register: player already registered'
        }
        return message
    }

    String pickupItem(Integer itemId, Integer playerId) {
        def message
        if ( inventory.containsKey(itemId) == true ) {
        	def item = inventory[itemId]
        	if ( item.carrier == null ) {
        		if ( players.containsKey(playerId) == true ) {
        			def player = players[playerId]
        			player.pickUp(item)
        			message = 'Item picked up'
        		}
        		else {
        			message = 'Cannot pick up: player not registered'
        		}
        	} 
        	else {
        		message = 'Cannot pick up: item already being carried'
        	}
        }
        else {
        		message = 'Cannot pick up: item not present'
        }
        return message
    }
    
    String dropItem(Integer itemId) {
    	def message
        if ( inventory.containsKey(itemId) == true ) {
        	def item = inventory[itemId]
        	if ( item.carrier != null ) {
        		item.carrier.drop(item)
        		message = 'Item dropped'
        	}
        	else {
        		message = 'Cannot drop: item not being carried'
        	}
        }
        else {
        	message = 'Cannot drop: item not present'
        } 
    }
        
// ----- properties -----------------------------

    def name
    def inventory = [ : ]
    def players = [ : ]

}