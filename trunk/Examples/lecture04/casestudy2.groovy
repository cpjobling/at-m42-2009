// Case study iteration 2: Adventure game location with Map

// Initialise the dungeon location
def dungeon = [ 'Chris':  ['Sword', 'Food'],
                'Jenny': ['Dagger']
              ]
              
// add a new player
dungeon['Joe'] = ['Magic Wand']

// update an existing player
dungeon['Jenny'] = dungeon['Jenny'] << 'Food'

// display the data in various ways
println "Dungeon: ${dungeon}"

println "Player Chris has a sword? ${dungeon['Chris'].contains('Sword')}"

println "Number of items in the dungeon: ${dungeon.size()}"

println "Players: ${dungeon.keySet().sort()}"

println "Number of items being carried by Chris: ${dungeon['Chris'].size()}"

