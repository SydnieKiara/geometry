package geometry;

public abstract class Geometry3D {
    protected double volume;
    protected double surfaceArea;

    // Abstract methods to be implemented by subclasses
    public abstract void calculateVolume();
    public abstract void calculateSurfaceArea();

    // Getter methods
    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
}
