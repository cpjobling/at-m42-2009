// Game

class Game {
    
    void createItem(String name, Integer value, String description = '') {
        def item = new Item(name : name, value : value)
        if (description != '') {
            item.description = description
        }
        items[name] = item
    }
    
   
    void increaseValueOfItem(String name, Integer amount) {
        def item = this.findItem(name)
        if (item != null) {
            item.increaseValue(amount)
        }
    }
    
   void decreaseValueOfItem(String name, Integer amount) {
        def item = this.findItem(name)
        if (item != null) {
            item.reduceValue(amount)
        }
    }
    
    Integer getValueOfItem(String name) {
        def item = this.findItem(name)
        return (item == null) ? null : item.value
    }
    
    Integer getTotalValueOfItems() {
        def totalValue = 0
        items.each { name, item -> totalValue += item.value }
        return totalValue
    }
    
    Item findItem(name) {
        def item = items.find { entry -> entry.key == name }
        return (item == null) ? null : item.value
    }
    
    // See example 12
    void addItem(Item item) {
    	items[item.name] = item
    }
 
// ----properties -----------------------------

    def name             // name of game
    def items = [ : ]    // items in the game
    
}
    
        