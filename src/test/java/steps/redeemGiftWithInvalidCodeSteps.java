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
