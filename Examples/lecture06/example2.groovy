// Paramterized closure

def clos = { param -> println "Hello ${param}" }

clos.call('world')   // actual argument is 'world'
clos.call('again')  // actual argument is 'again'
clos('shortcut')     // abbreviated form
