<!-- .slide: id="examples" -->

# 🐍 Examples
<!-- .element: class="headline" -->

## Basic control flow

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

### What do we notice here?

- Python has no `switch` expression, you have to make a cascade of `if`, `elif` and `else` statements

---

## Sum of all digits

<div class="sidebyside">

```java
// ./java/M07_SumOfAllDigits.java#L6-L18

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = Integer.parseInt(scanner.nextLine());
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

### What do we notice here?

- Reading from user input is easier in Python with `input()`
- The `while` loop also exists in Python
- We use an explicit integer division `//` in Python, but use a normal division `/` in Java

```py
# unlike Java, a division will alwasy give you a float data type
5 / 2

# unless you want an explicit integer division
5 // 2
```

---

## Iterating over a list of elements

<div class="sidebyside">

```java
// ./java/M07_IteratingOverNames.java#L3-L7

String[] names = {"Lisa", "John", "Susan", "Alex"};

for (String name : names) {
    System.out.println(name);
}
```

```py
# ./python/m07_iterating_over_names.py

names = ["Lisa", "John", "Susan", "Alex"]

for name in names:
    print(name)

```

</div>

---

## Fun with lists

<div class="sidebyside">

```java
// ./java/M07_FunWithLists.java#L3-L7

int[] numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

for (int i = 5; i < 8; i++) {
    System.out.println(numbers[i]);
}
```

```py
# ./python/m07_fun_with_lists.py

numbers = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

for i in range(5, 8):
    print(numbers[i])

```

</div>

### What do we notice here?

- Python always requires you to use the `x in y` syntax with a `for` loop
- To replicate the behavior you might know, you have to use `range(start, stop)` that will give you numbers from `start` to `stop - 1`
- Actually, it will give you an **iterator** object - if you really want the numbers in a list, you have to convert it to a list

```py
range(5, 8)

list(range(5, 8))
```

---

## Slicing

Use cases like the one before are usually solved by slicing a list with Python.

This is also very useful for mathematical applications, e.g. when working with a lot of arrays and matrices.

The following variants are supported:

- `a[start:stop:step]`
- `a[start:stop]`
- `a[start:]`
- `a[:stop]`
- `a[:]` (copy the entire list)

```py
numbers = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

# give me a new COPY of the list, starting at index 5, and ending at index 7
numbers[5:8]

# everything except the first value
numbers[1:]

# everything except the last value
numbers[:-1]

# the last two items
numbers[-2:]

# give me every second value
numbers[::2]

# start with the second value, then give me every second value
numbers[1::2]

# this also works with strings (which are just arrays of characters)
name = "Hello World"
name[1:-1]
```

---

## Reversing

Use `.reverse()` for in-place reversals or `reversed()` to get an reversed copy (actually, an iterator).

```py
# easily reverse any list
name[::-1]

# however, most likely you should use the `reversed` function
# which, again, gives you an iterator

list(reversed(numbers))

numbers = [1, -10, 20, 11, 19, 0, -5, -1000, 100, 7]

# or, reverse something in-place
numbers.reverse()
numbers
```

---

## Sorting

Use `.sort()` for in-place sorting or `sorting()` to get a sorted copy (actually, an iterator).

```py
numbers = [1, -10, 20, 11, 19, 0, -5, -1000, 100, 7]

sorted(numbers)

# or, sort something in-place
numbers.sort()
numbers

# and, in reverse order
sorted(numbers, reverse=True)
```

---

## Enumerating

<div class="sidebyside">

```java
// ./java/M07_EnumeratingOverNames.java#L3-L9

String[] names = {"Lisa", "John", "Susan", "Alex"};

int i = 0;
while (i < names.length) {
    System.out.println(i + " " + names[i]);
    i++;
}
```

```py
# ./python/m07_enumerating_over_names.py

names = ["Lisa", "John", "Susan", "Alex"]

for i, name in enumerate(names):
    print(i, name)

```

</div>

### What do we notice here?

- Our loop iterates over two values now (actually, `enumerate()` creates tuples for us here)

---

## List Comprehension

While we won't cover functional programming with `map`, `filter`, `reduce` yet, we can not miss list comprehensions.

List comprehensions work by mapping each value in a list to a new value and thus creating a new list.

`[x for x in list]`

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
# ./python/m07_price_tax.py

prices = [12.3, 5.2, 8.7, 1.2, 8.0]
gross = []

for price in prices:
    if price > 8:
        gross.append(price * 1.2)

print(gross)

```

</div>

```py
# but, in Python you can even do this

prices = [12.3, 5.2, 8.7, 1.2, 8.0]
gross = [price * 1.2 for price in prices if price > 8]

print(gross)
```
