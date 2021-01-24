import java.util.*;

class Passenger {
    
    final String firstName;
    final String lastName;

    Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void print() {
        System.out.println(String.format("%s %s", firstName, lastName));
    }

    static Passenger fromInput() {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        scanner.close();

        return new Passenger(firstName, lastName);
    }
}

public class PassengerProgram {

    public static void main(String[] args) throws Exception {
        Passenger lisa = new Passenger("Lisa", "Ha");
        Passenger user = Passenger.fromInput();

        lisa.print();
        user.print();
    }
}
