package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage{
    @FindBy(xpath = "//*[text()='Success']")
    WebElement confMessage;

    public void confirmRegistration() {
        Assert.assertTrue("the confirmation message is NOT visible", confMessage.isDisplayed());
    }
}
