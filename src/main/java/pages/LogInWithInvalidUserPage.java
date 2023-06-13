package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInWithInvalidUserPage  extends PageBase{

    public LogInWithInvalidUserPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (xpath = "//*[@id=\"signin\"] ")
    public WebElement SignIn ;

    @FindBy (xpath = "//input[@type=\"text\"]")
    public WebElement UserNameInput ;

    @FindBy (xpath = "//button[@type=\"submit\"]")
    public WebElement SignInButton ;


    @FindBy (xpath = "//span[@class=\"error-msg\"]")
    public WebElement ErrorMessage ;

    // Action class to click on Signin button
    public  void  SignIn () {
    clickButton(SignIn);
}


 // Action class to sign in with invalid username
  public  void  EnterInvalidUser ( String InvalidUser)
  {
    setTextElementText(UserNameInput ,InvalidUser);
    clickButton(SignInButton);
  }

}
