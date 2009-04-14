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
            
        player = new Player(id : 1, nickname : 'Chris', 
                            email : 'chris@swan.ac.uk')
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
      */
     void testAddItem_3() {
         game.addItem(book)
         game.addItem(satchel)
         def pre = game.inventory.size()
         game.addItem(item3)
         def post = game.inventory.size()
         
         assertTrue('one more item than expected', post == pre)
     }    

     /**
      * Test that the addition of an Item with the same id as one
      * already present in the Game results in no change in the item
      * already in the collection.
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
      */
     void testAddItem_5() {
         def actual = game.addItem(satchel)
         def expected = 'Item added'
         
         assertTrue('unexpected message', actual == expected)
     }   
        
      /**
      * Test that unsuccessfully attempting to add Item with the same 
      * id as one already present in the Game is detected.
      */
     void testAddItem_6() {
         game.addItem(satchel)
         def actual = game.addItem(item3)
         def expected = 'Cannot add: item already present'
         
         assertTrue('unexpected message', actual == expected)
     }
     
     /** 
      * Test that the Game had one Item after removal of
      * an Item known to be in the Game
      */
      void testRemoveItem_1() {
         // 
         // book is created in the fixture
         game.addItem(book)
         def pre = game.inventory.size()
         game.removeItem(book.id)
         def post = game.inventory.size()
         
         assertTrue('one more item than expected', post == pre - 1)
      }

     /** 
      * Test that the correct message is available to a client
      */
      void testRemoveItem_2() {
         // 
         // book is created in the fixture
         game.addItem(book)
         def actual = game.removeItem(book.id)
         def expected = 'Item removed'
         
         assertTrue('unexpected message', actual == expected)
      }

     /** 
      * Test that the correct message is available to a client
      */
      void testRemoveItem_3() {
         def actual = game.removeItem(book.id)
         def expected = 'Cannot remove: item not present'
         
         assertTrue('unexpected message', actual == expected)
      }

      /**
       * Test that registering a new player results in one more
       * player in the game.
       */
      void testRegisterPlayer_1() {
         def pre = game.players.size()
         game.registerPlayer(player)
         def post = game.players.size()
         
         assertTrue('one less player than expected', post == pre + 1)
      }
      
      
// ----- properties --------------------------

    def game
    
    def book
    def satchel
    def item3
    
    def player
}