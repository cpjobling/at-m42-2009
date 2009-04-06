// Effect of scope

def greeting = 'Hello'
def clos = { param -> println "${greeting} ${param}" }
clos.call('world')

   // Now show that changes to this variable change the closure
greeting = 'Welcome'
clos('world')

def demo(clo) {
    def greeting = 'Bonjour'  // does not effect closure
    clo.call('Chris')
}

demo(clos)