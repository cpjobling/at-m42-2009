class MagicalItem extends Item {

    String toString() { 
        return 'MagicalItem: ' + super.toString() + 
               " with potency: ${potency}"
    }

// ----- properties -----------------------------

    def potency
    
}