package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.junit.IJUnitTestRunner;

import helper.Helper;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	public void startDriver()
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 driver.navigate().to("https://www.contactcars.com/");

 

	}


	@AfterSuite
	public void stopDriver()
	{
		driver.quit();
	}

	@AfterMethod
	public void screenShotOnFailure(ITestResult result)
	{
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed");
			System.out.println("Taking ScreenShot....");
			Helper.captureScreenshot(driver, result.getName());
			
		}
		
	}
}
