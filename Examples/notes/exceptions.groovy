// throw, try, catch, and finally

def myMethod() {
    throw new IllegalArgumentException('throw exception')
}

def log = []
try {
	myMethod()
} catch (Exception e) {
	log << e.toString()
} finally {
	log << 'finally'
}
assert log.size() == 2