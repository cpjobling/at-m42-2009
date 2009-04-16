// A utility class to convert back and forth between Strings and DataGramPackets.
class Dgram {
	static toDatagram(String s, InetAddress destIA, int destPort) {
		def buffer = s as byte[]
		return new DatagramPacket(buffer, buffer.length, destIA, destPort)
	}

	static toString(DatagramPacket p) {
		return new String(p.data, 0, p.length)
	}
}
