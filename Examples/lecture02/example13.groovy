// regex groups
assert 'ababab' =~ /(ab)*/
assert ! ('ababa' ==~ /(ab)*/)
assert 'ababc' =~ /(ab)*c/
assert 'bbbc' =~ /(a|b)*c/
assert 'ababc' =~ /(a|b)*c/
