// Testing with jUnit
import groovy.util.GroovyTestCase

class ItemTest extends GroovyTestCase {

  void setUp() {
  	item1 = new WeightyItem(id : 2001, name : 'Cloth of Gold', value : 25, weight : 10)
  	item2 = new MagicalItem(id : 2002, name : 'Shiny pebble', value: 0, 
                          description : """A shiny pebble, found on the beach. 
Has sentimental value only!""", potency : 0)
	player = new Player(id : 1111, nickname : 'Chris', 
					email : 'chris@swan.ac.uk')
  }
  
  /**
   * test that expected String is returned from toString,
   */
  void testToString() {
      def expected = 'WeightyItem: 2001; name = Cloth of Gold; value = 25; with weight: 10'
      
      assertToString(item1, expected)
  }

  /**
   * test that toString has a description, if item has.
   */
  void testToStringHasDescription() {
      def result = item2.toString()
      assertTrue('toString does not start with expected string', result.startsWith('MagicalItem: 2002; name = Shiny pebble; value = 0; description:'))
      assertTrue('result does not contain value of description property', result.contains('sentimental value only!;'))
  }
  
  /**
   * Test that uncarried item has null carrier property.
   */
  void testItemIsNotBeingCarried() {
  	assertNull('carrier should be null', item1.carrier)
  }
  
  /**
   * Test that a carried item has a non null carrier property.
   */
  void testPickedUpItemIsBeingCarried() {
    item1.pickedUpBy(player)
  	assertNotNull('carrier should be null', item1.carrier)
  }
  
  /**
   * Test that a carried item is being carried by the player that picked it up.
   */
  void testPickedUpItemIsBeingCarriedbyPlayer() {
    item1.pickedUpBy(player)
  	assertSame('carrier should be player', item1.carrier, player)
  }   
   
  /**
   * Test that item.dropped() nulls carrier.
   */
   void testDropped() {
       item2.pickedUpBy(player)
       assertNotNull('carrier should be non null', item2.carrier)
       item2.dropped()
       assertNull('carrier should be null', item2.carrier)
   }
  
// ----- properties

	def item1
	def item2
	
	def player
}