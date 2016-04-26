package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Evolve Computing on 4/25/2016.
 */
public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.xpath("//div[@id='content']/form/input[4]"));
  }
}
