// TestCase for the Player class

import groovy.util.GroovyTestCase

class PlayerTest extends GroovyTestCase {

    /**
     * Set up the fixture
     */
    void setUp() {
        player =  new Player (id : 1, nickname : 'Chris', 
                              email : '123456@swan.ac.uk')
        
        itm1 = new Item(id : 1, name : 'itm1', value : 5, 
            description : 'a maths text itm1')    
        itm2 = new Item (id : 2, name : 'itm2', value : 10,
            description : 'a carrier for school itm1s and pencils')
        // a bogus item!
        itm3 = new Item (id : 2, name : 'a different itm2', value : 10) 
    }
    
    /**
     * Test that a player with no items can pickUp an item.
     */
     void testpickUp_1() {
         def pre = player.inventory.size()
         player.pickUp(itm1)
         def post = player.inventory.size()
         
         assertTrue('one less item than expected', post == pre + 1)
     }

    /**
     * Test that a player with no items can pickUp two items with 
     * different ids.
     */
     void testpickUp_2() {
         player.pickUp(itm1)
         player.pickUp(itm2)
         def expected = 2
         def actual = player.inventory.size()
         
         assertTrue('unexpected number of items', expected == actual)
     }
     
     /**
      * Test that the addition of an Item with the same id as one
      * already present in the player's inventory results in no 
      * change in the number of items in the inventory.
      */
     void testpickUp_3() {
         player.pickUp(itm1)
         player.pickUp(itm2)
         def pre = player.inventory.size()
         player.pickUp(itm3)
         def post = player.inventory.size()
         
         assertTrue('one more item than expected', post == pre)
     }   

     /**
      * Test that the addition of an Item with the same id as one
      * already present in the player results in no change in the number
      * of items in the inventory.
      */
     void testpickUp_4() {
         player.pickUp(itm2)
         player.pickUp(itm3)
         def expected = itm2.toString()
         def actual = player.inventory[2]
         
         assertToString(actual, expected)
     }      
     
     /**
      * Test that successfully adding an Item to the player
      * is detected
      * uncoment to activate
      */
     /*
     void testpickUp_5() {
         def success = player.pickUp(itm2)
         
         assertTrue('addition should succeed', success)
     }      
     */
      /**
      * Test that unsuccessfully attempting to add Item with the same 
      * id as one already present in the player is detected.
      * uncoment to activate
      */
      /*
      void testpickUp_6() {
         player.pickUp(itm2)
         def success = player.pickUp(itm3)
         
         assertFalse('addition should fail', success)
     }
     */      
      
// ----- properties --------------------------

    def player
    
    def itm1
    def itm2
    def itm3
}