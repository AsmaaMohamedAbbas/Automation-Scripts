package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CarInstallmentPage extends PageBase {

	public CarInstallmentPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="make_inst")
	WebElement CarMake;

	@FindBy(id= "model_inst")
	WebElement CarModel;

	@FindBy(id= "engine_inst")
	WebElement EngineType;

	@FindBy(id="buy")
	WebElement InstallBtn;

	@FindBy(id="wizard-t-0")
	public WebElement PersonalInfo;
	
	public void installmentCar (String CarBrand, String model, String Engine)

	{
		Select options = new Select(CarMake);
		options.selectByValue(CarBrand);

		Select options2 = new Select(CarModel);
		options2.selectByValue(model);

		Select options3 = new Select(EngineType);
		options3.selectByValue(Engine);

		InstallBtn.click();

	}




}
