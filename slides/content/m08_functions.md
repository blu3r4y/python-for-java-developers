<!-- .slide: id="functions" -->

# 🐍 Functions
<!-- .element: class="headline" -->

<div class="sidebyside">

```java
// ./java/M08_RectangleFunctions.java#L2-L16

static double rectangleArea(double a, double b) {
    return a * b;
}

static boolean isSquare(double a, double b) {
    return a == b;
}

public static void main(String[] args) {
    System.out.println("rectangleArea(1, 5) = " + rectangleArea(1, 5));
    System.out.println("rectangleArea(1.5, 2.3) = " + rectangleArea(1.5, 2.3));

    System.out.println("isSquare(1, 5) = " + isSquare(1, 5));
    System.out.println("isSquare(5, 5) = " + isSquare(5, 5));
}
```

```py
# ./python/m08_rectangle_functions.py#L1-L13

def rectangle_area(a, b):
    return a * b


def is_square(a, b):
    return a == b


print("rectangleArea(1, 5) =", rectangle_area(1, 5))
print("rectangleArea(1.5, 2.3) =", rectangle_area(1.5, 2.3))

print("isSquare(1, 5) =", is_square(1, 5))
print("isSquare(5, 5) =", is_square(5, 5))
```

</div>

### What do we notice here?

- Functions are defined with `def`
- Python does not have any access modifiers nor the `static` keyword
- You don't have to specify any types on the function parameters - this is called [**duck-typing**](https://docs.python.org/3/glossary.html#term-duck-typing)

---

## What else is different with Python functions? 1/3

You can specify argument names explicitly - and even change their order.

```py
# ./python/m08_rectangle_functions.py#L17-L18

rectangle_area(a=2, b=5)
rectangle_area(b=5, a=2)
```

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
- You can use [**`*args` and `**kwargs`**](https://docs.python.org/3/glossary.html#term-parameter) to work with almost arbitrary input parameters,  
  which you already did use in the `print()` function for example

Learn more about funtions at [docs.python.org/3/tutorial/controlflow.html#more-on-defining-functions](https://docs.python.org/3/tutorial/controlflow.html#more-on-defining-functions).
