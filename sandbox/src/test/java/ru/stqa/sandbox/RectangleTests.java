package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Evolve Computing on 4/20/2016.
 */
public class RectangleTests {

  @Test
  public void testArea() {
    Rectangle s = new Rectangle(4, 6);
    Assert.assertEquals(s.area(), 24.0);
  }
}
