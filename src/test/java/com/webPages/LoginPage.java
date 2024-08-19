package com.webPages;

import com.utilities.SeleniumUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends SeleniumUtility {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#html-body > div.page-wrapper > header > div > header > div >"
            + " div.header-content > div > div > div.col-xl-2.col-lg-6.col-md-6.col-sm-6.col-6.item.item-tool > "
            + "div > div.header-account > div.outside-close.mobile > div")
    private WebElement profileIcon;
    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "pass")
    private WebElement passwordInput;

    @FindBy(id = "accept_gdpr")
    private WebElement agreeLogin;

    @FindBy(id = "send2")
    private WebElement loginButton;

    @FindBy(css = "#login-form > fieldset > div.actions-toolbar > div.secondary > a > span")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//*[@id=\"email-error\"]")
    private WebElement emptyEmailError;

    @FindBy(xpath = "//*[@id=\"pass-error\"]")
    private WebElement emptyPassError;

    @FindBy(id = "login[accept_gdpr]-error")
    private WebElement emptyAgreeLoginError;

    // Getters for locators
    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getAgreeLogin() {
        return agreeLogin;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;
    }

    public WebElement getEmptyEmailError() {
        return emptyEmailError;
    }

    public WebElement getEmptyPassError() {
        return emptyPassError;
    }

    public WebElement getEmptyAgreeLoginError() {
        return emptyAgreeLoginError;
    }

    // Methods to interact with the page using SeleniumUtility methods
    public void enterEmail(String email) {
        typeInput(emailInput, email);
    }

    public void enterPassword(String password) {
        typeInput(passwordInput, password);
    }

    public void clickAgreeLogin() {
        clickOnElement(agreeLogin);
    }

    public void clickLoginButton() {
        waitForElementToBeClickable(loginButton);
        clickOnElement(loginButton);
    }

    public void clickForgotPasswordLink() {
        clickOnElement(forgotPasswordLink);
    }

    public boolean isEmptyEmailErrorVisible() {
        return isElementExist(emptyEmailError);
    }

    public boolean isEmptyPassErrorVisible() {
        return isElementExist(emptyPassError);
    }

    public boolean isEmptyAgreeLoginErrorVisible() {
        return isElementExist(emptyAgreeLoginError);
    }

    public String getEmptyEmailErrorMessage() {
        return getRequiredAttributeValue(emptyEmailError, "textContent");
    }

    public String getEmptyPassErrorMessage() {
        return getRequiredAttributeValue(emptyPassError, "textContent");
    }

    public String getEmptyAgreeLoginErrorMessage() {
        return getRequiredAttributeValue(emptyAgreeLoginError, "textContent");
    }

    // Login with all fields
    public void loginUser(String email, String password) {
        clickOnElement(profileIcon);
        typeInput(emailInput, email);
        typeInput(passwordInput, password);
        clickAgreeLogin();
        clickLoginButton();
    }

    // Login with empty email
    public void loginUserWithEmptyEmail(String password) {
        typeInput(passwordInput, password);
        clickAgreeLogin();
        clickLoginButton();
    }

    // Login with empty password
    public void loginUserWithEmptyPassword(String email) {
        typeInput(emailInput, email);
        clickAgreeLogin();
        clickLoginButton();
    }

    // Login with empty email and password
    public void loginUserWithEmptyEmailAndPassword() {

        clickAgreeLogin();
        clickLoginButton();
    }
}