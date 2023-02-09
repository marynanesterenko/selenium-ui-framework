package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConfirmationPage;
import pages.InitialRegistrationPage;
import pages.SecondRegistrationPage;
import pages.SignUpPage;

public class SignUpSteps {

    SignUpPage signUpPage = new SignUpPage();
    InitialRegistrationPage regPage = new InitialRegistrationPage();
    SecondRegistrationPage secondRegPage = new SecondRegistrationPage();
    ConfirmationPage confPage = new ConfirmationPage();

    @Given("the user has access to the Sign Up link")
    public void the_user_has_access_to_the_sign_up_link() throws InterruptedException{
        signUpPage.verifySignUpLink();
        Thread.sleep(3000);
    }

    @Given("the user clicks on the sign up link")
    public void the_user_clicks_on_the_sign_up_link() throws InterruptedException{
        signUpPage.clickOnSignUpLink();
        Thread.sleep(3000);
    }

    @When("the user fills out the initial registration form")
    public void the_user_fills_out_the_initial_registration_form() throws InterruptedException{
        regPage.fillOutInitialRegPage();
        Thread.sleep(3000);
    }

    @When("clicks on the Next button")
    public void clicks_on_the_next_button() throws InterruptedException{
        regPage.clickNext();
        Thread.sleep(3000);
    }

    @When("fills out the second registration form and enables the Terms and Conditions checkbox")
    public void fills_out_the_second_registration_form_and_enables_the_Terms_and_Conditions_checkbox() throws InterruptedException{
        secondRegPage.fillOutSecondRegForm();
        Thread.sleep(3000);
    }

    @When("clicks on the Register button")
    public void clicks_on_the_register_button() throws InterruptedException{
        secondRegPage.clickingOnRegBtn();
        Thread.sleep(3000);
    }

    @Then("the user can see the confirmation message")
    public void the_user_can_see_the_confirmation_message() throws InterruptedException{
        confPage.confirmRegistration();
        Thread.sleep(3000);
    }

}
