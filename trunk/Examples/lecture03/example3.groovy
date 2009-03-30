// Map literals
def names = ['Chris' : 'Jobling', 'Javier': 'Bonet']
def divisors = [4 : [2], 6 : [3, 2], 12 : [6, 4, 3, 2]]

// retrieving values
assert names['Chris'] == 'Jobling'
assert names.Chris == 'Jobling'
assert names.Tony == null
assert divisors[6] == [3, 2]

// updating/inserting values
divisors[6] = [6, 3, 2, 1]
assert divisors[6] == [6, 3, 2, 1]
assert names.getAt('Javier') == 'Bonet'
assert divisors.getAt(12) == [6, 4, 3, 2]