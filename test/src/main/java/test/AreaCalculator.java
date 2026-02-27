package test7;

abstract class Shape {

    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
public class AreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println("원의 넓이:" + circle.calculateArea());

        Shape rectangle = new Rectangle(5, 8);
        System.out.println("사각형의 넓이:" + rectangle.calculateArea());
    }
}