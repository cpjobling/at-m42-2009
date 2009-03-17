/**
 * Lecture 2: Java and Groovy are equivalent.
 */
 
package uk.ac.swan.atm42.lecture2;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
	 A found item in an hypothetical adventure game.
	 Used to illutsrate the differences between Java and Groovy.
	 
	 @author Dr Chris P. Jobling
	 @version 1.0
*/
public class Item 
{
	private String name;
	private String description;
	
	/**
	 * Default constructor. Needed to be able to create an Item with no name and no description.
	 */
	 public Item() {}
	 
	 /**
		 Constructor.
		 @param name the name of the item.
	     @param description a description of the item;
	 */
	public Item(String name, String description)
	{
			this.name = name;
			this.description = description;	 	
	}
	// name and description are properties and need getter/setter methods
	public String getName()
	{
		return this.name;
	}	

	public void setName(String name)
	{
		this.name = name;		
	}
	
	public String getDescription()
	{
		return this.description;
	}	

	public void setDescription(String description)
	{
		this.description = description;		
	}

	public static void main(String [] args)
	{
		List room = new ArrayList();
		room.add(new Item("sword", "An old and rusty sword."));
		room.add(new Item("cheese", "A lump of twenty day old cheddar."));
		room.add(new Item("broken stool", "A three-legged stool with only two legs."));
		
		System.out.println("This room contains");
		for (Iterator iter = room.iterator(); iter.hasNext();)
		{
			Item item = (Item) iter.next();
			System.out.println(item.getName() + ": " + item.getDescription());
		}		
			
	}
}