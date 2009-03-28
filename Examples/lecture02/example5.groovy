// Basic operations on Strings
def message = "Hello World!"
assert 'Hello' + 'world' == 'Helloworld'    // concatenate
assert 'Hello' * 3 == 'HelloHelloHello'     // repeat
assert message - 'o World' == 'Hell!'       // remove first occurence
assert message.size() == 12                 // synonymous with length
assert message.length() == 12               // synonymous with size
assert message.count('o') == 2             
assert message.contains('ell') == true