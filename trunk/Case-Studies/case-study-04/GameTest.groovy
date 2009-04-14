// TestCase for the Game class

import groovy.util.GroovyTestCase

class GameTest extends GroovyTestCase {

    /**
     * Set up the fixture
     */
    void setUp() {
        game = new Game(name : 'School')
        
        book = new WeightyItem(id : 1, name : 'book', value : 5, 
            description : 'a maths text book', 
            weight : 1)    
        satchel = new WeightyItem (id : 2, name : 'satchel', value : 10,
            description : 'a carrier for school books and pencils', 
            weight : 5)
        item3 = new WeightyItem (id : 2, name : 'a different satchel',
            value : 10, weight : 5)
    }
    
    /**
     * Test that the addition of an item to the game results in one more
     * item in the game.
     */
     void testAddItem_1() {
         def pre = game.inventory.size()
         game.addItem(book)
         def post = game.inventory.size()
         
         assertTrue('one less item than expected', post == pre + 1)
     }

    /**
     * Test that the addition of two items with different ids to an
     * empty game results in a game with two items in its inventory
     */
     void testAddItem_2() {
         game.addItem(book)
         game.addItem(satchel)
         def expected = 2
         def actual = game.inventory.size()
         
         assertTrue('unexpected number of items', expected == actual)
     }
     
     /**
      * Test that the addition of an Item with the same id as one
      * already present in the Game results in no change in the number
      * of items in the inventory.
      * Uncomment to activate test
      */
     /*
     void testAddItem_3() {
         game.addItem(book)
         game.addItem(satchel)
         def pre = game.inventory.size()
         game.addItem(item3)
         def post = game.inventory.size()
         
         assertTrue('one more item than expected', post == pre)
     } 
     */     

     /**
      * Test that the addition of an Item with the same id as one
      * already present in the Game results in no change in the number
      * of items in the inventory.
      * Uncomment to activate test
      */
     void testAddItem_4() {
         game.addItem(satchel)
         game.addItem(item3)
         def expected = satchel.toString()
         def actual = game.inventory[2]
         
         assertToString(actual, expected)
     }      
     
     /**
      * Test that successfully adding an Item to the Game
      * is detected
      * uncoment to activate
      */
     void testAddItem_5() {
         def success = game.addItem(satchel)
         
         assertTrue('addition should succeed', success)
     }   
        
      /**
      * Test that unsuccessfully attempting to add Item with the same 
      * id as one already present in the Game is detected.
      * uncoment to activate
      */
     void testAddItem_6() {
         game.addItem(satchel)
         def success = game.addItem(item3)
         
         assertFalse('addition should fail', success)
     }

      
// ----- properties --------------------------

    def game
    
    def book
    def satchel
    def item3
}