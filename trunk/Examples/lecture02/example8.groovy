// the regex operator
def regex = ~/cheese/

// =~ accepts a partial match
assert 'cheesecake' =~ /cheese/
assert !('cheesecake' =~ /fromage/)
assert 'cheesecake' =~ regex

// ==~ needs exact match
assert ! ('cheesecake' ==~ /cheese/)