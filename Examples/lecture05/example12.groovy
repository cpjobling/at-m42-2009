// List parameter and return.

def sort(list, ascending=true) {
    list.sort()
    if (ascending == false) {
        list = list.reverse()
    }
    return list
}  

def numbers = [10, 5, 3, 6]
assert sort(numbers) == [3, 5, 6, 10]
assert sort(numbers, false) == [10, 6, 5, 3]