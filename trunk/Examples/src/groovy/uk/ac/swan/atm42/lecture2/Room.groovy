/**
 * Lecture 2: Groovy item as a script
 * Save as Item.groovy then execute.
 */
 
package uk.ac.swan.atm42.lecture2;

/**
	 A found item in an hypothetical adventure game.
	 Used to illustrate the differences between Java and Groovy.
	 
	 @author Dr Chris P. Jobling
	 @version 1.0
*/
public class Item 
{
	String name
	String description
	
}

def room = [
	new Item(name: "sword", 
		        description: "An old and rusty sword."),
	new Item(name: "cheese", 
		        description: "A lump of twenty day old cheddar."),
	new Item(name: "broken stool", 
		        description: "A three-legged stool with only two legs.")
]
		
println "This room contains"
room.each 
{
	println "${it.name}: ${it.description}"
}		
