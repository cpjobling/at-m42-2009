// a simple groovy client

def address = InetAddress.getByName(null);
println "address = ${address}"
socket = new Socket(address, JabberServer.PORT)
println "socket = ${socket}"
socket.withStreams { input, output -> 
	def writer = new PrintWriter(output)
	def reader = new BufferedReader(new InputStreamReader(input))
	for (i in 0..<10) {
		writer.println "howdy ${i}"
		writer.flush()
	    def string = reader.readLine()
	    println string
    }
	writer.println "END"
	writer.close()
	reader.close()
}
