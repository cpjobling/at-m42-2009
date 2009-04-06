// Further examples of collect

   // A series of closures
def doubles = { item -> 2 * item }
def triples = { item -> 3 * item }
def isEven = { item -> (item % 2 == 0) }

   // A m,ethod to apply a closure to a list
def map(clos, list) {
  return list.collect(clos)
}

   // Uses:
println "Doubling: ${map(doubles, [1, 2, 3, 4])}"
println "Tripling: ${map(triples, [1, 2, 3, 4])}"
println "Evens: ${map(isEven, [1, 2, 3, 4])}"