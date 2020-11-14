package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShowCarDetailsPage extends PageBase {

	public ShowCarDetailsPage(WebDriver driver) {
		super(driver);
	}
 
	@FindBy(id="ncadvmakes")
    WebElement CarBrand;
	
	@FindBy(id="ncadvmodels")
	WebElement CarModel;
	
	@FindBy(id="pf")
	WebElement PriceFromtxt;
	
	@FindBy(id="pt")
	WebElement PriceTotxt;
	
	@FindBy(css= "#ncarSearch .orange")
    WebElement SearchBtn;
	
	@FindBy(css = "#cardetails .right")
	public WebElement CarInfo;
	
	public void searchNewCar(String brand, String model, String pricefrom, String priceto  )throws InterruptedException
	{
		
		Select sel=new Select(CarBrand);
        sel.selectByValue(brand);
		//sel.selectByIndex(brand);

        Select sel2 = new Select(CarModel);
        sel2.selectByValue(model);
        
        PriceFromtxt.sendKeys(pricefrom);
        
        PriceTotxt.sendKeys(priceto);
        
        SearchBtn.click();
        
        
	}
	
	
	
	
}
