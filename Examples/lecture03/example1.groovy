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

