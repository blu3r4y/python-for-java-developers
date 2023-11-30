<!-- .slide: id="-classes" -->

# 🐍 Classes

<!-- .element: class="headline" -->

Python is object-oriented, but follows a more lean approach towards classes.

<div class="sidebyside">

```java
// ./java/M09_PassengersProgram.java#L3-L40

class Passenger {

    final String firstName;
    final String lastName;

    Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void display() {
        System.out.printf("%s %s %n", firstName, lastName);
    }

    static Passenger fromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        scanner.close();

        return new Passenger(firstName, lastName);
    }
}

class PassengersProgram {

    public static void main(String[] args) {
        Passenger lisa = new Passenger("Lisa", "Ha");
        Passenger user = Passenger.fromInput();

        lisa.display();
        user.display();
    }
}
```

```py [|3|4-6|8-9|11-16|20-24|19|]
# ./python/m09_passengers_program.py

class Passenger:
    def __init__(self, first_name, last_name):
        self.first_name = first_name
        self.last_name = last_name

    def display(self):
        print(f"Passenger: {self.first_name} {self.last_name}")

    @staticmethod
    def from_input():
        first_name = input("Enter first name: ")
        last_name = input("Enter last name: ")

        return Passenger(first_name, last_name)


if __name__ == "__main__":
    lisa = Passenger("Lisa", "Ha")
    user = Passenger.from_input()

    lisa.display()
    user.display()

```

</div>

---

### What do we notice here?

<div class="fragment">

#### Constructors

- There is only one **constructor** that is called `__init__` with a mandatory `self` parameter
- Python does not support constructor overloading or **method overloading**
- We don't explicitly define the **class properties** `first_name` and `last_name`,  
  but you create them on-the-fly in the constructor or elsewhere

</div>
<div class="fragment">

#### Functions and methods

- What makes a function a method is only governed by the explicit `self` parameter
- You must always use `self.` if you want to access class properties
- There are no access modifiers and there is also no `final` in Python

</div>
<div class="fragment">

#### Static methods

- A **static method** needs the `@staticmethod` [**decorator**](https://docs.python.org/3/glossary.html#term-decorator) and omits the `self` parameter
- A static method just means that it won't access any class properties

</div>
<div class="fragment">

#### Instantiation

- Creating a new object works similar, but you omit the `new` keyword
- The `main` method in Python is actually a condition - we will learn more in the next modules

</div>

---

## Informal Interfaces

<div class="sidebyside">

```java
// ./java/M09_ShapesProgram.java

interface Shape {
    double area();
}

class Circle implements Shape {

    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14159 * radius * radius;
    }
}

class Square implements Shape {

    final double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }
}

class ShapesProgram {

    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Square(10) };
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}

```

```py [|3-5|8-13|16-21|24-26|]
# ./python/m09_shapes_program.py

class Shape:
    def area(self):
        pass


class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14159 * self.radius * self.radius


class Square(Shape):
    def __init__(self, length):
        self.length = length

    def area(self):
        return self.length * self.length


shapes = [Circle(5), Square(10)]
for shape in shapes:
    print(shape.area())

```

</div>

<div class="fragment">

### What do we notice here?

- There is no `interface` type in Python, instead we use a normal `class` and inhert from it
- Methods are overridden without an explicit annotation - they are always replaced
- No type checks are enforced by Python, try removing `Shape` or renaming the `area()` method ...

</div>

---

## Duck-Typing

Since there is NO type-checking at compile-time, we may also solely rely on [**duck-typing**](https://docs.python.org/3/glossary.html#term-duck-typing).  
An `AttributeError` is thrown at runtime, if the method you are calling wouldn't exist. \*

```py [|3-16|19-21|21|]
# ./python/m09_shapes_duck_typing.py

class Circle:
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14159 * self.radius * self.radius


class Square:
    def __init__(self, length):
        self.length = length

    def area(self):
        return self.length * self.length


shapes = [Circle(5), Square(10)]
for shape in shapes:
    print(shape.area())

```

<div class="fragment">

### But, how can I have a "real" interfaces and inheritance in Python?

- Use abstract classes via the [**`abc` module**](https://docs.python.org/3/library/abc.html)
- Learn more about formal interfaces at [realpython.com/python-interface](https://realpython.com/python-interface/)

</div>

<small>\* Look into [**type hints**](https://docs.python.org/3/library/typing.html) to have better type-checking at runtime and even before you run your code.</small>
