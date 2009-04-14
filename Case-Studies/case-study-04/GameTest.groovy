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
      * Test that the removing an item forces the item to be dropped.
      */
      void testRemoveCarriedItemCausesItemToBeDropped() {
         game.addItem(book)
         player.pickUp(book)
         assertTrue('book not being carried by player', 
                     player.inventory.containsKey(book.id))
         game.removeItem(book.id)
         assertFalse('book being carried by player', 
                     player.inventory.containsKey(book.id))
      }
      
     /** 
      * Test that the removing an item null's item's carrier.
      */
      void testRemoveCarriedItemNullsCarrier() {
         game.addItem(book)
         book.pickedUpBy(player)
         assertNotNull('book not being carried', book.carrier)
         game.removeItem(book.id)
         assertNull('book.carrier should be null', book.carrier)
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
      
      /**
       * Test that registering a new player results in player being registered
       * as players[player.id].
       */
      void testRegisterPlayer_2() {
         game.registerPlayer(player)
         
         assertTrue('player not registered',
              game.players.containsKey(player.id))
      }
      
      /**
       * Test that registering a new player results in player being registered.
       */
      void testRegisterPlayer_3() {
         game.registerPlayer(player)
         
         assertSame('player not registered',
              game.players[player.id], player)
      }
      
      /**
       * Test that successful player registration is detected.
       */
      void testRegisterPlayer_4() {
         def actual = game.registerPlayer(player)
         def expected = 'Player registered'
        
         assertTrue('unexpected message', actual == expected)
      }
      
      /**
       * Test that unsuccessful player registration is detected.
       */
      void testRegisterPlayer_r() {
         game.registerPlayer(player)
         def actual = game.registerPlayer(player)
         def expected = 'Cannot register: player already registered'
        
         assertTrue('unexpected message', actual == expected)
      }
      
      
      
      
      /**
       *  Test successful pickup: after pickup player is carrying item.
       */
       void testPlayerIsCarryingItemAfterSuccessfulPickup() {
           game.addItem(book)
           game.registerPlayer(player)
           game.pickupItem(book.id, player.id)
           assertSame('player is  not carrying book', 
                  player.inventory[book.id], book)
       }
              
      /**
       *  Test successful pickup: after pickup item is being carried by item.
       */
       void testAfterSuccessfulPickupItemIsBeingCarriedByPlayer() {
           game.addItem(book)
           game.registerPlayer(player)
           game.pickupItem(book.id, player.id)
           assertSame('item is not being carried by player', 
                  book.carrier, player)
       }
              
      /**
       *  Test successful pickup: message is correct.
       */    
       void testSuccesfulPickup() {
           game.addItem(book)
           game.registerPlayer(player)
           def actual = game.pickupItem(book.id, player.id)
           def expected = 'Item picked up'
       }
       
       /**
        * Test item can't be picked up when player is not registered.
        */
        void testItemNotPickedUpWhenPlayerNotRegistered() {
           game.addItem(book)
           def actual =  game.pickupItem(book.id, player.id)
           def expected = 'Cannot pick up: player not registered'
           
           assertTrue('unexpected message', actual == expected)
        }
       
       /**
        * Test item can't be picked up if it is not present.
        */
        void testNonPresentItemCannotBePickedUp() {
           def actual =  game.pickupItem(book.id, player.id)
           def expected = 'Cannot pick up: item not present'
           
           assertTrue('unexpected message', actual == expected)
        }
        
       /**
        * Test item can't be picked up if it is already being carried.
        */
        void testCarriedItemCannotBePickedUp() {
           game.addItem(book)
           game.registerPlayer(player)
           player.pickUp(book)
           def actual =  game.pickupItem(book.id, player.id)
           def expected = 'Cannot pick up: item already being carried'
           
           assertTrue('unexpected message', actual == expected)
        }
        
        /**
         * Test item can be dropped.
         */
         void testDropItem() {
           game.addItem(book)
           game.registerPlayer(player)  
           game.pickupItem(book.id, player.id)
           
           def actual = game.dropItem(book.id)       
           def expected = 'Item dropped'
           
           assertTrue('unexpected message', actual == expected)
        }

        /**
         *  Test dropped item is not being carried.
         */
         void testDropedIsNotBeingCarriedItem() {
           game.addItem(book)
           game.registerPlayer(player)  
           game.pickupItem(book.id, player.id)
           assertTrue('book should have been picked up',
                  book.carrier == player)
           game.dropItem(book.id)    
           assertFalse('book should have been dropped',
                  book.carrier == player)
        }
        
        /**
         * Test dropped item is not being carried.
         */
         void testDroppedItemHasBeenDropped() {
           game.addItem(book)
           game.registerPlayer(player)  
           game.pickupItem(book.id, player.id)
           assertNotNull('book should have been picked up', book.carrier)
           game.dropItem(book.id)    
           assertNull('book should have been dropped', book.carrier)
        }      
        
        /**
         * Test can't drop an item that isn't being carried
         */
         void testCannotDropItemThatIsNotBeingCarried() {
           game.addItem(book)
           game.registerPlayer(player)  
           def actual = game.dropItem(book.id)
           def expected = 'Cannot drop: item not being carried'
           
           assertTrue('should not be able to drop item', actual == expected)
         }
         
        /**
         * Test can't drop an item that isn't being carried
         */
         void testCannotDropItemThatIsNotInGame() {
           game.registerPlayer(player)  
           def actual = game.dropItem(book.id)
           def expected = 'Cannot drop: item not present'
           
           assertTrue('should not be able to drop item', actual == expected)
         }
         
// ----- properties --------------------------

    def game
    
    def book
    def satchel
    def item3
    
    def player
}