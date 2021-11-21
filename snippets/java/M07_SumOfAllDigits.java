import java.util.*;

class SumOfAllDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int digitSum = 0;

        while (n > 0) {
            digitSum += n % 10;
            n = n / 10;
        }

        System.out.println("The digit sum is " + digitSum);
    }
}
