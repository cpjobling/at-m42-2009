// Formatted output

// Integers
def a = 10
def b = 15
printf('The sum of %d and %d is %d\n', [a, b, a + b])

// Floating-point values
def x = 1.234
def y = 56.78
printf('%f from %f gives %f\n', [y, x, x - y])

// Strings
printf('[%s]\n', ["Hello there"])
printf('[%20s]\n', ["Hello there"])   // right justified
printf('[%-20s]\n', ["hello there"]) // left justified

