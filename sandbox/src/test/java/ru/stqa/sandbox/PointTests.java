package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Evolve Computing on 4/20/2016.
 */
public class PointTests {
  @Test
  public void testDistance() {
    Point p1 = new Point(5, 7);
    Point p2 = new Point(10, 14);
    Assert.assertEquals(Point.distance(p1, p2), 8.602325267042627);
    Assert.assertEquals(p2.distance(p1), 8.602325267042627);

  }


}
