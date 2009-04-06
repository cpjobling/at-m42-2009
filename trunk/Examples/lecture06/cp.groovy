 // File copying

import java.io.File

if (args.size() != 2) {
    println 'Useage: cp.groovy file1 file2'
} else {
        // Write to destination file
    def outFile = new File(args[1])
    if (outFile.exists()) {
    	outfile.delete()
	}
	
	  // Create a Printwriter
	def printWriter = outFile.newPrintWriter()
	
	  // Copy each line of file
	new File(args[0]).eachLine { line ->
		printWriter.println(line)
	}
	
	  // Close up
	printWriter.flush()
	printWriter.close()
}
