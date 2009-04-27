// regex quantifiers
assert 'aaaaab' =~ /a*b/     // zero or more 'a' followed by 'b'
assert 'b' =~ /a*b/          // zero 'a' still matches!
assert 'aaacd' =~ /a*c?d/    // zero or more 'a', optional 'c' followed by 'b'
assert 'aaad' =~ /a*c?d/    // the 'c' is optional
assert 'aaaaaab' =~ /a{5}b/  // five 'a' followed by 'b'
assert ! ('aab' =~ /a{5}b/)  // there aren't 5 'a'