// Read and display a file, line-at-a-time

import java.io.File

if (args.size() != 1) {
    println 'Usage: example21.groovy filename'
} else {
        // Print each line of the file
    def lineNumber = 1
    new File(args[0]).eachLine { line ->
        println "${lineNumber++}: ${line}"
    }
}