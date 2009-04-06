// Illustrations of the find method and closures 

   // locate the value 7
def value = [1, 3, 5, 7, 9].find { element -> element > 6 }
println "found: ${value}"

   // locate no value (null)
value = [1, 3, 5, 7, 9].find { element -> element > 10 }
println "found: ${value}"

   // first staff member over 50
value = ['Chris' : 49, 'Renate' : 51, 'Gary' : 51].find { staff -> staff.value > 50 }
println "found: ${value}"