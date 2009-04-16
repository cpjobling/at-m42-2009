// a simple groovy client

def address = InetAddress.getByName(null);
println "address = ${address}"
socket = new Socket(address, ClientServer.PORT)
println "socket = ${socket}"
socket.withStreams { input, output -> 
	def w = new PrintWriter(output, true)
	def r = new BufferedReader(new InputStreamReader(input))
	for (i in 0..<10) {
		w.println "howdy ${i}"
		//w.flush()
	    def string = r.readLine()
	    println string
    }
	w.println "END"
	//w.close()
}
