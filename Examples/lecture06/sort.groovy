// Sorting a file

import java.io.File

if (args.size() != 1) {
	println 'Usage: groovy sort.groovy filename'
} else {
	def lines = []
	
		// Read from the text file
	new File(args[0]).eachLine { line ->
		lines << line
	}
	
		// Sort the text
	lines.sort()
	println lines
	
		// Write back to the text file
	new File(args[0]).withPrintWriter { printWriter ->
		lines.each { line ->
			printWriter.println(line)
		}
	}
}