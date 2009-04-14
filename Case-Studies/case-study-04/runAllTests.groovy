import groovy.util.GroovyTestSuite
import junit.framework.Test
import junit.textui.TestRunner

class AllTests {
    
    static Test suite() {
        def allTests = new GroovyTestSuite()
        
        allTests.addTestSuite(WeightyItemTest.class)
        allTests.addTestSuite(MagicalItemTest.class)
        allTests.addTestSuite(GameTest.class)
        allTests.addTestSuite(PlayerTest.class)
        
        return allTests
    }

}

TestRunner.run(AllTests.suite())