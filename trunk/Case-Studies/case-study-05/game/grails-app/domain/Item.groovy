class Item {

    static constraints = {
    	name(blank:false)
    	description(maxSize:1000)
    	weight(min:0, max:150)
    }
    
    String name
    String description
    Integer weight
    
    String toString() { return "${name}" }
    
}
