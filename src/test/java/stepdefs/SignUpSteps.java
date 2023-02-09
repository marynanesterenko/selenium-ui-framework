package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InitialRegistrationPage;
import pages.SignUpPage;

public class SignUpSteps {

    SignUpPage signUpPage = new SignUpPage();
    InitialRegistrationPage regPage = new InitialRegistrationPage();

    @Given("the user has access to the Sign Up link")
    public void the_user_has_access_to_the_sign_up_link() {
        signUpPage.verifySignUpLink();
    }

    @Given("the user clicks on the sign up link")
    public void the_user_clicks_on_the_sign_up_link() {
        signUpPage.clickOnSignUpLink();
    }

    @When("the user fills out the initial registration form")
    public void the_user_fills_out_the_initial_registration_form() {
        regPage.fillOutInitialRegPage();
    }

    @When("clicks on the Next button")
    public void clicks_on_the_next_button() {
        regPage.clickNext();
    }

    @When("fills out the following registration form")
    public void fills_out_the_following_registration_form() {
        
    }

    @When("clicks on the Register button")
    public void clicks_on_the_register_button() {
        
    }

    @Then("the user can see the confirmation message")
    public void the_user_can_see_the_confirmation_message() {
        
    }

}
