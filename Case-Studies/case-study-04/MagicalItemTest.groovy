import groovy.util.GroovyTestCase

class MagicalItemTest extends GroovyTestCase {

    /**
     * Test that the exepcted String is returned
     */
    void testToString() {
        def it1 = new MagicalItem(id : 222, name : 'Potion', value : 10,
           description : 'a magic potion', 
           potency : 5)
     
         def result = it1.toString()
         def expectFromItem = '222; name = Potion; value = 10; description: a magic potion;'
         def expectPotency = 'with potency: 5'
         
          assertTrue("result doesn't have items properties", 
              result.startsWith('MagicalItem: ' + expectFromItem))
          assertTrue("result doesn't contain potency property",
               result.contains('with potency: 5')) 

    }
}