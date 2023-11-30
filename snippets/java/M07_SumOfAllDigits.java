import inout.In;
import inout.Out;

class SumOfAllDigits {
    public static void main(String[] args) {
        Out.print("Enter a number: ");
        int n = In.readInt();

        int digitSum = 0;

        while (n > 0) {
            digitSum += n % 10;
            n = n / 10;
        }

        Out.println("The digit sum is " + digitSum);
    }
}
