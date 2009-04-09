// Testing with println

    // Create an item
def item1 = new Item(id : 2001, name : 'Cloth of Gold', value : 25)
def item2 = new Item(id : 2002, name : 'Shiny pebble', value: 0, 
    description : """A shiny pebble, found on the beach. 
Has sentimental value only!""")

    // test the method toString()
println item1
println item2
//Item: 2001; name = Cloth of Gold: value = 25;
//Item: 2002; name = Shiny pebble: value = 0; description: A shiny pebble, found on the beach. 
//Has sentimental value only!;
