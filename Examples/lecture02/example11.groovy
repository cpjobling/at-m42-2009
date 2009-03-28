// regex wildcard
def rhyme = 'Humpty Dumpty sat on the wall'
assert rhyme =~ /.all/
assert '3.14' =~ /3.14/  // pattern: 3 followed by any character followed by 14
assert '3X14' =~ /3.14/ 
assert '3.14' =~ /3\.14/ // pattern: literally 3.14
assert ! ('3X14' =~ /3\.14/) 