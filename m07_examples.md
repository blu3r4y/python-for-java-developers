<!-- .slide: id="-examples" -->

# 🐍 Examples

<!-- .element: class="headline" -->

## Basic Control Flow

<div class="sidebyside">

```java
// ./java/M07_BasicControlFlow.java#L3-L17

int x = 0;

switch (x) {
    case 0:
        System.out.println("The value is 0");
        break;
    case 1:
        System.out.println("The value is 1");
        break;
    case 2:
        System.out.println("The value is 2");
        break;
    default:
        System.out.println("The value is something else");
}
```

```py
# ./python/m07_basic_control_flow.py

x = 0

if x == 0:
    print("The value is 0")
elif x == 1:
    print("The value is 1")
elif x == 2:
    print("The value is 2")
else:
    print("The value is something else")

```

</div>

<div class="fragment">

### What do we notice here?

- Python has no `switch` expression, you have to make a cascade of `if` / `elif` / `else` statements \*

<small>\* Actually, if you are using **Python 3.10** or newer, there are the new `match` and `case` statements now.</small>

</div>

---

## Sum of all Digits

<div class="sidebyside">

```java
// ./java/M07_SumOfAllDigits.java#L6-L18

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scanner.nextInt();
scanner.close();

int digitSum = 0;

while (n > 0) {
    digitSum += n % 10;
    n = n / 10;
}

System.out.println("The digit sum is " + digitSum);
```

```py
# ./python/m07_sum_of_all_digits.py

n = int(input('Enter a number: '))

digit_sum = 0

while n > 0:
    digit_sum += n % 10
    n = n // 10

print("The digit sum is ", digit_sum)

```

</div>

<div class="fragment">

### What do we notice here?

- Reading from user input is done with `input()` and can also output a prompt
- The `while` loop also exists in Python
- We use an explicit integer division `//` in Python, but use a normal division `/` in Java

```py
# unlike Java, a division will alwasy give you a float data type
assert 5 / 2 == 2.5

# unless you want an explicit integer division
assert 5 // 2 == 2
```

<small>\* `assert` will raise an `AssertionError` if the condition is `False` - use it to check assumptions in your code.</small>

</div>

---

## Iterating over Elements 1/2: By Value

<div class="sidebyside">

```java
// ./java/M07_IteratingElementsByValue.java#L3-L7

String[] names = {"Lisa", "John", "Susan", "Alex"};

for (String name : names) {
    System.out.println(name);
}
```

```py
# ./python/m07_iterating_elements_by_value.py

names = ["Lisa", "John", "Susan", "Alex"]

for name in names:
    print(name)

```

</div>

<div class="fragment">

### What do we notice here?

- Iteration over a list of elements is quite similar in Java and python

</div>

---

## Iterating over Elements 2/2: By Index

<div class="sidebyside">

```java
// ./java/M07_IteratingElementsByIndex.java#L3-L7

int[] numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

for (int i = 5; i < 8; i++) {
    System.out.println(numbers[i]);
}
```

```py
# ./python/m07_iterating_elements_by_index.py

numbers = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

for i in range(5, 8):
    print(numbers[i])

```

</div>

<div class="fragment">

### What do we notice here?

- Python only supports the `x in y` syntax with a `for` loop
- To replicate the behavior you might know, you have to use `range(start, stop)`,  
  which will give you numbers from `start` to `stop - 1`

</div>
<div class="fragment">

