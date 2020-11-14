package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "btnnewsearch")
	WebElement NewCarsLink ;
	
	@FindBy(linkText = "1.6 A/T H/L New Shape Sedan")
	WebElement CarDetails;
	
	@FindBy(linkText= "تقسيط")
	WebElement InstallmentLink;
	
	public void openNewCarsLink()
	{
		NewCarsLink.click();
		
		
	}
	
	public void openCarDetails()
	{
		CarDetails.click();
	}
	
	public void openInstallmentpage()
	{
		InstallmentLink.click();
	}
}
