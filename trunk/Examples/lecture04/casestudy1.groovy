// Case study iteration 1: Adventure game location with List

// Initialise the game dng
def dng = [ ['Chris', 'Sword'],
                ['Chris', 'Food'],
                ['Jenny', 'Dagger']
              ]
              
// add two new items
dng << ['Jenny', 'Food']
dng.add(['Joe', 'Magic Wand'])

// print the location
println "dng: ${dng}"

// Does Chris have a sword?
println "Player Chris has a sword? ${dng.contains(['Chris', 'Sword'])}"

// Print the number of items in the location
println "Number of items in the dng: ${dng.size()}"


