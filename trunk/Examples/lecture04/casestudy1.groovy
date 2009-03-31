// Case study iteration 1: Adventure game location with List

// Initialise the dungeon location
def dungeon = [ ['Chris', 'Sword'],
                ['Chris', 'Food'],
                ['Jenny', 'Dagger']
              ]
              
// add two new items
dungeon << ['Jenny', 'Food']
dungeon.add(['Joe', 'Magic Wand'])

// print the location
println "Dungeon: ${dungeon}"

// Does Chris have a sword?
println "Player Chris has a sword? ${dungeon.contains(['Chris', 'Sword'])}"

// Print the number of items in the location
println "Number of items in the dungeon: ${dungeon.size()}"


