// String methods
assert 'Hello'.compareToIgnoreCase('hello') == 0

assert 'Hello'.concat(' world') == 'Hello world'

assert 'Hello'.endsWith('lo') == true

assert 'Hello'.equalsIgnoreCase('hello') == true

assert 'Hello'.indexOf('lo') == 3
assert 'Hello world'.indexOf('o', 6) == 7

assert 'Hello'.matches(/Hello/) == true
assert 'Hello'.matches(/He/) == false
assert 'Hello'.replaceAll('l','L') == 'HeLLo'

assert 'Hello world'.split(/l/) == ['He', '',  'o wor', 'd']

assert 'Hello'.substring(1) == 'ello'
assert 'Hello'.substring(1, 4) == 'ell'

assert 'Hello'.toUpperCase() == 'HELLO'

def message = 'Hello'
assert message.center(11) == '   Hello   ' 
assert message.center(3) == 'Hello'
assert message.center(11, '#') == '###Hello###'

message.eachMatch(/./) { ch -> println ch} // print H e l l o on seperate lines

assert message.getAt(0) == 'H'
assert message.getAt(0..<3) == 'Hel'
assert message.getAt([0, 2, 4]) == 'Hlo'

def greeting = message.leftShift(' world')  // greeting is a StringBuffer not a String
assert greeting.toString() == 'Hello world'
greeting << ' world'
assert greeting.toString() == 'Hello world world'

assert message.minus('ell') == 'Ho'
assert message - 'ell' == 'Ho'

assert message.padLeft(4) == 'Hello'
assert message.padLeft(11) == '      Hello'
assert message.padLeft(11, '#') == '######Hello'

assert message.padRight(4) == 'Hello'
assert message.padRight(11) == 'Hello      '
assert message.padRight(11, '#') == 'Hello######'

assert message.plus(' world') == 'Hello world'
assert message + ' world' == 'Hello world'

assert message.replaceAll('[a-z]') {ch -> ch.toUpperCase() } == 'HELLO'

assert message.reverse() == 'olleH'

assert message.toList() == ['H', 'e', 'l', 'l', 'o']

message = 'Hello world'
assert message.tokenize() == ['Hello', 'world']
assert message.tokenize('l') == ['He', 'o wor', 'd']