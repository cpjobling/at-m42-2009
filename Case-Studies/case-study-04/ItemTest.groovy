// Testing with jUnit
import groovy.util.GroovyTestCase

class ItemTest extends GroovyTestCase {

  /**
   * test that expected String is returned from toString
   */
  def void testToString() {
      def item1 = new WeightyItem(id : 2001, name : 'Cloth of Gold', value : 25, weight : 10)
      def expected = 'WeightyItem: 2001; name = Cloth of Gold; value = 25; with weight: 10'
      
      assertToString(item1, expected)
  }

  /**
   * test that toString has a description, if item has
   */
  def void testToStringHasDescription() {
      def item = new MagicalItem(id : 2002, name : 'Shiny pebble', value: 0, 
                          description : """A shiny pebble, found on the beach. 
Has sentimental value only!""", potency : 0)
      
      def result = item.toString()
      println result
      assertTrue('toString does not start with expected string', result.startsWith('MagicalItem: 2002; name = Shiny pebble; value = 0; description:'))
      assertTrue('result does not contain value of description property', result.contains('sentimental value only!;'))
  }
}