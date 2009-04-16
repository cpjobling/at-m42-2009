// tests the chatterServer by starting multiple clients, each of which sends datagrams.

def buffer = new byte[1000];
def dp = new DatagramPacket(buffer, buffer.length)

for (id in 0..<10) {
	Thread.start() { //new ChatterClient(i).start();
		// Auto-assign port number:
		def socket = new DatagramSocket()
		def hostAddress = InetAddress.getByName("localhost")
		println "ChatterClient starting"
		
		for (i in 1..<25) {
			outMessage = "Client #${id}: message #${i}"
			// Make and send a datagram:
			socket.send(Dgram.toDatagram(outMessage, hostAddress, 
			            ClientServer.PORT))
			// Block until it echoes back:
			socket.receive(dp)
			// Print out the echoed contents:
			def rcvd = "Client #${id} rcvd from ${dp.getAddress()}, ${dp.getPort()}: ${Dgram.toString(dp)}"
			println rcvd
		}
	}
}