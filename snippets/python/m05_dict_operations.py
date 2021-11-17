grades = {
    "math": 2,
    "programming": 1,
    "literature": 3
}

# alternative syntax
grades = dict(math=2, programming=1, literature=3)


grades["math"]             # get elements by key
grades["math"] = 5         # set elements by key
grades["electronics"] = 4  # add a new element

# remove an element (will raise an error if the key does not exist)
if "math" in grades:
    del grades["math"]

grades.keys()              # get all the keys as a list
grades.values()            # get all the values as a list
