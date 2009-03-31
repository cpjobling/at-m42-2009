// Looping through a Map.

   // Staff name and age
def staff = ['Chris': 49, 'Javier': 46, 'Tim': 55]

def totalAge = 0
for ( staffEntry in staff ) {
    totalAge += staffEntry.value
}

println "Total staff age: ${totalAge}"