package Day10;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import util.Base1;
import util.BrowserSetup;

public class FirstScript extends Base1
{
  @Test
  public void TitleTest() throws IOException 
  {	  
	  ExtentHtmlReporter htmlReport=new ExtentHtmlReporter("Google.html");
	  htmlReport.setAppendExisting(true);
	  
	  ExtentReports ex=new ExtentReports(); 
	  ex.attachReporter(htmlReport);
	  
	  ExtentTest test=ex.createTest("TitleTest");
	  test.info("Opeing URL");
	  driver.get("http://google.com");
	  test.info("Checking Title");
	  Assert.assertEquals(driver.getTitle(),"Google");
	  BrowserSetup.getScreenShot("title");
	  test.pass("Title Test Pass");
	  test.addScreenCaptureFromPath("D:\\javaworkspace\\SELENIUM\\titleFri_Mar_15_15_17_47_IST_2019.png");
	  ex.flush();
  }
}
