package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Evolve Computing on 4/25/2016.
 */
public class NavigationHelper {
 private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd =wd;
  }

  public void gotoGroupPage() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[4]")).click();
  }
}
