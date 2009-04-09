// Case study iteration 2: Adventure game location with Map

// Initialise the game dng
def dng = [ 'Chris':  ['Sword', 'Food'],
                'Jenny': ['Dagger']
              ]
              
// add a new player
dng['Joe'] = ['Magic Wand']

// update an existing player
dng['Jenny'] = dng['Jenny'] << 'Food'

// display the data in various ways
println "dng: ${dng}"

println "Player Chris has a sword? ${dng['Chris'].contains('Sword')}"

println "Number of items in the dng: ${dng.size()}"

println "Players: ${dng.keySet().sort()}"

println "Number of items being carried by Chris: ${dng['Chris'].size()}"

