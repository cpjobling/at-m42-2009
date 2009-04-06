// Illustrations of the method each and a closure

[1, 2, 3, 4].each { println it }

['Chris' : 49, 'Renate' : 51, 'Gary' : 51].each { println it }
['Chris' : 49, 'Renate' : 51, 'Gary' : 51].each { println "${it.key} maps to: ${it.value}" }

'Chris'.each { println it }
