package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionPackagesPage extends PageBase {

	public SubscriptionPackagesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@class='country-current']")
	public WebElement ClickToSelectCountry;


	@FindBy(xpath = "//*[@id= \"sa\"]")
	public WebElement SelectKSA;


	@FindBy(xpath = "//*[@id= \"kw\"]")
	public WebElement SelectKuwait;

	@FindBy(xpath = "//*[@id= \"bh\"]")
	public WebElement SelectBahrain;


	@FindBy(xpath = "//*[contains(text(),'KSA') and @id= 'country-name']")
	public WebElement KSA_Country;


	@FindBy(xpath = "//*[contains(text(),'Bahrain') and @id= 'country-name']")
	public WebElement Bahrain_Country;


	@FindBy(xpath = "//*[contains(text(),'Kuwait') and @id= 'country-name']")
	public WebElement Kuwait_Country;


	@FindBy(xpath = "//*[contains(text(),'Lite') and @id= 'name-lite']")
	public WebElement LitePackage;


	@FindBy(xpath = "//*[contains(text(),'Classic') and @id= 'name-classic']")
	public WebElement ClassicPackage;


	@FindBy(xpath = "//*[contains(text(),'Premium') and @id= 'name-premium']")
	public WebElement PremiumPackage;



	@FindBy(xpath = "//*[@id=\"currency-lite\"]/b")
	public WebElement LitePrice;


	@FindBy(xpath = "//*[@id=\"currency-classic\"]/b")
	public WebElement ClassicPrice;


	@FindBy(xpath = "//*[@id=\"currency-premium\"]/b")
	public WebElement PremiumPrice;


	@FindBy(xpath = "//*[@id=\"currency-lite\"]/i")
	public WebElement  LitePackageCurrency;


	@FindBy(xpath = "//*[@id=\"currency-classic\"]/i")
	public WebElement  ClassicPackageCurrency;


	@FindBy(xpath = "//*[@id=\"currency-premium\"]/i")
	public WebElement PremiumPackageCurrency;


	// Action class to open the countries options
	public void ClickToSelectCountry() {
		clickButton(ClickToSelectCountry);
	}

	// Action class to SELECT KSA country
	public void Select_KSA() {
		clickButton(SelectKSA);
	}

	// Action class to SELECT Kuwait country
	public void Select_kuwait() {
		clickButton(SelectKuwait);
	}


	// Action class to SELECT Bahrain country
	public void Select_Bahrain() {
		clickButton(SelectBahrain);
	}

}

