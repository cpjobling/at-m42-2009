
// Passing null to getByName() produces the
// special "Local Loopback" IP address, for
// testing on one machine w/o a network:
def address = InetAddress.getByName(null);
// Alternatively, you can use 
// the address or name:
// InetAddress address = 
//    InetAddress.getByName("127.0.0.1");
// InetAddress address = 
//    InetAddress.getByName("localhost");
println "address = ${address}"
socket = new Socket(address, JabberServer.PORT)
// Guard everything in a try-finally to make
// sure that the socket is closed:

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
