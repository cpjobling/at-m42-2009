//

def server = new ServerSocket(ClientServer.PORT);
println "Server Started" 
while (true) {
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
}