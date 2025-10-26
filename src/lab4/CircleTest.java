package lab4; 

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class CircleTest {
	
	private static final double EPSILON = 1e-6; 
    private Point center;
    private Circle circle;
    
    @BeforeEach
    public void setUp() {
 
        center = new Point(10, 10); 
        circle = new Circle(center, 5.0);
    }

    @Test
    public void testConstructorAndGetters() {
        // constructor and getters work
        assertEquals(center, circle.getCenter());
        assertEquals(5.0, circle.getRadius());
    }

    @Test
    public void testArea() {
        // the area() method
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, circle.area(), 0.001); //delta for double comp
    }

    @Test
    public void testPerimeter() {
        // the perimeter() method
        double expectedPerimeter = 2.0 * Math.PI * 5.0;
        assertEquals(expectedPerimeter, circle.perimeter(), 0.001);
    }

    @Test
    public void testConstructorErrorNullCenter() {
        // the "if (center == null)" check
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(null, 5.0);
        });
    }

    @Test
    public void testConstructorErrorZeroRadius() {
        // the "if (radius <= 0.0)" check
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(center, 0.0);
        });
    }
    @Test
    public void testConstructorErrorNegativeRadius() {
            // the "if (radius <= 0.0)" check with a negative number
    	assertThrows(IllegalArgumentException.class, () -> {
    		new Circle(center, -5.0);
            });
 
    }
}
