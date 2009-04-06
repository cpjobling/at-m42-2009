// Illustrations of the findAll method and closures 

   // Find all items that exceed the value 6
def values = [1, 3, 5, 7, 9].findAll { element -> element > 6 }
values.each { println it }

   // Combine clusures by piping result of findAll
   // through to each
values = [1, 3, 5, 7, 9].findAll { element -> element > 6 }.each { println it }

   // Apply a findAll to a Map finding all staff over the age of 50
values = ['Chris' : 49, 'Renate' : 51, 'Gary' : 51].findAll { staff -> staff.value > 50 }
values.each { println it }