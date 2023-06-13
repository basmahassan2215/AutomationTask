# AutomationTask 

Describtion :- 
Four scenarios scripted by Java projramming language using Selenium , Mavem , TestNG and BDD cucumber technique 

First scenario :- Validate the Subscription Packages – Type & Price and Currency for Bahrain 
second scenario :- Validate the Subscription Packages – Type & Price and Currency for Kuwait
Third scenario :- Validate the Subscription Packages – Type & Price and Currency for KSA 
Fourth scenario :-   Ender invalid username while the user logging in and expect to get error message with Arabic language
 
 
 How to run ?
 run through cucumber report -- > TestRunner class in runner Folder 
  ![image](https://github.com/basmahassan2215/AutomationTask/assets/37849380/90e50c3c-fb06-4fcc-838f-1be1f549378c) 
  
  How to run the allure report ?
  open  the Terminal then write "allure.bat serve allure-results" 
  However this report will get the results of the tests in TestBase as its dependencies releated to Allure TestNG not Cucumber 
  as i prefere to run the feature files through Cucumber report 
  
  to run allure report for cucumber 
  add there in POM file 
   
  <dependencies>
    <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-cucumber4-jvm</artifactId>
        <version>LATEST_VERSION</version>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.20</version>
            <configuration>
                <argLine>
                    -javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
                    -Dcucumber.options="--plugin io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
                </argLine>
            </configuration>
            <dependencies>
                <dependency>
                    <groupId>org.aspectj</groupId>
                    <artifactId>aspectjweaver</artifactId>
                    <version>${aspectj.version}</version>
                </dependency>
            </dependencies>
        </plugin>
    </plugins>
</build> 
  
 
 
 
 
 
i coverd another scenario but there is an issue while ruuning it , so i will put the code here 

Feature file 

Feature: : Redeeming gift with invalid promo code
Ender invalid promo code and expect to get error message with Arabic language


	Scenario Outline: redeeming gift with invalid promo code

	 Given  The user navigate to STC.tv homepage
 	When    The User click on Translation button
	And     The user Scroll down till finding the HaveGiftButton
	And     The User Click to have gift code
	And     The User enter Invalid code "<promoCode>"
 Then    The User validate that there is error message shall be displayed */

 	Examples:
		| promoCode |
     	|  100      |
    
   
   Page 
   
   
   package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TranslationAndHaveGiftCardPage extends  PageBase{
    public TranslationAndHaveGiftCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "translation-btn")
    public WebElement TranslationButton;

    @FindBy (xpath = "//*[contains(text(),'اضغط هنا')]")
    public WebElement ClickToHaveGiftCard ;

    @FindBy (xpath = "//input[@type=\"text\"]")
    public  WebElement TextInputForPromoCode ;


    @FindBy(xpath = "//button[@type=\"submit\"]")
    public  WebElement RedeemButton ;

    @FindBy (xpath = "//*[@class=\"error-msg\"]")
    public  WebElement ErrorMessage ;


    public  void  ClickOnTranslationButton ()
    {
        clickButton(TranslationButton);
    }

    public void HaveGiftCodeButton ()
    {

        clickButton(ClickToHaveGiftCard);
    }

    public  void  EnterInvalidPromoCode (String PromoCode)
    {
        setTextElementText(TextInputForPromoCode ,PromoCode);
        clickButton(RedeemButton);
    }

}

 

Steps :- 

package steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageBase;
import pages.TranslationAndHaveGiftCardPage;
import tests.TestBase;

public class redeemGiftWithInvalidCodeSteps extends TestBase {



	PageBase PageBaseObj;
	TranslationAndHaveGiftCardPage TranslationAndGiftCardObj ;


	@When("^The User click on Translation button$")
	public void theUserClickOnTranslationButton() {
		TranslationAndGiftCardObj = new TranslationAndHaveGiftCardPage(driver);
		TranslationAndGiftCardObj.ClickOnTranslationButton();
	}


	@Test (enabled = false)
	@And("^The user Scroll down till finding the HaveGiftButton$")
	public void theUserScrollDownTillFindingTheHaveGiftButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
	}

	@Test(enabled = false)
	@And("^The User Click to have gift code$")
	public void theUserClickToHaveGiftCode() {
		TranslationAndGiftCardObj = new TranslationAndHaveGiftCardPage(driver);
		this.TranslationAndGiftCardObj.HaveGiftCodeButton();
	}

	@Test (enabled = false)
	@And("^The User enter Invalid code \"([^\"]*)\"$")
	public void theUserEnterInvalidCode(String PromoCode) {
		PageBaseObj = new PageBase(driver);
		TranslationAndGiftCardObj = new TranslationAndHaveGiftCardPage(driver);
		TranslationAndGiftCardObj.EnterInvalidPromoCode(PromoCode);
	}

	@Test(enabled = false)
	@Then("^The User validate that there is error message shall be displayed$")
	public void theUserValidateThatThereIsErrorMessageShallBeDisplayed() {

		TranslationAndGiftCardObj = new TranslationAndHaveGiftCardPage(driver);
		Assert.assertTrue(TranslationAndGiftCardObj.ErrorMessage.getText().contains("القسيمة أو كود الخصم غير صالح للاستخدام"));
		System.out.println(TranslationAndGiftCardObj.ErrorMessage.getText());
	}

}




