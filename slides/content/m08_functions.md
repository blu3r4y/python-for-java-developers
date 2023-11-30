<!-- .slide: id="-functions" -->

# 🐍 Functions

<!-- .element: class="headline" -->

<div class="sidebyside">

```java
// ./java/M08_RectangleFunctions.java#L4-L18

static double area(double a, double b) {
    return a * b;
}

static boolean isSquare(double a, double b) {
    return a == b;
}

public static void main(String[] args) {
    Out.println("area(1, 5) = " + area(1, 5));
    Out.println("area(1.5, 2.3) = " + area(1.5, 2.3));

    Out.println("isSquare(1, 5) = " + isSquare(1, 5));
    Out.println("isSquare(5, 5) = " + isSquare(5, 5));
}
```

```py
# ./python/m08_rectangle_functions.py#L1-L13

def area(a, b):
    return a * b


def is_square(a, b):
    return a == b


print("area(1, 5) =", area(1, 5))
print("area(1.5, 2.3) =", area(1.5, 2.3))

print("is_square(1, 5) =", is_square(1, 5))
print("is_square(5, 5) =", is_square(5, 5))
```

</div>

<div class="fragment">

### What do we notice here?

- Functions are defined with `def`
- Python does not have any access modifiers nor the `static` keyword
- You don't have to specify any types on the function parameters - this is called [**duck-typing**](https://docs.python.org/3/glossary.html#term-duck-typing)

</div>

---

## What else is different with Python functions? 1/3

<div class="fragment">

You can specify argument names explicitly - and even change their order.

```py
# ./python/m08_rectangle_functions.py#L17-L18

area(a=2, b=5)
area(b=5, a=2)
```

</div>
<div class="fragment">

You can specify default values for arguments.

```py
# ./python/m08_function_differences.py#L1-L12

def function_with_default_args(x, y, name="Unknown User", factor=1.2):
    result = x * y * factor
    print(f"Hello {name}, your result is {result}")


function_with_default_args(1, 2)
function_with_default_args(1, 2, name="Mario")
function_with_default_args(1, 2, factor=10)

# > Hello Unknown User, your result is 2.4
# > Hello Mario, your result is 2.4
# > Hello Unknown User, your result is 20
```

</div>

---

## What else is different with Python functions? 2/3

You can return multiple results with tuples and destructuring.

```py
# ./python/m08_function_differences.py#L15-L30

def function_with_two_return_values(radius):
    pi = 3.14159

    circumference = 2 * pi * radius
    area = pi * radius ** 2

    return circumference, area


c, a = function_with_two_return_values(5)

print("circumference", c)
print("area", a)

# > circumference 31.4159
# > area 78.53975
```

---

## What else is different with Python functions? 3/3

- You can declare functions inside functions
- You can declare anonymous functions, called [**lambda expressions**](https://docs.python.org/3/reference/expressions.html#lambda)
- You can overwrite and change functions on-the-fly, just like variables  
  _("functions are first-class-citizens in Python")_
- You can use **[`*args` and `**kwargs`](https://docs.python.org/3/glossary.html#term-parameter)** to work with almost arbitrary input parameters, which you already did use in the `print()` function for example

Learn more about funtions at [docs.python.org/3/tutorial/controlflow.html#more-on-defining-functions](https://docs.python.org/3/tutorial/controlflow.html#more-on-defining-functions).
