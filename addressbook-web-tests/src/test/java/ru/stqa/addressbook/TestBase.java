package ru.stqa.addressbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Evolve Computing on 4/24/2016.
 */
public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();

  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
