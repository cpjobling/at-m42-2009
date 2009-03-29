// List literals
def numbers = [97, 98, 99, 100] // list with four items

// indexing
assert numbers[0] == 97
assert numbers[3] == 100
assert numbers[-1] == 100
assert numbers[-2] == 99
assert [1, 2, 3, 4][2] == 3

// Indexing with a range
assert numbers [0..2] == [97, 98, 99]
assert numbers [0..<2] == [97, 98]

// Using index to add new items to a list
numbers[1] = 2
assert numbers == [97, 2, 99, 100]
numbers[2] = [33, 44]
assert numbers == [97, 2, [33, 44], 100]

// Adding items
assert (numbers << 101) ==  [97, 2, [33, 44], 100, 101]
assert numbers + [102, 103] == [97, 2, [33, 44], 100, 101, 102, 103]

// Removing items
assert numbers - [100] == [97, 2, [33, 44], 101]