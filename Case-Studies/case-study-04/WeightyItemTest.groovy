import groovy.util.GroovyTestCase

class WeightyItemTest extends GroovyTestCase {

	/**
	 * Test that the exepcted String is returned
	 */
	void testToString() {
		def it1 = new WeightyItem(id : 111, name : 'Sword', value : 10,
		   description : 'an old rusty sword', 
		   weight : 5)
	 
     	def result = it1.toString()
     	def expectFromItem = '111; name = Sword; value = 10; description: an old rusty sword;'
     	def expectWeight = 'with weight: 5'
     	
      	assertTrue("result doesn't have items properties", 
      		result.startsWith('WeightyItem: ' + expectFromItem))
     	 assertTrue("result doesn't contain weight property",
      		 result.contains('with weight: 5')) 

	}
}