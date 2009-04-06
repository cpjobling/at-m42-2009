// Closures and enclosing scope

def greeting = 'Hello'
def clos = { param -> println "${greeting} ${param}" }
clos.call('world')

   // Now show that changes to this variable change the closure
greeting = 'Welcome'
clos('world')
