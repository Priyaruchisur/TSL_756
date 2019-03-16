package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base1 {
public WebDriver driver;
  @BeforeTest
  public void beforeTest() {

  driver = BrowserSetup.browserStart("chrome");
  }

  @AfterTest
  public void afterTest() {
		driver.quit();
  }

}
