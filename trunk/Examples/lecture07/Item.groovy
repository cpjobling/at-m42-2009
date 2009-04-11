// item

class Item {
    
    void increaseValue(Integer amount) {
        value += amount
    }
    
    void reduceValue(Integer amount) {
        if (value >= amount) { // only if result won't be negative
            value -= amount
        }
    }
    
    String toString() { // redefines Object.toString()
        return "Item: ${name} has value ${value}"
    }

	Boolean hasDescription() {
		return ! (description == '')
	}
	
    def name  // name of the item
    def value // value of the item in game points
    def description = '' // a description of the item

}