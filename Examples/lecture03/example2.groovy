// List methods
def numbers = [19, 20, 21, 22] 

// adding items
numbers.add(23) // returns true!
assert numbers == [19, 20, 21, 22, 23]
numbers.add(2, 50)
assert numbers == [19, 20, 50, 21, 22, 23]

// getting items
assert numbers.get(1) == 20

// list properties
assert numbers.isEmpty() == false
assert numbers.size() == 6

// flatten a list of lists
assert [11, 12, [13, 14], 15].flatten() == [11, 12, 13, 14, 15]

// accessing elements
assert numbers.getAt(1) == 20
assert numbers.getAt([1..2]) == [20, 50]
assert numbers.getAt([2, 3]) == [50, 21]

// intersection (list as a set)
assert numbers.intersect([22, 23, 24]) == [22, 23]

// other useful operators
assert numbers.pop() == 23
assert numbers.reverse() == [22, 21, 50, 20, 19]
assert numbers.sort() == [19, 20, 21, 22, 50]
