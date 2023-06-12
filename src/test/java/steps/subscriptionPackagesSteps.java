package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.PageBase;
import pages.SubscriptionPackagesPage;
import tests.TestBase;



public class subscriptionPackagesSteps extends TestBase {


    PageBase PageBaseObj ;
    SubscriptionPackagesPage SubscriptionPackagePageObj ;
    @Given("^The user navigate to STC\\.tv homepage$")
    public void theUserNavigateToSTCTvHomepage() {

        PageBaseObj = new PageBase(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("stc"));

    }

    @When("^The user select the KSA country$")
    public void theUserSelectTheKSACountry() {
        PageBaseObj = new PageBase(driver);
        SubscriptionPackagePageObj = new SubscriptionPackagesPage(driver);
        SubscriptionPackagePageObj.ClickToSelectCountry();
        SubscriptionPackagePageObj.Select_KSA();
        Assert.assertTrue(SubscriptionPackagePageObj.KSA_Country.getText().contains("KSA"));
    }

    @Then("^The user can validate the Subscription Packages – Type & Price and Currency for the KSA country$")
    public void theUserCanValidateTheSubscriptionPackagesTypePriceAndCurrencyForTheSelectedCountry(){
    SubscriptionPackagePageObj = new SubscriptionPackagesPage(driver);
    PageBaseObj = new PageBase(driver);
    Assert.assertTrue(SubscriptionPackagePageObj.LitePackage.getText().contains("LITE"));
    Assert.assertEquals(SubscriptionPackagePageObj.LitePrice.getText(), "15");
    Assert.assertTrue(SubscriptionPackagePageObj.LitePackageCurrency.getText().contains("SAR"));
    System.out.println("In KSA, there is Lite Package with price  "  +  SubscriptionPackagePageObj.LitePrice.getText()  +
            "  with currency  "  +  SubscriptionPackagePageObj.LitePackageCurrency.getText());

   Assert.assertTrue(SubscriptionPackagePageObj.ClassicPackage.getText().contains("CLASSIC"));
   Assert.assertEquals(SubscriptionPackagePageObj.ClassicPrice.getText(),"25");
   Assert.assertTrue(SubscriptionPackagePageObj.ClassicPackageCurrency.getText().contains("SAR"));
   System.out.println("In KSA, there is Classic Package with price  "  +  SubscriptionPackagePageObj.ClassicPrice.getText() +
           "  with currency  "  +  SubscriptionPackagePageObj.ClassicPackageCurrency.getText());

   Assert.assertTrue(SubscriptionPackagePageObj.PremiumPackage.getText().contains("PREMIUM"));
   Assert.assertEquals(SubscriptionPackagePageObj.PremiumPrice.getText(),"60");
   Assert.assertTrue(SubscriptionPackagePageObj.PremiumPackageCurrency.getText().contains("SAR"));
        System.out.println("In KSA, there is Premium Package with price   "  +  SubscriptionPackagePageObj.PremiumPrice.getText() +
                "  with currency  "  +  SubscriptionPackagePageObj.PremiumPackageCurrency.getText());

    }

    @When("^The user select Bahrain country$")
    public void theUserSelectBahrainCountry() {

        PageBaseObj = new PageBase(driver);
        SubscriptionPackagePageObj = new SubscriptionPackagesPage(driver);
        SubscriptionPackagePageObj.ClickToSelectCountry();
        SubscriptionPackagePageObj.Select_Bahrain();
        Assert.assertTrue(SubscriptionPackagePageObj.Bahrain_Country.getText().contains("Bahrain"));
    }

