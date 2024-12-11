package geometry;

public class RectangularPrism extends Geometry3D {
    private double length;
    private double width;
    private double height;

    public RectangularPrism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        calculateVolume();
        calculateSurfaceArea();
    }

    @Override
    public void calculateVolume() {
        volume = length * width * height;
    }

    @Override
    public void calculateSurfaceArea() {
        surfaceArea = 2 * (length * width + width * height + height * length);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
