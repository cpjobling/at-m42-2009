class MockPlayer extends Player {
    
    Boolean pickUp(Item item) {
    	if (! inventory.containsKey(item.id)) {
    	    // 
    	    // Normal behviour commented out
	        // inventory[item.id] = item
    	    item.pickedUpBy(this)
    	    return true
    	}
    	else {
    		return false
    	}
    }

}