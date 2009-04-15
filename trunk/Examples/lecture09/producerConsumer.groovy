class Storage {
    List stack = []
    synchronized void leftShift(value) { // override the leftShift operator
        stack << value
        println "push: $value"
        notifyAll()  // Wake up any listeners
    }
    synchronized Object pop() {
        while ( stack.isEmpty() ) {
            // wait until a value is available
            try {
                wait()
            } catch (Exception e) {}
        }
        def value = stack.pop()
        println "pop : $value"
        return value
    }
}

storage = new Storage()


Thread.start {
    // Start a thread producing 10 items
    for (i in 0..9) {
        storage << i
        sleep 100
    }
}

Thread.start {
    // start a thread consuming 10 items
    10.times {
        sleep 200
        value = storage.pop()
    }
}


