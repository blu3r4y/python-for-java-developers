import inout.In;
import inout.Out;

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

    static Passenger fromInput() {
        Out.print("Enter first name: ");
        String firstName = In.readLine();
        Out.print("Enter last name: ");
        String lastName = In.readLine();

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
