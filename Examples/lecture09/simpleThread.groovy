class SimpleThread extends Thread {

    SimpleThread() { // non-default constructor
        super("" + ++threadCount) // Store the thread name
        this.start() // start this thread
    }

    String toString() {
        return "#${name}: ${countDown}"
    }

    void run() {
        while (true) {
            println this
            if (--countDown == 0) { 
                return
             }
        }
    }
    
// ---- properties -------------------------

    private countDown = 5

    private static threadCount = 0

}

for (i in 1..5) {
    new SimpleThread()
}