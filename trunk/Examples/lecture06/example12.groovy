// Examples of methods any and every.

   // any number over 12?
def anyElement = [11, 12, 13, 14].any { element -> element > 12 }
println "anyElement: ${anyElement}"


   // Are all values over 10?
def allElements = [11, 12, 13, 14].any { element -> element > 10 }
println "allElements: ${allElements}"

   // Any staff member over the age of 55?
def anyStaff = ['Chris' : 49, 'Renate' : 51, 'Gary' : 51].any { staff -> staff.value > 55 }
println "anyStaff: ${anyStaff}"