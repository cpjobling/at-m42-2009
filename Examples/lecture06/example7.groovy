// factorial(n) with closures

def factorial = 1
1.upto(5) { num -> factorial *= num }
println "factorial(5): ${factorial}"
