<!-- .slide: id="collections" -->

# 🐍 Collections
<!-- .element: class="headline" -->

What **lists and arrays** are in Java, are just **lists** in Python.  
What **maps** are in Java, are **dictionaries** in Python.  
And yes, **sets** are called the same in Python and Java.

---

## `list`

Lists hold multiple elements in a specific order.

```py
numbers = [1, 2, 3, 4, 5]
names = ["Max", "Alex", "Anton"]
mixed = [1, 2, "Max", 3.141]
```

### Basic list operations

```py
# get element at position
names[0]

# use negative indexes to count from the end
names[-1]

# set element at position
names[0] = "Peter"

# add an element to the end of the list
names.append(-5)

# add at a specific position
numbers.insert(1, 100)

# remove the first occurrence from the list
names.remove(-5)

# remove by index
del names[0]
```

---

### Check for existence of list elements

```py

# check for existence
"Alex" in names

# ... and not-existence
"Mario" not in names
```

### Merge, count, and check the length of lists

```py
# merging two lists
merged = [1, 2, 3] + [4, 5, 6]

# the number of times this item is in the list
numbers.count(1)

# total number of elements in the list
len(numbers)
```

### More list operations

Learn about all list operations at [docs.python.org/3/tutorial/datastructures.html#more-on-lists](https://docs.python.org/3/tutorial/datastructures.html#more-on-lists)

---

## `dict`

Dictionaries map keys to values.

```py
my_grades = {
    "math": 2,
    "programming": 1,
    "literature": 3
}

# alternative syntax
my_grades = dict(math=2, programming=1, literature=3)
```

### Basic dict operations

```py
# get elements by key
my_grades["math"]

# set elements by key
my_grades["math"] = 5

# add a new element
my_grades["electronics"] = 4

# remove an element (will raise an error if the key does not exist)
if "math" in my_grades:
    del my_grades["math"]
```

---

### Inspect dict elements

```py
# get all the keys as a list
my_grades.keys()

# get all the values as a list
my_grades.values()
```

---

## `set`

Sets hold multiple elements, without duplicates, but also without order.

### Basic set operations

```py
# notice how the '1' is only appended once after all
my_set = {1, 2, 3, 5}

# check for existence (much faster than with lists)
1 in my_set

# add elements
my_set.add(7)

# remove elements (will raise an error if the element does not exist)
if 2 in my_set:
    my_set.remove(2)
my_set
```

### Retrieve elements from sets

```py
# you can NOT retrieve elements by index from a set
my_set[0]

# ... you could convert it to a list with `list(my_set)` or even better: use an iterator
```

### Set arithmetic

```py
a = {1, 2, 3, 4, 5}
b = {4, 5, 6, 7, 8}

print("a | b =", a | b)  # union
print("a & b =", a & b)  # intersection
print("a - b =", a - b)  # difference
```
