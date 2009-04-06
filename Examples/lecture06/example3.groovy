// Implicit single parameter

def clos = { println "Hello ${it}" }

clos.call('world')
clos.call('again')
clos('shortcut')
