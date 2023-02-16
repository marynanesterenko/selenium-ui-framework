package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//li[@class='active']")
    WebElement welcomeMessage;

    public void verifyPage(){
        Assert.assertTrue("welcome message is not visible, could be on the wrong page", welcomeMessage.isDisplayed());
    }

    public void navigateBackToLogin(){
        driver.navigate().back();
    }

}
