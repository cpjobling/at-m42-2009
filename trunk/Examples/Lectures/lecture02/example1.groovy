class One {
  Integer i = 1

  def increment() {
    i = i + 1
  }
}

def one = new One()
assert one.class.toString() == "class One"
assert one.i == 1
one.increment()
assert one.i == 2
