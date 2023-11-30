import inout.Out;

class MaximumValue {
    public static void main(String[] args) {
        int[] numbers = {1, -10, 0, -5, -1000, 100, 7};

        int maximum = numbers[0];

        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }

        Out.println("The maximum value is " + maximum);
    }
}
