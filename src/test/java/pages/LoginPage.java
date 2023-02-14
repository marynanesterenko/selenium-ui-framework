package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class LoginPage extends BasePage{


    @FindBy(id = "username")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy (id = "submit")
    WebElement submitBtn;

    // in this method we are hardcoding, we don't really need this method
    // BUT
    public void enterValidLoginInfo(){
        usernameInput.sendKeys("lessi.ww115@gmail.com");
        passwordInput.sendKeys("Wasserhund@1995");
    }

    // this method is more flexible, since we can pass the parameters here
    public void enterValidLoginInfo(String username, String password){
        usernameInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));
    }

    public void clickSignInBtn(){
        submitBtn.click();
    }
}
