package steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.LogInWithInvalidUserPage;
import pages.PageBase;
import pages.SubscriptionPackagesPage;
import pages.TranslationAndHaveGiftCardPage;
import tests.TestBase;

public class SignInSteps extends TestBase {
        PageBase PageBaseObj ;
        TranslationAndHaveGiftCardPage TranslationAndGiftCardObj ;
        LogInWithInvalidUserPage LoginObj ;

        {}

        @When("^The User click on Translation button$")
        public void theUserClickOnTranslationButton() {
                PageBaseObj = new PageBase(driver);
                TranslationAndGiftCardObj = new TranslationAndHaveGiftCardPage(driver);
                TranslationAndGiftCardObj.ClickOnTranslationButton();
        }
        @And("^The User Click to Sign-in Button$")
        public void theUserClickToSignInButton() {
                LoginObj = new LogInWithInvalidUserPage(driver);
                LoginObj = new LogInWithInvalidUserPage(driver);
                this.LoginObj.SignIn();
        }

        @And("^The User enter Invalid UserName \"([^\"]*)\"$")
        public void theUserEnterInvalidUserName(String InvalidUserName) throws Throwable {

                PageBaseObj = new PageBase(driver);
                LoginObj = new LogInWithInvalidUserPage(driver);
                this.LoginObj.EnterInvalidUser(InvalidUserName);
        }


        @Then("^The User validate that there is error message shall be displayed$")
        public void theUserValidateThatThereIsErrorMessageShallBeDisplayed() {
                Assert.assertTrue(this.LoginObj.ErrorMessage.getText().contains("يرجى التأكد من إدخال عنوان بريد إلكتروني"));
                System.out.println(TranslationAndGiftCardObj.ErrorMessage.getText());
        }

}
