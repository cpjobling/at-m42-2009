// Parameter aliasing

def printName(name) {
    println "Name (at entry): ${name}"
    name = 'John'
    println "Name (after assignment): ${name}"
}  

def lecturer = 'Chris'
printName(lecturer)

println "Lecturer: ${lecturer}"