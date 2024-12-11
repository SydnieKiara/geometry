package geometry;

public abstract class Geometry2D {
    protected double area;
    protected double perimeter;

    // Abstract methods to be implemented by subclasses
    public abstract void calculateArea();
    public abstract void calculatePerimeter();

    // Getter methods
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

