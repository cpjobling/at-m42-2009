class WeightyItem extends Item {

    String toString() { 
        return 'WeightyItem: ' + super.toString() + 
               " with weight: ${weight}"
    }

// ----- properties -----------------------------

    def weight
    
}