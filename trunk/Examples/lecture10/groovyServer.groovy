// a simpler groovy server


def s = new ServerSocket(ClientServer.PORT)
println "Started: ${s}"
try {
	// Blocks until a connection occurs:
	def socket = s.accept();
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
} finally {
	s.close();
}