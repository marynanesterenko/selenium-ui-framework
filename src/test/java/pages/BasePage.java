package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverUtilities;

public class BasePage {
    WebDriver driver = DriverUtilities.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}
