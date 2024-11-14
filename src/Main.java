
abstract class Shape {

    public abstract double calculateArea();


    public abstract double calculatePerimeter();
}


class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Triangle extends Shape {
    private double a, b, c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}


public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);


        System.out.println("Koło:");
        System.out.println("Powierzchnia: " + circle.calculateArea());
        System.out.println("Obwód: " + circle.calculatePerimeter());

        System.out.println("\nTrójkąt:");
        System.out.println("Powierzchnia: " + triangle.calculateArea());
        System.out.println("Obwód: " + triangle.calculatePerimeter());
    }
}
