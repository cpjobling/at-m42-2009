// Very simple server that just echoes whatever the client sends.

ServerSocket s = new ServerSocket(ClientServer.PORT)
println "Started: ${s}"
try {
    // Blocks until a connection occurs:
    Socket socket = s.accept()
    try {
        println "Connection accepted: ${socket}"
        def r = new BufferedReader(new InputStreamReader(
                socket.getInputStream()))
        // Output is automatically flushed
        // by PrintWriter:
        def w = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream())), true)
        while (true) {
            def string = r.readLine()
            if (string.equals("END"))
                break
            println "Echoing: ${string}"
            w.println string
        }
        // Always close the two sockets...
    } finally {
        println "closing..." 
        socket.close()
    }
} finally {
    s.close()
}