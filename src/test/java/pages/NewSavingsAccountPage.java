package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewSavingsAccountPage extends BasePage{

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy (xpath = "//li[text()= \"Welcome\"]")
    WebElement welcomeLabel;

    @FindBy (xpath = "//a[@id = 'savings-menu']")
    WebElement savingsDropDown;

    @FindBy(xpath = "//a[@id = 'new-savings-menu-item']")
    WebElement newSavingsMenuItem;

    @FindBy (xpath = "//h1[text()= \"Create Savings\"]")
    WebElement savingsAccountLabel;

    @FindBy(xpath = "//strong[text()=\"Select Savings Account Type\"]")
    WebElement accountTypeLabel;

    @FindBy (xpath = "//input[@id= \"Savings\"]")
    WebElement savingsRadioBtn;

    @FindBy (xpath = "//input[@id= \"Money Market\"]")
    WebElement moneyMarketRadioBtn;

    @FindBy (xpath = "//strong[text()='Select Account Ownership']")
    WebElement accountOwnershipLabel;

    @FindBy (xpath = "//input[@id='Individual']")
    WebElement individualRadioButton;

    @FindBy (xpath = "//input[@id='Joint']")
    WebElement jointRadioButton;

    @FindBy (xpath = "//strong[text()='Account Name']")
    WebElement verifyAccountNameLabel;
    @FindBy (xpath = "//input[@id='name']")
    WebElement accountName;

    @FindBy (xpath = "//strong[text()='Initial Deposit']")
    WebElement verifyInitialDeposit;
    @FindBy (xpath = "//input[@id='openingBalance']")
    WebElement initialDeposit;

    @FindBy (xpath="//button[@id='newSavingsSubmit']")
    WebElement submitButton;

    @FindBy (xpath = "//h1[@id='page-title']")
    WebElement

    @FindBy (xpath="//span[@id='new-account-msg']")
    WebElement confirmationMessage;

    public void verifyWelcomePage (){
        Assert.assertTrue("welcome message is not present", welcomeLabel.isDisplayed());
    }

    public void clickSavingsQuickLink (){
        wait.until(ExpectedConditions.visibilityOf(savingsDropDown));
        savingsDropDown.click();
    }

    public void selectNewSavingsMenuItem (){
        wait.until(ExpectedConditions.visibilityOf(newSavingsMenuItem));
        newSavingsMenuItem.click();
    }

    public void verifyCreateSavingsPage(){
        Assert.assertTrue("the user is not on the Create Savings Page", savingsAccountLabel.isDisplayed());
    }

    public void selectAccountType(String type){
        Assert.assertTrue("user cannot see Account Type Label", accountTypeLabel.isDisplayed());
        if (type.equalsIgnoreCase("Savings")){
            savingsRadioBtn.click();
        } else if (type.equalsIgnoreCase("Money Market")){
            moneyMarketRadioBtn.click();
        }
    }

    public void selectAccountOwnershipType(String ownershipType){
        Assert.assertTrue("user cannot see the Account Ownerdhip Type label", accountOwnershipLabel.isDisplayed());
        if (ownershipType.equalsIgnoreCase("Individual")){
            individualRadioButton.click();
        } else if (ownershipType.equalsIgnoreCase("Joint")){
            jointRadioButton.click();
        }
    }

    public void enterAccountName(String string){
        Assert.assertTrue("user cannot see the Account Name label", verifyAccountNameLabel.isDisplayed());
        accountName.sendKeys(string);
    }

    public void enterDeposit (String string){
        Assert.assertTrue("user cannot see the Initial Deposit label", verifyInitialDeposit.isDisplayed());
        initialDeposit.sendKeys(string);
    }

    public void clickSubmitBtn (){
        submitButton.click();
    }

    public void verifyUserIsOnViewSavingsPage (){

    }

    public void confirmSuccessfulAccountCreation(){
        Assert.assertTrue("the confirmation message did not appear", confirmationMessage.isDisplayed());
    }
}
