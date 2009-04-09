// Testing with assertions

    // Create a couple of items
def item1 = new Item(id : 2001, name : 'Cloth of Gold', value : 25)
def item2 = new Item(id : 2002, name : 'Shiny pebble', value: 0, 
    description : """A shiny pebble, found on the beach. 
Has sentimental value only!""")

    // test the method toString()
assert item1.toString() == 'Item: 2001; name = Cloth of Gold: value = 25;'
assert item2.toString().startsWith('Item: 2002; name = Shiny pebble: value = 0; description:')
assert item2.toString().endsWith('sentimental value only!')