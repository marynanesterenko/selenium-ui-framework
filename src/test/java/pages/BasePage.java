package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverUtilities;

public class BasePage {
    WebDriver driver = DriverUtilities.getDriver();

    // this is a Class which makes the POM easier and more proficient to implement
    // it will essentially dynamically initialize the WebElements on the page
    // this keyword initializes elements in a current active class

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}
