package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    // the reason we create Objects here is because in Java each class can only extend one Class
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.enterValidLoginInfo("valid.username", "valid.password");
    }

    @When("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickSignInBtn();
    }

    @Then("verify user is successfully logged in to the account")
    public void verify_user_is_successfully_logged_in_to_the_account() {
        homePage.verifyPage();
    }


}
