package com.webPages;

import com.utilities.SeleniumUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage extends SeleniumUtility {
    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "lastname")
    private WebElement lastNameInput;

    @FindBy(id = "email_address")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "password-confirmation")
    private WebElement confirmPasswordInput;

    @FindBy(id = "accept_gdpr")
    private WebElement clickOnAgree;

    @FindBy(css = "button.action.submit.primary")
    private WebElement submitButton;

    @FindBy(css = ".message-success")
    private WebElement successMessage;

    @FindBy(css = "#firstname-error")
    private WebElement firstNameError;

    @FindBy(css = "#lastname-error")
    private WebElement lastNameError;

    @FindBy(css = "#email_address-error")
    private WebElement emailError;

    @FindBy(id = "password-error")
    private WebElement passwordError;

    @FindBy(id = "password-confirmation-error")
    private WebElement confirmPassError;

    @FindBy(id = "accept_gdpr-error")
    private WebElement agreeToContinueError;

    @FindBy(css = "#html-body > div.page-wrapper > header > div > header > div > div.header-content > div > div > div.col-xl-2.col-lg-6.col-md-6.col-sm-6.col-6.item.item-tool > div > div.header-account > div.outside-close.mobile > div")
    private WebElement profileIcon;

    @FindBy(css = "#login-form > div > div:nth-child(5) > div > a")
    private WebElement createAccountButton;

    @FindBy(css = "#maincontent > div.page.messages > div:nth-child(2) > div > div > div")
    private WebElement emailAlreadyRegisteredError;

    // Error message getters
    public String getFirstNameErrorMessage() {
        return firstNameError.getText();
    }

    public String getLastNameErrorMessage() {
        return lastNameError.getText();
    }

    public String getEmailErrorMessage() {
        return emailError.getText();
    }

    public String getPasswordErrorMessage() {
        return passwordError.getText();
    }

    public String getConfirmPasswordErrorMessage() {
        return confirmPassError.getText();
    }

    public String getAgreeToContinueErrorMessage() {
        return agreeToContinueError.getText();
    }

    public WebElement getEmailAlreadyRegisteredError() {
        return emailAlreadyRegisteredError;
    }

    public String getEmailAlreadyRegisteredErrorMessage() {
        return emailAlreadyRegisteredError.getText();
    }

    // Methods to register user with different scenarios
    public void registerUser(String firstName, String lastName, String email, String password, String confirmPassword) {

    }

    public void registerUserWithEmptyFirstName(String lastName, String email, String password, String confirmPassword) {
        typeInput(firstNameInput, "");
        typeInput(lastNameInput, lastName);
        typeInput(emailInput, email);
        typeInput(passwordInput, password);
        typeInput(confirmPasswordInput, confirmPassword);
        clickOnElement(clickOnAgree);
        submitForm();
    }

    public void registerUserWithEmptyLastName(String firstName, String email, String password, String confirmPassword) {
        typeInput(firstNameInput, firstName);
        typeInput(lastNameInput, "");
        typeInput(emailInput, email);
        typeInput(passwordInput, password);
        typeInput(confirmPasswordInput, confirmPassword);
        clickOnElement(clickOnAgree);
        submitForm();
    }

    public void registerUserWithEmptyEmail(String firstName, String lastName, String password, String confirmPassword) {
        typeInput(firstNameInput, firstName);
        typeInput(lastNameInput, lastName);
        typeInput(emailInput, "");
        typeInput(passwordInput, password);
        typeInput(confirmPasswordInput, confirmPassword);
        clickOnElement(clickOnAgree);
        submitForm();
    }

    public void registerUserWithEmptyPassword(String firstName, String lastName, String email, String confirmPassword) {
        typeInput(firstNameInput, firstName);
        typeInput(lastNameInput, lastName);
        typeInput(emailInput, email);
        typeInput(passwordInput, "");
        typeInput(confirmPasswordInput, confirmPassword);
        clickOnElement(clickOnAgree);
        submitForm();
    }

    public void registerUserWithPasswordMismatch(String firstName, String lastName, String email, String password,
                                                 String confirmPassword) {
        typeInput(firstNameInput, firstName);
        typeInput(lastNameInput, lastName);
        typeInput(emailInput, email);
        typeInput(passwordInput, password);
        typeInput(confirmPasswordInput, confirmPassword);
        clickOnElement(clickOnAgree);
        submitForm();
    }

    public void submitForm() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
    }

    // Error visibility methods
    public boolean isFirstNameErrorVisible() {
        return isElementExist(firstNameError);
    }

    public boolean isLastNameErrorVisible() {
        return isElementExist(lastNameError);
    }

    public boolean isEmailErrorVisible() {
        return isElementExist(emailError);
    }

    public boolean isPasswordErrorVisible() {
        return isElementExist(passwordError);
    }

    public boolean isConfirmPasswordErrorVisible() {
        return isElementExist(confirmPassError);
    }

    public boolean isAgreeToContinueErrorVisible() {
        return isElementExist(agreeToContinueError);
    }

    public boolean isEmailAlreadyRegisteredErrorVisible() {
        return isElementExist(emailAlreadyRegisteredError);
    }

    public void enterRegistrationDetails(String john, String doe, String mail, String s, String s1) {
    }
}
