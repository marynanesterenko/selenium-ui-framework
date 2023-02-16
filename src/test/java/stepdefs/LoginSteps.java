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

    @Given("user enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String validUsername, String validPassword) {
        loginPage.enterValidLoginInfo(validUsername, validPassword);
    }

    @When("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickSignInBtn();
    }

    @Then("verify user is successfully logged in to the account")
    public void verify_user_is_successfully_logged_in_to_the_account() {
        homePage.verifyPage();
    }

    @Given("user enters invalid {string} and {string}")
    public void user_enters_invalid_username_and_password(String username, String password) {
        loginPage.enterInvalidLoginInfo(username, password);
    }

    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is_displayed(String username, String password) {

    }

    @When("user enables remember me checkbox")
    public void user_enables_remember_me_checkbox() {
        loginPage.enableRememberMeBtn();
    }

    @When("user clicks Sign In button and navigates back to the Login Page")
    public void clicks_sign_in_button_and_navigates_back_to_the_login_page() {
        loginPage.clickSignInBtn();
        homePage.navigateBackToLogin();
    }

}
