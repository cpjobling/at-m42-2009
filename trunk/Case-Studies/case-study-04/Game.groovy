class Game {

    Boolean addItem(Item item) {
        if (! inventory.containsKey(item.id) ) {
        	inventory[item.id] = item
        	return true
        } else {
        	return false
        }
        
    }

    void registerPlayer(Player player) {
        players[player.id] = player
    }

    void pickupItem(Integer itemId, Integer playerId) {
        def inventoryEntry = inventory.find { entry -> entry.key == itemId }
        def playersEntry = players.find { entry -> entry.key == playerId }   
        playersEntry.value.pickUp(inventoryEntry.value)
    }
    
    void dropItem(Integer itemId) {
        def inventoryEntry = inventory.find { entry -> entry.key == itemId }
        def player = inventoryEntry.value.carrier
        player.drop(inventoryEntry.value)
    }
        
// ----- properties -----------------------------

    def name
    def inventory = [ : ]
    def players = [ : ]

}