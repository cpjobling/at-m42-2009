 // File copying with a PrintWriter

import java.io.File

if (args.size() != 2) {
    println 'Useage: cp.groovy file1 file2'
} else {
        // Write to destination file
    new File(args[1]).withPrintWriter { printWriter ->
    
	      // Copy each line of file
		new File(args[0]).eachLine { line ->
			printWriter.println(line)
		}
	}
}
