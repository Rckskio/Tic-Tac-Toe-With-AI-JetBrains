abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    double a;
    double b;
    double c;
    double perimeter;
    double area;
    double semiPerimeter;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimeter = a + b + c;
        this.semiPerimeter = perimeter / 2;
        this.area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    double getPerimeter() {
        return perimeter;
    }

    double getArea() {
        return area;
    }
}

class Rectangle extends Shape {
    double a;
    double b;
    double perimeter;
    double area;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.perimeter = a + a + b + b;
        this.area = a * b;
    }

    double getPerimeter() {
        return perimeter;
    }

    double getArea() {
        return area;
    }
}

class Circle extends Shape {
    double radius;
    double pi;
    double perimeter;
    double area;

    public Circle(double radius) {
        this.radius = radius;
        this.pi = Math.PI;
        this.perimeter = 2 * pi * radius;
        this.area = pi * (radius * radius);
    }

    double getPerimeter() {
        return perimeter;
    }

    double getArea() {
        return area;
    }
}