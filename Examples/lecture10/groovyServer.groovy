// a simpler groovy server


def server = new ServerSocket(ClientServer.PORT)
println "Started: ${server}"
// Blocks until a connection occurs:
server.accept() { socket ->
	println "Connection accepted: ${socket}"
	socket.withStreams { input, output -> 
		// Output is automatically flushed by PrintWriter:
		def w = new PrintWriter(output, true)
		def r = new BufferedReader(new InputStreamReader(input))
		while (true) {
			def string = r.readLine()
			if (string.equals("END")) break
			println "Echoing: ${string}"
			w.println string
		}
	}
}