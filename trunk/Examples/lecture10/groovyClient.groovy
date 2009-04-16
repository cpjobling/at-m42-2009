// a simpler groovy client

def address = InetAddress.getByName(null);
println "address = ${address}"
def socket = new Socket(address, ClientServer.PORT)
println "socket = ${socket}"
socket.withStreams { input, output -> 
	// Output is automatically flushed by PrintWriter:
	def w = new PrintWriter(output, true)
	def r = new BufferedReader(new InputStreamReader(input))
	for (i in 0..<10) {
		w.println "howdy ${i}"
	    def string = r.readLine()
	    println string
    }
	w.println "END"
}
