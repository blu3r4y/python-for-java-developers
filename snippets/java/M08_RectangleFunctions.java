class RectangleFunctions {
    static double area(double a, double b) {
        return a * b;
    }

    static boolean isSquare(double a, double b) {
        return a == b;
    }

    public static void main(String[] args) {
        System.out.println("area(1, 5) = " + area(1, 5));
        System.out.println("area(1.5, 2.3) = " + area(1.5, 2.3));

        System.out.println("isSquare(1, 5) = " + isSquare(1, 5));
        System.out.println("isSquare(5, 5) = " + isSquare(5, 5));
    }
}
