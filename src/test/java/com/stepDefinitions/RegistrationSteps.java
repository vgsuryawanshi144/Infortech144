package com.stepDefinitions;

import com.utilities.SeleniumUtility;
import com.webPages.RegistrationPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegistrationSteps extends SeleniumUtility {
    WebDriver driver;
    RegistrationPage registrationPage;

    @Given("the user is on the registration page")
    public void the_user_is_on_the_registration_page() {
        driver = setUp("chrome", "https://3a5ff726f3.nxcli.io/customer/account/create/");
        registrationPage = new RegistrationPage(driver);
    }

    @When("the user registers with valid details")
    public void the_user_registers_with_valid_details() {
        registrationPage.registerUser("John", "Doe", "john@gmail.com", "John@1234", "John@1234");
    }

    @Then("the registration should be successful")
    public void the_registration_should_be_successful() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Register";
        Assert.assertEquals(actualTitle, expectedTitle);
        cleanUp();
    }

    @When("the user registers without a first name")
    public void the_user_registers_without_a_first_name() {
        registrationPage.registerUserWithEmptyFirstName("Doe", "john@gmail.com", "John@1234", "John@1234");
    }

    @Then("an error message for the first name should be displayed")
    public void an_error_message_for_the_first_name_should_be_displayed() {
        Assert.assertTrue(registrationPage.isFirstNameErrorVisible());
        Assert.assertEquals(registrationPage.getFirstNameErrorMessage(), "This is a required field.");
        cleanUp();
    }

    @When("the user registers without a last name")
    public void the_user_registers_without_a_last_name() {
        registrationPage.registerUserWithEmptyLastName("John", "john@gmail.com", "John@1234", "John@1234");
    }

    @Then("an error message for the last name should be displayed")
    public void an_error_message_for_the_last_name_should_be_displayed() {
        Assert.assertTrue(registrationPage.isLastNameErrorVisible());
        Assert.assertEquals(registrationPage.getLastNameErrorMessage(), "This is a required field.");
        cleanUp();
    }

    @When("the user registers without an email")
    public void the_user_registers_without_an_email() {
        registrationPage.registerUserWithEmptyEmail("John", "Doe", "John@1234", "John@1234");
    }

    @Then("an error message for the email should be displayed")
    public void an_error_message_for_the_email_should_be_displayed() {
        Assert.assertTrue(registrationPage.isEmailErrorVisible());
        Assert.assertEquals(registrationPage.getEmailErrorMessage(), "This is a required field.");
        cleanUp();
    }

    @When("the user registers without a password")
    public void the_user_registers_without_a_password() {
        registrationPage.registerUserWithEmptyPassword("John", "Doe", "john@gmail.com", "John@1234");
    }

    @Then("an error message for the password should be displayed")
    public void an_error_message_for_the_password_should_be_displayed() {
        Assert.assertTrue(registrationPage.isPasswordErrorVisible());
        Assert.assertEquals(registrationPage.getPasswordErrorMessage(), "This is a required field.");
        cleanUp();
    }

    @When("the user registers with mismatched passwords")
    public void the_user_registers_with_mismatched_passwords() {
        registrationPage.registerUserWithPasswordMismatch("John", "Doe", "john@gmail.com", "John@1234", "John@4321");
    }

    @Then("an error message for password mismatch should be displayed")
    public void an_error_message_for_password_mismatch_should_be_displayed() {
        Assert.assertTrue(registrationPage.isConfirmPasswordErrorVisible());
        Assert.assertEquals(registrationPage.getConfirmPasswordErrorMessage(), "Please enter the same value again.");
        cleanUp();
    }

    @When("the user registers with an already registered email")
    public void the_user_registers_with_an_already_registered_email() {
        registrationPage.registerUser("Jane", "Doe", "alreadyregistered@gmail.com", "Jane@1234", "Jane@1234");
        registrationPage.submitForm();
    }

    @Then("an error message for already registered email should be displayed")
    public void an_error_message_for_already_registered_email_should_be_displayed() {
        Assert.assertTrue(registrationPage.isEmailAlreadyRegisteredErrorVisible());
        String expectedErrorMessage = "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";
        String actualErrorMessage = registrationPage.getEmailAlreadyRegisteredErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        cleanUp();
    }
}

