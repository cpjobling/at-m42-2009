// Using the Console class

// Note: Run this script from the command-line using groovy.
// keyboard IO doesn't work in groovyConsole!
// Also make sure that CLASSPATH includes ..\..\src\lib:
// set CLASSPATH=..\..\src\lib;%CLASSPATH%

import console.*

print "Please enter your first name: "
def name = Console.readLine()
println "Hello ${name}!"


print 'Please enter your surname: '
def surname = Console.readString()

print 'Please enter your age: '
def age = Console.readInteger()

print 'Please enter your weight in kg: '
def weight = Console.readDouble()

printf('Hello %s %s: your age is %d and you weigh %8.2f kg\n', [name, surname, age, weight])
