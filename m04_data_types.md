<!-- .slide: id="-data-types" -->

# 🐍 Data Types

<!-- .element: class="headline" -->

We will only look into a few non-container data types of Python, which Java would call [**primitive types**](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html). \*  
Find all "built-in types" at [docs.python.org/3/library/stdtypes.html](https://docs.python.org/3/library/stdtypes.html)

- Numeric Types
- Text Types
- Boolean Types

💡 **In Python, you do not specify types explicitly!**
Although, you can have [**type hints**](https://docs.python.org/3/library/typing.html).

<small>\* You can think of a variable in Python as a "tag" or "name" that is attached to some object, and NOT as the "container" that holds some value. All types in Python are essentially objects, even the numeric, text, and boolean ones. However, don't wrap your head around this too much - as you will see, things turn out to behave quite similar to Java.</small>

<div class="fragment">

### Python is dynamically-typed

Unlike Java, you can re-assign values of different types to the same variable as you wish. \*\*

```py
x = 1416787301
x = "is"
x = True
```

<small>\*\* Speaking in the notion of "tags" and "names", this means that you can freely re-assign the "tag" or "name" to point to a different location.</small>

</div>

---

## Numeric Types 1/4

There are only exist the three numeric types `float` / `int` / `complex` in Python.

- `float` types in Python ➡ are equal to `double` types in Java \*
- There are NO `short` / `int` / `long` / "`float`" / `double` types in Python

```py
my_int = 5
my_float = 3.141
my_complex = 1 + 2j

# there are also some useful ways to write numbers
speed_of_light = 299_792_458
us_national_debt = 28.9e+12
ascii_symbol = 0x3f
input_bitmask = 0b1011_1001
```

<small>\* "Floating point numbers are usually implemented using `double` in C; information about the precision and internal representation of floating point numbers for the machine on which your program is running is available in `sys.float_info`" - see [docs.python.org/3/library/stdtypes.html#numeric-types-int-float-complex](https://docs.python.org/3/library/stdtypes.html#numeric-types-int-float-complex)</small>

---

## Numeric Types 2/4: Arbitrary Precision Integers

Integers in Python allow computations beyond usual integer limits without loss of precision.

```py
# ./python/m04_arbitrary_precision_integers.py

lightyear_to_meter = 9_460_730_472_580_800
min_milky_way_diameter = 170_000 * lightyear_to_meter

min_milky_way_diameter_plus_one = min_milky_way_diameter + 1

print("Woooooow, the milky way is at least", min_milky_way_diameter, "meters in diameter!")
print("Adding one meter on that, we are at", min_milky_way_diameter_plus_one, "meters.")

# > Woooooow, the milky way is at least 1608324180338736000000 meters in diameter!
# > Adding one meter on that, we are at 1608324180338736000001 meters.

```

---

## Numeric Types 3/4: Mathematical Expressions

Find them all at [docs.python.org/3/library/stdtypes.html#numeric-types-int-float-complex](https://docs.python.org/3/library/stdtypes.html#numeric-types-int-float-complex)

```py [|6-8|10-12|14-17|19-20|]
# ./python/m04_mathematical_expressions.py

x = 10.5
y = -3

print("x + y =", x + y)                  # addition
print("x - y =", x - y)                  # subtraction
print("x * y =", x * y)                  # multiplication

print("x / y =", x / y)                  # normal division
print("x // y =", x // y)                # integer division
print("x % y =", x % y)                  # modulo

print("abs(y) =", abs(y))
print("int(x) =", int(x))                # convert to integer
print("float(y) =", float(y))            # convert to float
print("complex(x, y) =", complex(x, y))  # convert to complex

print("pow(x, 3) =", pow(x, 3))          # exponentiation
print("x ** 3 =", x ** 3)                # exponentiation (alternative syntax)

```

---

## Numeric Types 4/4: Mathematical Functions

Find them all at [docs.python.org/3/library/math.html](https://docs.python.org/3/library/math.html)

```py
# ./python/m04_mathematical_functions.py

# we use function from this built-in package
import math

print("sqrt(16) =", math.sqrt(16))
print("5! =", math.factorial(5))
print("log(e) =", math.log(math.e))
print("sin(pi / 2) =", math.sin(math.pi / 2))

```

---

## Text Types

Strings in Python are [**immutable**](https://docs.python.org/3/glossary.html#term-immutable)\* - just like in Java.
When you modify strings, new memory is allocated.

```py
first_string = "Hello World"
second_string = 'Hello Python'

multi_line_strings = """This can even
hold line breaks
now"""
```

<small>\* Immutable, i.e., unchangeable, objects can not be modified after their creation.</small>

<div class="fragment">

### String Conversion

Many types in Python can be converted to a string with `str()` - similar to `.toString()` in Java.  
As seen in the example, if you concatenate a string with a non-string, you even have to. \*\*

<div class="sidebyside">

```java
// ./java/M04_StringConversion.java#L3-L4

int num = 42;
System.out.println("The number is " + num);
```

```py
# ./python/m04_string_conversion.py

num = 42
print("The number is " + str(num))

# alternative, which ONLY works for print()
print("The number is", num)

# print("The number is " + num)
# 💥 TypeError: can only concatenate str (not "int") to str

```

</div>

</div>

---

### String Concatenation

Use `str.join()` in Python to concatenate a large number of strings. \*

<div class="sidebyside">

```java
// ./java/M04_StringConcatenation.java#L3-L8

String a = "How";
String b = "to";
String c = "concatenate";
String d = "strings";

String result = String.join(" ", a, b, c, d);
```

```py
# ./python/m04_string_concatenation.py#L1-L7

a = "How"
b = "to"
c = "concatenate"
d = "strings"

# we learn more about lists in the next modules ...
result = " ".join([a, b, c, d])
```

</div>

<small>\* The equivalent of a [`StringBuilder`](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html) in Java would be [`io.StringIO`](https://docs.python.org/3.9/library/io.html#io.StringIO) in Python.</small>

---

## Boolean Types

```py
# ./python/m04_boolean_expressions.py

x = True
y = False

print("x or y =", x or y)    # logical or
print("x and y =", x and y)  # logical and
print("not x =", not x)      # logical not

```

<div class="fragment">

### Bitwise Expressions

You can also perform binary computations with bitwise operators.  
Find them all at [docs.python.org/3/library/stdtypes.html#bitwise-operations-on-integer-types](https://docs.python.org/3/library/stdtypes.html#bitwise-operations-on-integer-types)

```py
# ./python/m04_bitwise_expressions.py

port    = 0b1011_1011
bitmask = 0b0010_0000

is_bit_set = port & (bitmask >> 1)

# we learn more about formatting in the next module ...
print("dec:", is_bit_set)
print(f"bin: {is_bit_set:08b}")

# > dec: 16
# > bin: 00010000

```

</div>
