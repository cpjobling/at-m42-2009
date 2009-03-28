// String comparison
assert 'Chris' == 'Chris'              // equality
assert 'Chris'.equals('Chris')
// comparison
assert 'Chris' <=> 'Chris' == 0        // same
assert 'Chris' <=> 'Christopher' == -1 // before
assert 'chris' <=> 'Chris' == +1       // after
assert 'chris'.compareTo('Chris') > 0  // after