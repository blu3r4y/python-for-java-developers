numbers = {1, 1, 2, 3, 5}  # notice how the '1' is only appended once after all

numbers.add(7)             # add new elements
numbers.add(1)             # add elements that already exist (no effect)

1 in numbers               # check for existence (much faster than with lists)

# remove elements (will raise an error if the element does not exist)
if 2 in numbers:
    numbers.remove(2)

# iterate over set elements
for val in numbers:
    print(val)