💡 **Actually, `range()` will give you an [iterator](https://docs.python.org/3/glossary.html#term-iterator)!**

If you really want the numbers in a list, you have to convert the result.

```py
# iterators only allow getting the next element with next()
range(5, 8)

# lists allow arbitrary access by index
list(range(5, 8))
```

</div>

---

## 🐍 Advanced Operations on Sequences

<!-- .element: class="headline" -->

## Sequence Slicing 1/2

Examples like the one before are usually solved by slicing list-like collections.  
This is also very useful for mathematical applications, e.g. when working with a lot of arrays and matrices.

```py
# ./python/m07_sequence_slicing.py#L1-L5

numbers = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

numbers[5:8]   # give me a new COPY of the list, starting at index 5, and ending at index 7

# > [15, 16, 17]
```

<div class="fragment">

The following variants are supported:

- `a[start:stop:step]`
- `a[start:stop]`
- `a[start:]`
- `a[:stop]`
- `a[:]`

**The `stop` index is always exclusive**, i.e. the element at index `stop` is not part of the resulting slice.

</div>

---

## Sequence Slicing 2/2: Examples

<!-- embedme ./python/m07_sequence_slicing.py#L1-L1 -->

```py
numbers = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
```

```py [|3-4|6-7|9-10|]
# ./python/m07_sequence_slicing.py#L7-L14

numbers[1:]    # all except the 1st item    > [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
numbers[:3]    # the first three items      > [10, 11, 12]

numbers[:-1]   # all except the last item   > [10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
numbers[-2:]   # the last two items         > [19, 20]

numbers[::2]   # every 2nd item             > [10, 12, 14, 16, 18, 20]
numbers[1::2]  # every 2nd, but start at 2  > [11, 13, 15, 17, 19]
```

<div class="fragment">

This also works with strings because they are just a list of characters.

```py
# ./python/m07_sequence_slicing.py#L17-L20

name = "Hello World"
name[1:-1]

# > 'ello Worl'
```

</div>

---

## Sequence Reversing

- Use `reversed(a)` to iterate over the sequence in reverse order
- Use `a.reverse()` on the object to reverse the items in-place
- Slice out a reversed copy of the elements with `a[::-1]`

```py [|5-6|8-9|11-12|]
# ./python/m07_sequence_reversing.py

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# iterator that iterates the list in reverse order
reversed(numbers)

# reverse the list in-place
numbers.reverse()

# slice a reversed copy of the elements
numbers[::-1]

```

---

## Sequence Sorting

- Use `sorted(a)` to get a sorted list of the elements
- Use `a.sort()` to sort the sequence in-place
- Use the `reverse=True` [**keyword argument**](https://docs.python.org/3/glossary.html#term-argument) to reverse the sorting order

```py [|5-7|9-11|]
# ./python/m07_sequence_sorting.py

numbers = [1, -10, 20, 11, 19, 0, -5, -1000, 100, 7]

# get a sorted list of the elements
sorted(numbers)
sorted(numbers, reverse=True)

# sort the list in-place
numbers.sort()
numbers.sort(reverse=True)

```

---

## Enumerating over Elements

<div class="sidebyside">

```java
// ./java/M07_EnumeratingOverElements.java#L3-L9

String[] names = {"Lisa", "John", "Susan", "Alex"};

int i = 0;
while (i < names.length) {
    System.out.println(i + " " + names[i]);
    i++;
}
```

```py
# ./python/m07_enumerating_over_elements.py

names = ["Lisa", "John", "Susan", "Alex"]

for i, name in enumerate(names):
    print(i, name)

```

</div>

<div class="fragment">

### What do we notice here?

- Our loop iterates over two values now - `enumerate()` creates tuples for us here

</div>

---

## Price Tax Computation

<div class="sidebyside">

```java
// ./java/M07_PriceTax.java#L5-L16

List<Double> prices = Arrays.asList(12.3, 5.2, 8.7, 1.2, 8.0);
List<Double> gross = new ArrayList<Double>();

for (double price : prices) {
    if (price > 8) {
        gross.add(price * 1.2);
    }
}

for (double price : gross) {
    System.out.println(price);
}
```

```py
# ./python/m07_price_tax.py#L1-L8

prices = [12.3, 5.2, 8.7, 1.2, 8.0]
gross = []

for price in prices:
    if price > 8:
        gross.append(price * 1.2)

print(gross)

```

</div>

<div class="fragment">

### 💡 List Comprehension

List comprehensions map each value in a list to a new value and thus create a new list. \*

`[x for x in sequence]`

```py
# ./python/m07_price_tax.py#L11-L12

prices = [12.3, 5.2, 8.7, 1.2, 8.0]
gross = [price * 1.2 for price in prices if price > 8]
```

<small>\* Python offers a lot of features for functional programming, like [`map`](https://docs.python.org/3/library/functions.html#map) / [`filter`](https://docs.python.org/3/library/functions.html#filter) / [`reduce`](https://docs.python.org/3/library/functools.html#functools.reduce) / [`zip`](https://docs.python.org/3/library/functions.html#zip) / [`all`](https://docs.python.org/3/library/functions.html#all) / [`any`](https://docs.python.org/3/library/functions.html#any) / ...</small>

</div>
