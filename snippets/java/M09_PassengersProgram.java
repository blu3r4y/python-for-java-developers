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
