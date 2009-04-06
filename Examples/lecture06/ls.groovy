 // List the content of a directory file

import java.io.File


def listDir(dirFile, indent) {
    dirFile.eachFile { file ->
        (0..<indent).each { print " " }
        println "${file.name}"
        if (file.isDirectory()) {
            listDir(file, 2 + indent)
        }
    }
}

  // Print the content of a named directory
def printDir(dirName) {
    listDir(new File(dirName), 0)
}

if (args.size() != 1 || new File(args[0]).isDirectory() == false) {
    println 'Useage: ls.groovy directory'
} else {
        // Print the current directory
    printDir(args[0])
}