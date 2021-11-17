<!-- .slide: id="classes" -->

# 🐍 Classes
<!-- .element: class="headline" -->

Python is object-oriented as well, of course, though, it follows a more lean approach towards classes.
Let's have a look.

<div class="sidebyside">

```java
// ./java/M09_PassengersProgram.java#L3-L38

class Passenger {

    final String firstName;
    final String lastName;

    Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void print() {
        System.out.printf("%s %s %n", firstName, lastName);
    }

    static Passenger fromInput() {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        scanner.close();

        return new Passenger(firstName, lastName);
    }
}

class PassengersProgram {

    public static void main(String[] args) {
        Passenger lisa = new Passenger("Lisa", "Ha");
        Passenger user = Passenger.fromInput();

        lisa.print();
        user.print();
    }
}
```

```py
# ./python/m09_passengers_program.py

class Passenger:
    def __init__(self, first_name, last_name):
        self.first_name = first_name
        self.last_name = last_name

    def display(self):
        print(f"Passenger: {self.first_name} {self.last_name}")

    @staticmethod
    def from_input():
        first_name = input()
        last_name = input()

        return Passenger(first_name, last_name)

lisa = Passenger("Lisa", "Ha")
# user = Passenger.from_input()

lisa.display()
# user.display()

```

</div>

---

### What do we notice here?

- Python only ever has one constructor that is called `__init__` and must have the `self` parameter
    - Python has no method overloading
- We don't explicitly define the class properties `first_name` and `last_name`
    - You create them on-the-fly in the constructor
- What makes a function a method in Python is only governed by the explicit `self` parameter
    - And you always have to use `self.` if you want to access class properties
- A static method in Python needs the `@staticmethod` annotation and omits the `self` parameter
    - A static method just means that it won't access any class properties
- Creating a new object works similar in Python, but we omit the `new` keyword
- There are no access modifiers and there also is no `final` in Python

---

## Interfaces

What you might know from interfaces in Java can be achieved a little bit different with a dynamically-typed language like Python.

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
        Square square = new Square(10);
        Circle circle = new Circle(5);

        Shape[] shapes = {square, circle};
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}

```

```py
# ./python/m09_shapes_program.py

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

</div>

---

### What do we notice here?

- Because there is no hard type checking at compile-time, we can rely on duck-typing here
- However, for a better code structures, Python offers the following
    - abstract classes (see https://docs.python.org/3/library/abc.html)
    - protocols (see https://www.python.org/dev/peps/pep-0544/)
