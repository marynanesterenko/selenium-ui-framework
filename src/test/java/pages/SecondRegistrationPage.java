package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondRegistrationPage extends BasePage{
    @FindBy(id = "address")
    WebElement addressInput;

    @FindBy(id = "locality")
    WebElement localityInput;

    @FindBy(id = "region")
    WebElement regionInput;

    @FindBy(id = "postalCode")
    WebElement postalCodeInput;

    @FindBy(id = "country")
    WebElement countryInput;

    @FindBy(id = "homePhone")
    WebElement homePhoneInput;

    @FindBy(id = "mobilePhone")
    WebElement mobilePhoneInput;

    @FindBy(id = "workPhone")
    WebElement workInput;

    @FindBy(id = "agree-terms")
    WebElement termsAndConditionsCheckBox;

    @FindBy(xpath = "//*[text()='Register']")
    WebElement regBtn;

    public void fillOutSecondRegForm(){
        addressInput.sendKeys("123 Main Street");
        localityInput.sendKeys("New York City");
        regionInput.sendKeys("NY");
        postalCodeInput.sendKeys("10025");
        countryInput.sendKeys("USA");
        homePhoneInput.sendKeys("(547) 392-5485");
        mobilePhoneInput.sendKeys("(859) 392-5485");
        workInput.sendKeys("(547) 392-7885");
        termsAndConditionsCheckBox.click();
    }

    public void clickingOnRegBtn(){
        regBtn.click();
    }

}
