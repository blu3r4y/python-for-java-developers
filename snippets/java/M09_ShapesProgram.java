interface Shape {
    double area();
}

class Circle implements Shape {

    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14159 * radius * radius;
    }
}

class Square implements Shape {

    final double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }
}

class ShapesProgram {

    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Square(10) };
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}
