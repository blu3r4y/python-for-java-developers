<!-- .slide: id="input-and-output" -->

# 🐍 Input and Output
<!-- .element: class="headline" -->

You output something with `print()` and you can read input with `input()`

```py [|3-7|9-12|14-15|]
# ./python/output.py

pi = 3.141

print(pi)
print()
print("The value of pi is", pi)

print("I ", end="")
print("hate ", end="")
print("line ", end="")
print("breaks ", end="")

# this is a so-called format string
print(f"The value of pi is {pi} and the value of tau is {2 * pi}")

```

---

## Number Formatting

See also [gto76.github.io/python-cheatsheet/#format](https://gto76.github.io/python-cheatsheet/#format)

```py
# ./python/output_numbers.py

pi = 3.14159265359
ratio = 0.25

print(pi)

print()

print(f"{pi:.0f}")     # no decimal places
print(f"{pi:.2f}")     # two decimal places
print(f"{pi:.3e}")     # scientific notation

print(f"{ratio:.1%}")  # percentage

```

---

## Input

```py
# ./python/input.py

name = input("Please enter your name: ")
print("Your name is", name)

# this function will always give you a string
text = input("Please enter a number: ")

# you need to convert the types
as_int = int(text)
as_float = float(text)

print(as_int, as_float)

```
