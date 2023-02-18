package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.NewSavingsAccountPage;

public class NewSavingsAccountSteps {

    LoginPage loginPage = new LoginPage();
    NewSavingsAccountPage newSavAccPage = new NewSavingsAccountPage();

    @Given("a user navigates to a digital bank")
    public void a_user_navigates_to_a_digital_bank() {
        
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        
    }

    @Then("verify user is on the home page")
    public void verify_user_is_on_the_home_page() {
        newSavAccPage.verifyWelcomePage();
    }

    @Given("user clicks on Savings dropdown menu")
    public void user_clicks_on_savings_dropdown_menu() {
        newSavAccPage.clickSavingsQuickLink();
    }

    @Given("user selects New Saving menu item")
    public void user_selects_new_saving_menu_item() {
        newSavAccPage.selectNewSavingsMenuItem();
    }

    @Then("user is transferred to Create Savings Page")
    public void user_is_transferred_to_create_savings_page() {
         newSavAccPage.verifyCreateSavingsPage();
    }

    @When("user selects Savings Account Type")
    public void user_selects_savings_account_type(String string) {
        newSavAccPage.selectAccountType(string);
    }

    @When("user selects {string}")
    public void user_selects(String string) {

    }

    @When("user selects Account Ownership")
    public void user_selects_account_ownership(String string) {
        newSavAccPage.selectAccountOwnershipType(string);
    }

    @When("enters their {string} on the Account Name input field")
    public void enters_their_on_the_account_name_input_field(String string) {
        newSavAccPage.enterAccountName(string);
    }

    @When("user enters {string}> in the Initial Deposit field")
    public void user_enters_in_the_initial_deposit_field(String string) {
        
    }

    @When("user clicks on Submit button")
    public void user_clicks_on_submit_button() {
        newSavAccPage.clickSubmitBtn();
    }

    @Then("verify user is transferred to View Savings Account Page")
    public void verify_user_is_transferred_to_view_savings_account_page() {
        
    }

    @Then("verify new savings account was created")
    public void verify_new_savings_account_was_created() {
        newSavAccPage.verifyCreateSavingsPage();
    }
}
