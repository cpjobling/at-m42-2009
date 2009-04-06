 // Recursively traversing a directory

import java.io.File


  // List those files exceeding a given size
def printDir(dirName, size) {
    new File (dirName).eachFileRecurse { file ->
        if (file.length() > size) {
        	println "${file.name}"
    	}
    }
}

if (args.size() != 2 || new File(args[0]).isDirectory() == false) {
    println 'Useage: example23.groovy directory filesize'
} else {
        // List from the current directory
    printDir(args[0], args[1].toInteger())
}