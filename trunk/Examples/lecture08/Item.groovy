// item class

class Item {

    String toString() { // redefinition
        def s = "Item: ${id}; name = ${name}: value = ${value};"
        if ( description.size() > 0 ) {
            s += " description: ${description};"
        }
        return s
    }

    def pickedUpBy(player) {
        this.carrier = player
    }
    
    def dropped() {
        this.carrier = null        
    }
    
// ----- properties -----------------------------

    def name
    def description = ''
    def id
    def value
    def carrier

}