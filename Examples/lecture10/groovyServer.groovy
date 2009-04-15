def s = new ServerSocket(JabberServer.PORT);
println "Started: ${s}"
try {
	// Blocks until a connection occurs:
	def socket = s.accept();
	try {
		println "Connection accepted: ${socket}"
		BufferedReader input = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		// Output is automatically flushed
		// by PrintWriter:
		PrintWriter output = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream())), true);
		while (true) {
			def string = input.readLine();
			if (string.equals("END"))
				break;
			println "Echoing: ${string}"
			output.println string
		}
		// Always close the two sockets...
	} finally {
		println("closing...");
		socket.close();
	}
} finally {
	s.close();
}