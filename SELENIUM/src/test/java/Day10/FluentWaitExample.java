package Day10;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import util.Base1;

public class FluentWaitExample extends Base1{
  @Test
  public void f()
  {
	  driver.get("http://google.com");
	  
	// Waiting 30 seconds for an element to be present on the page, checking
	// for its presence once every 5 seconds.
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    .withTimeout(30,TimeUnit.SECONDS)
	    .pollingEvery(5, TimeUnit.SECONDS)
	    .ignoring(NoSuchElementException.class)
	    .ignoring(StaleElementReferenceException.class);

	WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
	{
	  public WebElement apply(WebDriver driver)
	  {
		  return driver.findElement(By.id("qq"));
	  }
	});
	foo.sendKeys("abc");
  }
}
