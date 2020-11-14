package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CarInstallmentPage;
import pages.HomePage;

public class CarInstallmentTest extends TestBase{
	
	HomePage homeobject;
	CarInstallmentPage installobject;
	
	@Test
	public void usercheckinstallment()
	
	{
		homeobject = new HomePage(driver);
		homeobject.openInstallmentpage();
		installobject = new CarInstallmentPage(driver);
		installobject.installmentCar("10","10","4813");
		String Success = installobject.PersonalInfo.getText();
	    String expectedText = "البيانات الشخصية";
	    Assert.assertEquals(Success,expectedText);
		
		
	}
}
