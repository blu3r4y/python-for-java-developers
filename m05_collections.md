<!-- .slide: id="-collections" -->

# 🐍 Collections

<!-- .element: class="headline" -->

We will only look into a few collection types of Python.  
Find them all at [docs.python.org/3/library/stdtypes.html](https://docs.python.org/3/library/stdtypes.html)

- **Lists and arrays** in Java ➡ are just `list` in Python (but, there is also `tuple`)
- **Maps** in Java ➡ are `dict` in Python
- **Sets** in Java ➡ are also `set` in Python

---

## Lists 1/2

Lists hold multiple elements in a specific order.
Unlike arrays, they can change in size at any time.

```py [|3-5|8-9|11|13-14|16-17|]
# ./python/m05_list_operations.py#L1-L15

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
```

<div class="fragment" data-fragment-index="0">

### What do we notice here?

- Collections in Python are allowed to contain mixed types of data

</div>

---

## Lists 2/2: More list operations

Learn about all list operations at [docs.python.org/3/tutorial/datastructures.html#more-on-lists](https://docs.python.org/3/tutorial/datastructures.html#more-on-lists).

```py [|3-4|6-7|9-10|]
# ./python/m05_list_operations.py#L18-L26

"Alice" in names        # check for existence
"Mario" not in names    # ... and non-existence

numbers.count(1)        # the number of times this item is in the list
len(numbers)            # total number of elements in the list

# merge two lists into one
merged = [1, 2, 3] + [4, 5, 6]

```

---

## Tuples 1/2

Tuples hold two or more objects together in an efficient manner. They have NO direct equivalent in Java.
Use them to group together small number of elements, e.g., when returning multiple values from a method.

```py
pair = ("Jonas", 12)  # create a tuple
pair[0]               # get element by index, similar to lists
```

<div class="fragment">

💡 **Tuples are always [immutable](https://docs.python.org/3/glossary.html#term-immutable)!**

You can NOT modify, append, or delete anything from them after you created one.

```py
# pair[1] = 13
# 💥 TypeError: 'tuple' object does not support item assignment

# pair.append(123)
# 💥 AttributeError: 'tuple' object has no attribute 'append'
```

However, you can convert tuples to lists.

```py
numbers = (10, 11, 12)
list(numbers)

# and back again ...
letters = ["A", "B", "C"]
tuple(letters)
```

</div>

---

## Tuples 2/2: Collection Destructuring

**Destructuring** helps you to quickly retrieve elements from list-like types in Python.

```py [|3-6|9-14|17-22|]
# ./python/m05_destructuring.py

x, y = 1, 2
print(x, y)

# > 1 2


numbers = [1, 2, 3]
x, y, z = numbers

print(x, y, z)

# > 1 2 3


pair = ("Jonas", 12)
name, age = pair

print(name, age)

# > Jonas 12

```

<div class="fragment">

### What do we notice here?

- Actually, whenever you use a comma `,` in such contexts, a `tuple` is used implicitly.

</div>

---

## Dictionaries

Dictionaries map keys to values.

```py [|3-10|13-15|17-19|21-22|]
# ./python/m05_dict_operations.py

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

```

---

## Sets 1/2

Sets hold multiple elements, without duplicates, but also without order.

```py [|3|5-6|8|10-12|]
# ./python/m05_set_operations.py#L1-L10

numbers = {1, 1, 2, 3, 5}  # notice how the '1' is only appended once after all

numbers.add(7)             # add new elements
numbers.add(1)             # add elements that already exist (no effect)

1 in numbers               # check for existence (much faster than with lists)

# remove elements (will raise an error if the element does not exist)
if 2 in numbers:
    numbers.remove(2)
```

<div class="fragment">

💡 **You can NOT retrieve elements by index from a set!**

```py
# numbers[0]
# 💥 TypeError: 'set' object is not subscriptable
```

You must iterate over them or convert the set to a list with `list(elements)`

```py
# ./python/m05_set_operations.py#L12-L14

# iterate over set elements
for val in numbers:
    print(val)
```

</div>

---

## Sets 2/2: Set Arithmetic

Sets are handy when you want to apply operations from set theory.

```py
# ./python/m05_set_arithmetic.py

a = {1, 2, 3, 4, 5}
b = {4, 5, 6, 7, 8}

print("a | b =", a | b)  # union
print("a & b =", a & b)  # intersection
print("a - b =", a - b)  # difference

# > a | b = {1, 2, 3, 4, 5, 6, 7, 8}
# > a & b = {4, 5}
# > a - b = {1, 2, 3}

```
