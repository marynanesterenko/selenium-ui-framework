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
    // BUT if we want to run our test with "safe" data, we can use this method
    public void enterValidLoginInfo(){
        usernameInput.sendKeys("lessi.ww115@gmail.com");
        passwordInput.sendKeys("Wasserhund@1995");
    }

    // this method is more flexible, since we can pass the parameters here
    public void enterValidLoginInfo(String validUsername, String validPassword){
        usernameInput.sendKeys(ConfigReader.getConfigProperty(validUsername));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(validPassword));
    }

    public void enterInvalidLoginInfo(String username, String password){
        usernameInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));
    }

    public void clickSignInBtn(){
        submitBtn.click();
    }

    @FindBy (id = "remember-me")
    WebElement rememberMeBtn;
    public void enableRememberMeBtn(){
        rememberMeBtn.click();
    }
}
