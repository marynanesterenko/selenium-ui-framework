package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    @FindBy (xpath = "//*[text()=' Sign Up Here']")
    WebElement signUpLink;

    public void verifySignUpLink(){
        Assert.assertTrue("sign up here link is not visible", signUpLink.isDisplayed());
    }

    public void clickOnSignUpLink(){
        signUpLink.click();
    }
}
