numbers = [1, 2, 3, 4, 5]
names = ["Janine", "Ali", "Alice"]
mixed = [1, 2, "Max", 3.141]


names[0]                # get element by index
names[0] = "Peter"      # set element at index

names[-1]               # use negative indexes to count from the end

names.append(-5)        # add element to the end of the list
names.insert(1, "Bob")  # add element at specific index

names.remove(-5)        # remove the first occurrence from the list
del names[0]            # remove by index


"Alice" in names        # check for existence
"Mario" not in names    # ... and non-existence

numbers.count(1)        # the number of times this item is in the list
len(numbers)            # total number of elements in the list

# merge two lists into one
merged = [1, 2, 3] + [4, 5, 6]
