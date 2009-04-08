// character

class Game {
    
    def createItem(name, value, description = '') {
        def item = new Item(name : name, value : value)
        if (description != '') {
            item.description = description
        }
        items[name] = item
    }
    
    def increaseValueOfItem(name, amount) {
        def item = this.findItem(name)
        if (item != null) {
            item.increaseValue(amount)
        }
    }
    
   def decreaseValueOfItem(name, amount) {
        def item = this.findItem(name)
        if (item != null) {
            item.reduceValue(amount)
        }
    }
    
    def getValueOfItem(name) {
        def item = this.findItem(name)
        return (item == null) ? null : item.value
    }
    
    def getTotalValueOfItems() {
        def totalValue = 0
        items.each { name, item -> totalValue += item.value }
        return totalValue
    }
    
    def findItem(name) {
        def item = items.find { entry -> entry.key == name }
        return (item == null) ? null : item.value
    }
    
// ----properties -----------------------------

    def name             // name of game
    def items = [ : ]    // items in the game
    
}
    
        