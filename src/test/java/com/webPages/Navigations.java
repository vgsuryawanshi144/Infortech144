package com.webPages;

import com.utilities.SeleniumUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigations extends SeleniumUtility {
    WebDriver driver;

    public Navigations(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators for navigation bar elements
    @FindBy(css = "#store\\.menu > div > ul > li.level0.category-item.level-top.dropdown.home > a")
    private WebElement homeLink;

    @FindBy(css = "#store\\.menu > div > ul > li.level0.category-item.level-top.cat.nav-1.hasChild.parent > a")
    private WebElement productLink;

    @FindBy(css = "#store\\.menu > div > ul > li.level0.category-item.level-top.ext.first.dropdown > a")
    private WebElement servicesLink;

    @FindBy(css = "#store\\.menu > div > ul > li:nth-child(4) > a")
    private WebElement whatsNewLink;

    @FindBy(css = "#store\\.menu > div > ul > li.level0.category-item.level-top.ext.last.dropdown > a")
    private WebElement contactUsLink;

    @FindBy(css = "div > div > div.col-xl-2.col-lg-6.col-md-6.col-sm-6.col-6.item.item-tool > div > div.header-account")
    private WebElement profile;

    @FindBy(css = "#login-form > div > div:nth-child(5) > div > a")
    private WebElement registerBtn;

    // Methods to interact with navigation bar elements
    public void clickHomeLink() {
        clickOnElement(homeLink);
    }

    public void clickProductLink() {
        clickOnElement(productLink);
    }

    public void clickServicesLink() {
        clickOnElement(servicesLink);
    }

    public void clickWhatsNewLink() {
        clickOnElement(whatsNewLink);
    }

    public void clickContactUsLink() {
        clickOnElement(contactUsLink);
    }

    // Methods to verify if navigation bar elements are displayed
    public boolean isHomeLinkDisplayed() {
        return isElementExist(homeLink);
    }

    public boolean isProductLinkDisplayed() {
        return isElementExist(productLink);
    }

    public boolean isServicesLinkDisplayed() {
        return isElementExist(servicesLink);
    }

    public boolean isWhatsNewLinkDisplayed() {
        return isElementExist(whatsNewLink);
    }

    public boolean isContactUsLinkDisplayed() {
        return isElementExist(contactUsLink);
    }

    public void navigateToRegistrationPage() {
        clickOnElement(profile);
        clickOnElement(registerBtn);
    }

    public void navigateToProductPage() {
        clickOnElement(productLink);
    }
}
