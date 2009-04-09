// Testing with jUnit
import groovy.util.GroovyTestCase

class ItemTest extends GroovyTestCase {

  /**
   * test that expected String is returned from toString
   */
  def void testToString() {
      def item1 = new Item(id : 2001, name : 'Cloth of Gold', value : 25)
      def expected = 'Item: 2001; name = Cloth of Gold: value = 25;'
      
      assertToString(item1, expected)
  }

  /**
   * test that toString has a description, if item has
   */
  def void testToStringHasDescription() {
      def item = new Item(id : 2002, name : 'Shiny pebble', value: 0, 
                          description : """A shiny pebble, found on the beach. 
Has sentimental value only!""")
      
      def result = item.toString()
      assertTrue(result.startsWith('Item: 2002; name = Shiny pebble: value = 0; description:'))
      assertTrue(result.endsWith('sentimental value only!;'))
  }
}