// regex character classes
def rhyme = 'Humpty Dumpty sat on the wall'
assert rhyme =~ /[HD]umpty/
assert ! (rhyme =~ /[hd]umpty/)
assert ! (rhyme =~ /[^HD]umpty/)