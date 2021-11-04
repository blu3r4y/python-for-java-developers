import java.util.*;

public class MaximumValue {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = Arrays.asList(1, -10, 0, -5, -1000, 100, 7);

        int maximum = numbers.get(0);

        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }

        System.out.println("The maximum value is " + maximum);
    }
}
