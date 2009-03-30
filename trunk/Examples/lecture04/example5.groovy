// Simple input

// Note: Run this script from the command-line using groovy.
// keyboard IO doesn't work in groovyConsole!

// Get an input reader
def input = new BufferedReader(new InputStreamReader(System.in))

print "Please enter your first name: "
def name = input.readLine()
println "Hello ${name}!"

// Some help methods
def readString(input) {
    return input.readLine()
}

def readInteger(input) {
    return input.readLine().toInteger()
}

def readDouble(input) {
    return input.readLine().toDouble()
}


print 'Please enter your surname: '
def surname = readString(input)

print 'Please enter your age: '
def age = readInteger(input)

print 'Please enter your weight in kg: '
def weight = readDouble(input)

printf('Hello %s %s: your age is %d and you weigh %8.2f kg\n', [name, surname, age, weight])
