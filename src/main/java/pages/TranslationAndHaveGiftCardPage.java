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

    public void ToHaveGiftCode ()
    {
         clickButton(ClickToHaveGiftCard);
    }

    public  void  EnterInvalidPromoCode (String PromoCode)
    {
        setTextElementText(TextInputForPromoCode ,PromoCode);
        clickButton(RedeemButton);
    }




}
