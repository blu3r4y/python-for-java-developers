<!-- .slide: id="data-types" -->

# 🐍 Data Types
<!-- .element: class="headline" -->

We will only have a look at just a few data types in Python.  
Find them all at [docs.python.org/3/library/stdtypes.html](https://docs.python.org/3/library/stdtypes.html)

**In Python, you do not specify types explicitly.**  
Although, you can have "type hints", learn more at [docs.python.org/3/library/typing.html](https://docs.python.org/3/library/typing.html)

---

## Numeric Types

There are only three numeric types in Python.  
`float` types are internally represented as `double` data types, like you know from Java.

In contrast to Java, there is NO differentiation into `short` / `int` / `long` / `float` / `double` types.

Learn more at https://docs.python.org/3/library/stdtypes.html#numeric-types-int-float-complex

```py
my_int = 5
my_float = 3.141
my_complex = 1 + 2j

# there are also some useful ways to write numbers
us_national_debt = 27.8e+12
ascii_symbol = 0x3f
input_bitmask = 0b1011_1001
```

Furthermore, integers do have arbitrary precision. And you can still do math with them.  
And you can use a `_` sign as a thousand separator if you wish.

```py [|3-8|10-14|]
# ./python/m04_arbitrary_precision_integers.py

lightyear_to_meter = 9_460_730_472_580_800
min_milky_way_diameter = 170_000 * lightyear_to_meter

print("The milky way is at least", min_milky_way_diameter, "meters in diameter")

# > The milky way is at least 1608324180338736000000 meters in diameter

distance_to_proxima_centauri = 4.24 * lightyear_to_meter

print("The star Proxima Centauri is", distance_to_proxima_centauri, "meters away from the earth")

# > The star Proxima Centauri is 4.011349720374259e+16 meters away from the earth

```

---

### Mathematical Expressions

This is just a brief teaser. We will do some more later on.

```py [|3-4|6-8|10-12|14-17|19-20|]
# ./python/m04_mathematical_expressions.py

x = 10.5
y = -3

print("x + y =", x + y)
print("x - y =", x - y)
print("x * y =", x * y)

print("x / y =", x / y)
print("x // y =", x // y)                # integer division
print("x % y =", x % y)                  # modulo

print("abs(y) =", abs(y))
print("int(x) =", int(x))                # convert to integer
print("float(y) =", float(y))            # convert to float
print("complex(x, y) =", complex(x, y))  # convert to complex

print("pow(x, 3) =", pow(x, 3))          # exponentiation
print("x ** 3 =", x ** 3)                # exponentiation (alternative)

```

### Mathematical Functions

```py [|3-4|6|8|10|12|]
# ./python/m04_mathematical_functions.py

# let's load our first package that holds a lot of mathematical functions
import math

print("sqrt(16) =", math.sqrt(16))

print("5! =", math.factorial(5))

print("log(e) =", math.log(math.e))

print("sin(pi / 2) =", math.sin(math.pi / 2))

```

---

## Text Types

Strings in Python are immutable, just like in Java.  
This means, if you modify, or concatenate strings, new memory will be allocated.

```py
first_string = "Hello World"
second_string = 'Hello Python'

multi_line_strings = """This can even
hold line breaks
now"""
```

---

## Boolean Types

Strings in Python are immutable, just like in Java.  
This means, if you modify, or concatenate strings, new memory will be allocated.

```py
yea = True
nay = False
```

### Boolean Expressions

```py [|3-8|10-21|]
# ./python/m04_boolean_expressions.py

x = True
y = False

print("x | y =", x | y)  # bitwise or
print("x & y =", x & y)  # bitwise and
print("x ^ y =", x ^ y)  # exclusive or

# this is especially useful for some binary computations

port    = 0b1011_1011
bitmask = 0b0010_0000

result = port & (bitmask >> 1)

print(result)
print(f"{result:08b}")  # we learn more about formatting in the next section ...

# > 16
# > 00010000

```
