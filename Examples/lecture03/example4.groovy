// Map methods
def mp = ['Chris' : 2745, 'Javier' : 2746, 'Alice' : 2742]

// Adding items
mp.put('Bob', 2713)
assert mp['Bob'] == 2713

// Querying
assert mp.containsKey('Bob') == true

// Retrieving
assert mp.get('Sue', 9999) == 9999 
assert mp.get('Alice') == 2742
assert mp.get('David') == null

// Key set
def keys = mp.keySet()
assert keys.toString() == '[Chris, Javier, Alice, Bob, Sue]'

// map properties
assert mp.size() == 5

// Array-like access
mp['Chris'] == 2745

// Property-like access
assert mp.Alice == 2742

// Get all values as a list
def values = mp.values().asList()
assert values.sort() == [2713, 2742, 2745, 2746, 9999]


