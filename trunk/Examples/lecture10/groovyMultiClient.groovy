// Client that tests the multiClientServer by starting up multiple clients.

def MAX_THREADS = 40
def threadCount = 0
def id = 1

def address = InetAddress.getByName("127.0.0.1")
while (true) {
	if (threadCount < MAX_THREADS) {
		Thread.start() {
			println "Making client ${id++}"
			threadCount++
			def socket = new Socket(address, ClientServer.PORT)
			socket.withStreams { input, output -> 
				// Output is automatically flushed by PrintWriter:
				def w = new PrintWriter(output, true)
				def r = new BufferedReader(new InputStreamReader(input))
				for (i in 0..<25) {
					w.println "Client ${id}: ${i}"
					string = r.readLine()
					println string
				}
				w.println("END");
			}
			threadCount-- // ending this thread	
		}
	}
	Thread.currentThread().sleep(100)
}