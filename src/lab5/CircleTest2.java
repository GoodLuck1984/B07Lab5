package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest2 {

  private double radius;
  private Point center;
  private Circle circle;

  @BeforeEach
  public void initialize() {
    radius = 2;
    center = new Point(5.5, -10);
    circle = new Circle(center, radius);
  }

  @Test
  public void testZeroRadius() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new Circle(center, 0);
        });
  }

  @Test
  public void testNegativeRadius() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new Circle(center, -1);
        });
  }

  @Test
  public void testNaNRadius() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new Circle(center, NaN);
        });
  }

  @Test
  public void testNullCenter() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new Circle(null, radius);
        });
  }

  @Test
  public void testGetCenter() {
    assertEquals(circle.getCenter(), center);
  }

  @Test
  public void testGetRadius() {
    assertEquals(circle.getRadius(), radius);
  }

  @Test
  public void testArea() {
    double expected = Math.PI * Math.pow(radius, 2);
    assertEquals(circle.area(), expected, 0.001);
  }

  @Test
  public void testPerimeter() {
    double expected = 2 * Math.PI * radius;
    assertEquals(circle.perimeter(), expected, 0.001);
  }
}
