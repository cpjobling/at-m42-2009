// String indexing and slicing
def message = "Hello AT-M42 class of 2009"
assert message[4] == 'o'                      // index from start, 0 base
assert message[-1] == '9'                     // index from end (-1 is last character)
assert message[6..11] == 'AT-M42'             // slice with inclusive range 
assert message[6..<11] == 'AT-M4'             // slice with exclusive range
assert message[11..6] == '24M-TA'             // backward slice 
assert message[0, 6, 13, -1..-4] == 'HAc9002' // selective slicing