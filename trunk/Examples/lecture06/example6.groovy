// Leave the closure outside of the actual argument list

def greeting = 'Hello'
def clos = { param -> println "${greeting} ${param}" }

def demo(clo) {
    def greeting = 'Bonjour'  // does not effect closure
    clo.call('Chris')
}

//demo() clos                                   // 1: closure reference; include parameters
demo() { param -> println "Welcome ${param}" }  // 2: closure literal, include parentheses

demo clos                                       // 3: closure reference; omit parentheses
demo { param -> println "Welcome ${param}" }    // 4: closure literal; omit parentheses
