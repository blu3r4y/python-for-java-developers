import java.util.*;

public class SumOfAllDigits {
    public static void main(String[] args) throws Exception {

        // int n = In.readInt();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();

        int digit_sum = 0;

        while (n > 0) {
            digit_sum += n % 10;
            n = n / 10;
        }

        System.out.println("The digit sum is " + digit_sum);

    }
}
