package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(id = "username")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy (id = "submit")
    WebElement submitBtn;

    public void enterValidLoginInfo(){
        usernameInput.sendKeys("lessi.ww115@gmail.com");
        passwordInput.sendKeys("Wasserhund@1995");

    }

    public void clickSignInBtn(){
        submitBtn.click();
    }
}
