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
