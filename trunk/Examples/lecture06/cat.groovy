// Read and display a file, line-at-a-time

import java.io.File

if (args.size() != 1) {
    println 'Usage: cat.groovy filename'
} else {
        // Print each line of the file
    new File(args[0]).eachLine { line ->
        println line
    }
}
