package geometry;

//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import geometry.RectangularPrism;

public class RectangularPrismTest {
    private RectangularPrism prism;

    @BeforeEach
    public void setUp() {
        // Initialize a RectangularPrism object before each test
        prism = new RectangularPrism(4, 5, 6); // Example dimensions
    }

    @org.junit.jupiter.api.Test
    public void testCalculateVolume() {
        double expectedVolume = 4 * 5 * 6; // V = length * width * height
        prism.calculateVolume();
        assertEquals(expectedVolume, prism.getVolume(), 0.001);
    }

    @org.junit.jupiter.api.Test
    public void testCalculateSurfaceArea() {
        double expectedSurfaceArea = 2 * ((4 * 5) + (4 * 6) + (5 * 6)); // SA = 2 * (lw + lh + wh)
        prism.calculateSurfaceArea();
        assertEquals(expectedSurfaceArea, prism.getSurfaceArea(), 0.001);
    }
}
