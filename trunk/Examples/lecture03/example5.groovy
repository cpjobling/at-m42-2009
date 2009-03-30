// Range methods
def twentiethCentury = 1900..1999 // Range literal
def countdown = 10..1             // rerversed Range

assert twentiethCentury.size() == 100  
assert twentiethCentury.get(0) == 1900  
assert twentiethCentury.getFrom() == 1900 
assert twentiethCentury.getTo() == 1999 
assert twentiethCentury.contains(2000) == false  
assert twentiethCentury.subList(0, 5) == 1900..1904  

assert countdown[2] == 8 
assert countdown.isReverse() == true  
