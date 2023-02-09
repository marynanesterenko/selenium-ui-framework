package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InitialRegistrationPage extends BasePage {

    @FindBy(id = "title")
    WebElement titleDropDown;

    @FindBy(id = "firstName")
    WebElement firstNameInput;

    @FindBy(id = "lastName")
    WebElement lastNameInput;

    @FindBy(xpath = "//input[@value='F']")
    WebElement genderRadioButton;

    @FindBy(id = "dob")
    WebElement dobInput;

    @FindBy(id = "ssn")
    WebElement ssnInput;

    @FindBy(id = "emailAddress")
    WebElement emailAddressInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "confirmPassword")
    WebElement confirmPasswordInput;

    @FindBy(xpath = "//*[text()='Next']")
    WebElement nextButton;

    public void fillOutInitialRegPage(){
        // old-school
        // Select titleOptions = new Select(titleDropDown);
        // titleOptions.selectByVisibleText("Ms.");

        // efficient
        new Select(titleDropDown).selectByValue("Ms.");
        firstNameInput.sendKeys("Jessica");
        lastNameInput.sendKeys("Simpson");
        genderRadioButton.click();
        dobInput.sendKeys("08/08/1995");
        ssnInput.sendKeys("879-58-9623");
        emailAddressInput.sendKeys("test_email@email.com");
        passwordInput.sendKeys("Welcome@!12");
        confirmPasswordInput.sendKeys("Welcome@!12");
    }

    public void clickNext(){
        nextButton.click();
    }
}
