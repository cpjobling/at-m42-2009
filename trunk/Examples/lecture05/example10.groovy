// Variable scope

def printName(name) {
    println "Name (at entry): ${name}"
    // name = lecturer
    name = 'Chris'
    println "Name (after assignment): ${name}"
}  

def lecturer = 'John'

printName(lecturer)

// println "Name: ${name}"