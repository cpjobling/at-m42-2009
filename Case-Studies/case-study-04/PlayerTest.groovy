// TestCase for the Player class

import groovy.util.GroovyTestCase

class PlayerTest extends GroovyTestCase {

    /**
     * Set up the fixture
     */
    void setUp() {
        player =  new Player (id : 1, nickname : 'Chris', 
                              email : '123456@swan.ac.uk')
        
        itm1 = new WeightyItem(id : 1, name : 'itm1', value : 5, 
            description : 'a maths text itm1', weight : 1)    
        itm2 = new WeightyItem (id : 2, name : 'itm2', value : 10,
            description : 'a carrier for school items and pencils', weight : 5)
        // a bogus item!
        itm3 = new WeightyItem (id : 2, name : 'a different itm2', value : 10, weight : 5) 
    }
    
    /**
     * Test that a player with no items can pickUp an item.
     */
     void testPickUp_1() {
         def pre = player.inventory.size()
         player.pickUp(itm1)
         def post = player.inventory.size()
         
         assertTrue('one less item than expected', post == pre + 1)
     }

    /**
     * Test that a player with no items can pickUp two items with 
     * different ids.
     */
     void testPickUp_2() {
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
     void testPickUp_3() {
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
     void testPickUp_4() {
         player.pickUp(itm2)
         player.pickUp(itm3)
         def expected = itm2.toString()
         def actual = player.inventory[2]
         
         assertToString(actual, expected)
     }      
     
     
     /**
      * Test that successfully picking up an Item is detected
      */
     void testPickUp_5() {
         def actual = player.pickUp(itm1)
         def expected = 'Item picked up'
         
         assertTrue('unexpected message', actual == expected)
     }   
        
     /**
      * Test that unsuccessfully up an Item is detected.
      */
     void testPickUp_6() {
         player.pickUp(itm1)
         def actual = player.pickUp(itm1)
         def expected = 'Cannot pick up: already carrying item'
         
         assertTrue('unexpected message', actual == expected)
     }
     
     /**
      * Test that an item picked up by player is recorded as
      * the carrier of that item.
      */
     void testPickUp_7() {
         player.pickUp(itm1)
         def carrier = itm1.carrier
         
         assertSame('carrier is not player', carrier, player)
     }
     
     /**
      * Test that a picked-up item picked is actually now in the player's
      * inventory.
      */
     void testPickUp_8() {
         player.pickUp(itm1)
         
         assertTrue('item is not in inventory', 
                    player.inventory.containsKey(itm1.id))
         assertSame('item is not the item added',
                    player.inventory[itm1.id], itm1)
     }
     
     /**
      * Test the toString method
      */
    void testToString() {
        def actual = player.toString()
        def expected = 'Player: 1; Chris (123456@swan.ac.uk)'
        
        assertTrue('unexpected toString result', actual == expected)
    }
    
    /**
     * Test that dropping an item results in one less item
     */
    void testDrop_1() {
        player.pickUp(itm1)
        def pre = player.inventory.size()
        player.drop(itm1)
        def post = player.inventory.size()
        
        assertTrue('one more item then expected', post == pre - 1)
    }
    
    /**
     * Test that dropping an item results in the expected message
     */
    void testDrop_2() {
        player.pickUp(itm1)
        def actual = player.drop(itm1)
        def expected = 'Item dropped'
        assertTrue('unexpected message', actual == expected)
    }
    
    /**
     * Test that dropping a non-existent item results in the 
     * expected message
     */
    void testDrop_3() {
        player.pickUp(itm1)
        def actual = player.drop(itm2)
        def expected = 'Cannot drop: no such item'
        assertTrue('unexpected message', actual == expected)
    }
     
// ----- properties --------------------------

    def player
    
    def itm1
    def itm2
    def itm3
}