<!-- .slide: id="-classes" -->

# 🐍 Classes

<!-- .element: class="headline" -->

Python is object-oriented, but follows a more lean approach towards classes.

<div class="sidebyside">

```java
// ./java/M09_PassengersProgram.java#L4-L37

class Passenger {

    final String firstName;
    final String lastName;

    Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void display() {
        Out.println(firstName + " " + lastName);
    }
}

class PassengersProgram {

    static Passenger createPassengerFromInput() {
        Out.print("Enter first name: ");
        String firstName = In.readLine();
        Out.print("Enter last name: ");
        String lastName = In.readLine();

        return new Passenger(firstName, lastName);
    }

    public static void main(String[] args) {
        Passenger lisa = new Passenger("Lisa", "Ha");
        Passenger user = createPassengerFromInput();

        lisa.display();
        user.display();
    }
}
```

```py [|3|4-6|8-9|12-16|19-24|19|]
# ./python/m09_passengers_program.py

class Passenger:
    def __init__(self, first_name, last_name):
        self.first_name = first_name
        self.last_name = last_name

    def display(self):
        print(self.first_name + " " + self.last_name)


def create_passenger_from_input():
    first_name = input("Enter first name: ")
    last_name = input("Enter last name: ")

    return Passenger(first_name, last_name)


if __name__ == "__main__":
    lisa = Passenger("Lisa", "Ha")
    user = create_passenger_from_input()

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

#### Instantiation

- Creating a new object works similar, but you omit the `new` keyword
- The `main` method in Python is actually a condition - we will learn more in the next modules

</div>
