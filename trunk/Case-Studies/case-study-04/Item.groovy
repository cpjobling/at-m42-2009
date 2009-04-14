class Item {

    String toString() { // redefinition
        def s = "Item: ${id}; name = ${name}: value = ${value};"
        if ( description.size() > 0 ) {
            s += " description: ${description};"
        }
        return s
    }

// ----- properties -----------------------------

    def name
    def description = ''
    def id
    def value

}