// TestCase for the Game class

import groovy.util.GroovyTestCase

class GameTest extends GroovyTestCase {

	/**
	 * Set up the fixture
	 */
	void setUp() {
		game = new Game(name : 'School')
		
		book = new Item(id : 1, name : 'book', value : 5, 
			description : 'a maths text book')	
		satchel = new Item (id : 2, name : 'satchel', value : 10,
			description : 'a carrier for school books and pencils')
	}
	
	/**
	 * Test that the addition of an item to the game results in one more
	 * item in the game.
	 */
	 void testAddBook_1() {
	 	def pre = game.inventory.size()
	 	game.addItem(book)
	 	def post = game.inventory.size()
	 	
	 	assertTrue('one less item than expected', post == pre + 1)
	 }

	/**
	 * Test that the addition of two items with different ids to an
	 * empty game results in a game with two items in its inventory
	 */
	 void testAddBook_2() {
	 	game.addItem(book)
	 	game.addItem(satchel)
	 	def expected = 2
	 	def actual = game.inventory.size()
	 	
	 	assertTrue('unexpected number of items', expected == actual)
	 }

// ----- properties --------------------------

	def game
	
	def book
	def satchel
}
