// Groovy test suite

import groovy.util.GroovyTestSuite
import junit.framework.Test
import junit.textui.TestRunner

class AllTests {
    
    static Test suite() {
        def allTests = new GroovyTestSuite()
        
        allTests.addTestSuite(ItemTest.class)
        allTests.addTestSuite(GameTest.class)
        
        return allTests
    }

}

TestRunner.run(AllTests.suite())