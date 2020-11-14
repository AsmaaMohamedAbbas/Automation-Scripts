package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchForNewCar;

public class SearchForNewCarTest extends TestBase {

	
	HomePage homeobject;
	SearchForNewCar  searchobject;
	
	@Test
	public void UserSearchForNewCar() throws InterruptedException
	{
		homeobject = new HomePage(driver);
		homeobject.openNewCarsLink();
		searchobject = new SearchForNewCar(driver);
		searchobject.searchNewCar("10", "10", "300000", "339900");
	    String Success = searchobject.result.getText();
	    String expectedText = "هذه الأسعار الرسمية لدى الوكيل وقابلة للتغيير";
	    Assert.assertEquals(Success,expectedText);
	}
	
}
