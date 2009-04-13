// item class

class Item {

    String toString() { // redefinition
        def s = "Item: ${id}; name = ${name}: value = ${value};"
        if ( description.size() > 0 ) {
            s += " description: ${description};"
        }
        return s
    }

    void pickedUpBy(Player player) {
        this.carrier = player
    }
    
    void dropped() {
        this.carrier = null        
    }
    
// ----- properties -----------------------------

    def name
    def description = ''
    def id
    def value
    def carrier

}