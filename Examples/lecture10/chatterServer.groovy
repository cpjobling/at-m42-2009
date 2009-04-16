// A server that echoes datagrams

def buffer = new byte[1000]
def dp = new DatagramPacket(buffer, buffer.length)

def socket = new DatagramSocket(ClientServer.PORT)
println "Server started"
while (true) {
	// Block until a datagram appears:
	socket.receive(dp)
	def rcvd = "${Dgram.toString(dp)}, from address: ${dp.getAddress()}, port: ${dp.getPort()}"
	println rcvd
	def echoString = "Echoed: ${rcvd}"
	// Extract the address and port from the
	// received datagram to find out where to
	// send it back:
	def echo = Dgram.toDatagram(echoString, dp.getAddress(), dp.getPort())
	socket.send(echo)
}

