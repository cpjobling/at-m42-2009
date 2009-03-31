// Variables and methods in same scope

def lecturer = 'Chris'

def printName(name) {
    println "Name: ${name}"
    // println "Lecturer: ${lecturer}"
}  

printName(lecturer)