    @Then("^The user can validate the Subscription Packages – Type & Price and Currency for the Bahrain country$")
    public void theUserCanValidateTheSubscriptionPackagesTypePriceAndCurrencyForTheBahrainCountry() {
        SubscriptionPackagePageObj = new SubscriptionPackagesPage(driver);
        PageBaseObj = new PageBase(driver);
        Assert.assertTrue(SubscriptionPackagePageObj.LitePackage.getText().contains("LITE"));
        Assert.assertEquals(SubscriptionPackagePageObj.LitePrice.getText(), "2");
        Assert.assertTrue(SubscriptionPackagePageObj.LitePackageCurrency.getText().contains("BHD"));
        System.out.println("In Bahrain, there is Lite Package with price  "  +  SubscriptionPackagePageObj.LitePrice.getText()  +
                "  with currency  "  +  SubscriptionPackagePageObj.LitePackageCurrency.getText());

        Assert.assertTrue(SubscriptionPackagePageObj.ClassicPackage.getText().contains("CLASSIC"));
        Assert.assertEquals(SubscriptionPackagePageObj.ClassicPrice.getText(),"3");
        Assert.assertTrue(SubscriptionPackagePageObj.ClassicPackageCurrency.getText().contains("BHD"));
        System.out.println("In Bahrain, there is Classic Package with price  "  +  SubscriptionPackagePageObj.ClassicPrice.getText() +
                "  with currency  "  +  SubscriptionPackagePageObj.ClassicPackageCurrency.getText());

        Assert.assertTrue(SubscriptionPackagePageObj.PremiumPackage.getText().contains("PREMIUM"));
        Assert.assertEquals(SubscriptionPackagePageObj.PremiumPrice.getText(),"6");
        Assert.assertTrue(SubscriptionPackagePageObj.PremiumPackageCurrency.getText().contains("BHD"));
        System.out.println("In Bahrain, there is Premium Package with price   "  +  SubscriptionPackagePageObj.PremiumPrice.getText() +
                "  with currency  "  +  SubscriptionPackagePageObj.PremiumPackageCurrency.getText());

    }


    @When("^The user select Kuwait country$")
    public void theUserSelectKuwaitCountry() {

        PageBaseObj = new PageBase(driver);
        SubscriptionPackagePageObj = new SubscriptionPackagesPage(driver);
        SubscriptionPackagePageObj.ClickToSelectCountry();
        SubscriptionPackagePageObj.Select_kuwait();
        Assert.assertTrue(SubscriptionPackagePageObj.Kuwait_Country.getText().contains("Kuwait"));

    }

    @Then("^The user can validate the Subscription Packages – Type & Price and Currency for The Kuwait country$")
    public void theUserCanValidateTheSubscriptionPackagesTypePriceAndCurrencyForTheKuwaitCountry() {

        PageBaseObj = new PageBase(driver);
        Assert.assertTrue(SubscriptionPackagePageObj.LitePackage.getText().contains("LITE"));
        Assert.assertEquals(SubscriptionPackagePageObj.LitePrice.getText(), "1.2");
        Assert.assertTrue(SubscriptionPackagePageObj.LitePackageCurrency.getText().contains("KWD"));
        System.out.println("In Kuwait, there is Lite Package with price  "  +  SubscriptionPackagePageObj.LitePrice.getText()  +
                "  with currency  "  +  SubscriptionPackagePageObj.LitePackageCurrency.getText());

        Assert.assertTrue(SubscriptionPackagePageObj.ClassicPackage.getText().contains("CLASSIC"));
        Assert.assertEquals(SubscriptionPackagePageObj.ClassicPrice.getText(),"2.5");
        Assert.assertTrue(SubscriptionPackagePageObj.ClassicPackageCurrency.getText().contains("KWD"));
        System.out.println("In Kuwait, there is Classic Package with price  "  +  SubscriptionPackagePageObj.ClassicPrice.getText() +
                "  with currency  "  +  SubscriptionPackagePageObj.ClassicPackageCurrency.getText());

        Assert.assertTrue(SubscriptionPackagePageObj.PremiumPackage.getText().contains("PREMIUM"));
        Assert.assertEquals(SubscriptionPackagePageObj.PremiumPrice.getText(),"4.8");
        Assert.assertTrue(SubscriptionPackagePageObj.PremiumPackageCurrency.getText().contains("KWD"));
        System.out.println("In kuwait, there is Premium Package with price   "  +  SubscriptionPackagePageObj.PremiumPrice.getText() +
                "  with currency  "  +  SubscriptionPackagePageObj.PremiumPackageCurrency.getText());
    }
}

