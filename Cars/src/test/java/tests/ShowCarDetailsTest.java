package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchForNewCar;
import pages.ShowCarDetailsPage;

public class ShowCarDetailsTest extends TestBase {

	HomePage homeobject;
	SearchForNewCar  searchobject;
	ShowCarDetailsPage Cardetailsobj;
	
	@Test
	public void userCheckCarDetails()
	{
		homeobject = new HomePage(driver);
		homeobject.openNewCarsLink();
		searchobject = new SearchForNewCar(driver);
		
		Cardetailsobj = new ShowCarDetailsPage(driver);
		
		
		try {
			searchobject.searchNewCar("10", "10", "300000", "339900");
			homeobject.openCarDetails();
			 String Success = Cardetailsobj.CarInfo.getText();
			  String expectedText = "بيانات السيارة";
			   Assert.assertEquals(Success,expectedText);
		
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
}
