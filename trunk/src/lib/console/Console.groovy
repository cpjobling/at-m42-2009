// From Ken Barclay and John Savage, 
//      Groovy programming: An Introduction for java developers, 
//      Morgan Kaufman, 2007.

package console

class Console {
	
	def static readLine() {
		return getNextLine()
	}
	
	def static readString() {
		return getNextToken()
	}
	
	def static readInteger() {
		return getNextToken().toInteger()
	}
	
	def static readDouble() {
		return getNextToken().toDouble()
	}
	
	def static readBoolean() {
		return (getNextToken() == "true")
	}
	
	private static String getNextToken() {
		if (inputLine == null) {
			readInputLine()
		}
		
		while (inputIndex == numberOfTokens) {
			readInputLine()
		}
		
		return inputTokens[inputIndex++]
	}
	
	private static String getNextline() {
		if (inputLine == null) {
			readInputLine()
		}
		
		while (inputIndex == numberOfTokens) {
			readInputLine()
		}
		
		def line = inputTokens[inputIndex..<numberOfTokens].join(' ')
		inputIndex = numberOfTokens
		return line		
	}
	
	private static void readInputLine() {
		inputLine = input.readLine()
		inputTokens = inputLine.tokenize()
		numberOfTokens = inputTokens.size()
		inputIndex = 0
	}
	
	// ------------properties------------
	
	private static String inputLine		= null
	private static List inputTokens		= null
	private static int numberOfTokens   = 0
	private static int inputIndex       = -1
    private static input = new BufferedReader(new InputStreamReader (System.in))	
}