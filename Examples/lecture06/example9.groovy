// Conditional elements

   // even values only
[1, 2, 3, 4].each { num -> if (num % 2 == 0) println num }

   // staff at least 50 years old
['Chris' : 49, 'Renate' : 51, 'Gary' : 51].each { staff ->
   if (staff.value >= 50) println staff.key 
}
['Chris' : 49, 'Renate' : 51, 'Gary' : 51].each {staffName, staffAge ->
   if (staffAge >= 50) println staffName 
}

   // only lower case letter
'Chris'.each { letter -> if (letter >= 'a' && letter <= 'z') println letter }

