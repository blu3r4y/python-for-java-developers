public class RectangleFunctions {
    public static void main(String[] args) {
        System.out.println("rectangleArea(1, 5) = " + rectangleArea(1, 5));
        System.out.println("rectangleArea(1.5, 2.3) = " + rectangleArea(1.5, 2.3));

        System.out.println("isSquare(1, 5) = " + isSquare(1, 5));
        System.out.println("isSquare(5, 5) = " + isSquare(5, 5));
    }

    static double rectangleArea(double a, double b) {
        return a * b;
    }

    static boolean isSquare(double a, double b) {
        return a == b;
    }
}
