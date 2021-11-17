<!-- .slide: id="functions" -->

# 🐍 Functions
<!-- .element: class="headline" -->

<div class="sidebyside">

```java
// ./java/M08_RectangleFunctions.java#L2-L16

public static void main(String[] args) {
    System.out.println("rectangleArea(1, 5) = " + rectangleArea(1, 5));
    System.out.println("rectangleArea(1.5, 2.3) = " + rectangleArea(1.5, 2.3));

    System.out.println("isSquare(1, 5) = " + isSquare(1, 5));
    System.out.println("isSquare(5, 5) = " + isSquare(5, 5));
}

static double rectangleArea(double a, double b) {
    return a * b;
}

static boolean isSquare(double a, double b) {
    return a == b;
}
```

```py
# ./python/m08_rectangle_functions.py

def rectangleArea(a, b):
    return a * b

def isSquare(a, b):
    return a == b

print("rectangleArea(1, 5) =", rectangleArea(1, 5))
print("rectangleArea(1.5, 2.3) =", rectangleArea(1.5, 2.3))

print("isSquare(1, 5) =", isSquare(1, 5))
print("isSquare(5, 5) =", isSquare(5, 5))

```

</div>

### What do we notice here?

- Functions are defined with `def`
- Python does not have access modifiers nor the `static` keyword
- You also don't have to specify any types on the function parameters (this is called duck-typing)

---

### A few more notes about functions in Python

```py
# you can specify argument names explicitly (and even change the order)
print(rectangleArea(a=2, b=5))
print(rectangleArea(b=5, a=2))
```

```py
def function_with_default_values(x, y, name="Unknown User", factor=1.2):
    result = x * y * factor
    print(f"Hello {name}, your result is {result}")
    
function_with_default_values(1, 2)
function_with_default_values(1, 2, name="Mario")
function_with_default_values(1, 2, factor=10)
```

```py
def function_with_two_return_values(radius):
    pi = 3.14159
    
    circumference = 2 * pi * radius
    area = pi * radius ** 2
    
    return circumference, area

function_with_two_return_values(5)
```

```py
c, a = function_with_two_return_values(5)

print("circumference", c)
print("area", a)
```

---

### There is more to functions that we don't cover here

- You can have functions inside functions
- You can have anonymous functions, called lambda expressions
- You can overwrite and change functions on-the-fly, just like variables ("functions are first-class-citizens in Python")
- You can use `*args` and `**kwargs` to work with almost arbitrary input parameters
    - The `print()` function does use this for example
- ...
