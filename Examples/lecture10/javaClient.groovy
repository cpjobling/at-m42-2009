// Very simple client that just writes to server and echoes what's returned

InetAddress address = InetAddress.getByName(null)

println "address = ${address}"
Socket socket = new Socket(address, ClientServer.PORT)
// Guard everything in a try-finally to make
// sure that the socket is closed:
try {
    println "socket = ${socket}"
    def r = new BufferedReader(new InputStreamReader(
    		socket.getInputStream()))
    // Output is automatically flushed by PrintWriter:
    def w = new PrintWriter(new BufferedWriter(
            new OutputStreamWriter(socket.getOutputStream())), true)
    for (i in 0..<10) {
        w.println  "howdy ${i}"
        def string = r.readLine()
        println string
    }
    w.println "END"
} finally {
    println "closing..." 
    socket.close()
}