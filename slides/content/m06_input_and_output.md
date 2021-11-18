<!-- .slide: id="input-and-output" -->

# 🐍 Input and Output
<!-- .element: class="headline" -->

## Input

You can read input from the command line with `input()`

```py
# ./python/m06_input.py#L1-L2

name = input("Please enter your name: ")
print("Your name is", name)
```

Don't forget data type conversions ...

```py
# ./python/m06_input.py#L4-L11

# this function will always give you a string
number = input("Please enter a number: ")

as_int = int(number)
as_float = float(number)

print(as_int, as_float)

```

---

## Output 1/2

You output something to the command line with `print()`

```py
# ./python/m06_output.py#L1-L14

pi = 3.141

print(pi)
print()
print("The value of pi is", pi)

# > 3.141
# >
# > The value of pi is 3.141

print("I hate: ", end="")
print("line breaks")

# > I hate: line breaks
```

Among many alternatives, [format strings](https://docs.python.org/3/library/string.html#string-formatting) are the recommended way to format output.

```py
# ./python/m06_output.py#L17-L19

print(f"The value of pi is {pi} and the value of tau is {2 * pi}")

# > The value of pi is 3.141 and the value of tau is 6.282
```

---

## Output 2/2: Number Formatting

Look them up when you need it at [gto76.github.io/python-cheatsheet/#format](https://gto76.github.io/python-cheatsheet/#format)

```py
# ./python/m06_number_formatting.py

pi = 3.14159265359
print(pi)

# > 3.14159265359

print(f"{pi:.0f}")     # no decimal places
print(f"{pi:.2f}")     # two decimal places
print(f"{pi:.3e}")     # scientific notation

# > 3
# > 3.14
# > 3.142e+00

ratio = 0.25
print(f"{ratio:.1%}")  # percentage

# > 25.0%

```
