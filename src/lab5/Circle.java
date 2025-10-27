package lab5;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        if (center == null) throw new IllegalArgumentException("center cannot be null");
        if (radius <= 0.0) throw new IllegalArgumentException("radius must be > 0");
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() { 
        return center; 
    }

    public double getRadius() { 
        return radius; 
    }

    public double perimeter() {
        return 2.0 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}