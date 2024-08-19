package com.webPages;

import com.utilities.SeleniumUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends SeleniumUtility {
    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Web Elements
    @FindBy(css = "div.col-xl-1.col-lg-6.col-md-6.col-sm-6.col-6.item.item-logo > div")
    WebElement siteLogo;

    @FindBy(xpath = "//*[@id=\"store.menu\"]/div")
    WebElement mainNavigationMenu;

    @FindBy(css = "#store\\.menu > div > ul > li.level0.category-item.level-top.dropdown.home")
    WebElement homeLink;

    @FindBy(css = "#store\\.menu > div > ul > li.level0.category-item.level-top.cat.nav-1.hasChild.parent")
    WebElement productsLink;

    @FindBy(css = "#store\\.menu > div > ul > li.level0.category-item.level-top.ext.first.dropdown")
    WebElement servicesLink;

    @FindBy(css = "#store\\.menu > div > ul > li.level0.category-item.level-top.ext.first.dropdown")
    WebElement whatsNewLink;

    @FindBy(css = "#store\\.menu > div > ul > li.level0.category-item.level-top.ext.last.dropdown")
    WebElement contactUsLink;

    @FindBy(css = "#search")
    WebElement searchBar;

    @FindBy(css = "div > div.header-search")
    WebElement searchButton;

    @FindBy(css = "#search_mini_form > button")
    WebElement enterSearchInputButton;

    @FindBy(css = "div.breadcrumbs > div > h2")
    WebElement bannerImage;

    @FindBy(css = "footer")
    WebElement footer;

    @FindBy(css = "#newsletter")
    WebElement subscribeToNewsletterField;

    @FindBy(css = "#newsletter-validate-detail > div > div.field.newsletter.input-box.clearfix > div.visible > div.actions > button")
    WebElement subscribeToNewsletterButton;

    @FindBy(css = "footer a")
    private List<WebElement> footerLinks;

    @FindBy(css = ".social-media-icons a")
    private List<WebElement> socialMediaIcons;

    /**
     * @return the siteLogo
     */
    public WebElement getSiteLogo() {
        return siteLogo;
    }

    /**
     * @return the mainNavigationMenu
     */
    public WebElement getMainNavigationMenu() {
        return mainNavigationMenu;
    }

    /**
     * @return the homeLink
     */
    public WebElement getHomeLink() {
        return homeLink;
    }

    /**
     * @return the productsLink
     */
    public WebElement getProductsLink() {
        return productsLink;
    }

    /**
     * @return the contactUsLink
     */
    public WebElement getContactUsLink() {
        return contactUsLink;
    }

    /**
     * @return the searchBar
     */
    public WebElement getSearchBar() {
        return searchBar;
    }

    /**
     * @return the searchButton
     */
    public WebElement getSearchButton() {
        return searchButton;
    }

    /**
     * @return the bannerImage
     */
    public WebElement getBannerImage() {
        return bannerImage;
    }

    /**
     * @return the footer
     */
    public WebElement getFooter() {
        return footer;
    }

    /**
     * @return the footerLinks
     */
    public List<WebElement> getFooterLinks() {
        return footerLinks;
    }

    /**
     * @return the socialMediaIcons
     */
    public List<WebElement> getSocialMediaIcons() {
        return socialMediaIcons;
    }

    /**
     * @return the subscribeToNewsletterField
     */
    public WebElement getSubscribeToNewsletterField() {
        return subscribeToNewsletterField;
    }

    /**
     * @return the subscribeToNewsletterButton
     */
    public WebElement getSubscribeToNewsletterButton() {
        return subscribeToNewsletterButton;
    }

    /**
     * @return the whatsNewLink
     */
    public WebElement getWhatsNewLink() {
        return whatsNewLink;
    }

    /**
     * @param whatsNewLink the whatsNewLink to set
     */
    public void setWhatsNewLink(WebElement whatsNewLink) {
        this.whatsNewLink = whatsNewLink;
    }

    /**
     * @return the servicesLink
     */
    public WebElement getServicesLink() {
        return servicesLink;
    }

    /**
     * @param footerLinks the footerLinks to set
     */
    public void setFooterLinks(List<WebElement> footerLinks) {
        this.footerLinks = footerLinks;
    }

    /**
     * @param socialMediaIcons the socialMediaIcons to set
     */
    public void setSocialMediaIcons(List<WebElement> socialMediaIcons) {
        this.socialMediaIcons = socialMediaIcons;
    }

    // Actions methods

    public boolean logoIsDisplayed() {

        return isElementExist(siteLogo);
    }

    public void clickSiteLogo() {
        clickOnElement(siteLogo);
    }

    public boolean mainNavMenuIsDisplayed() {
        return isElementExist(mainNavigationMenu);
    }

    public void clickHomeLink() {
        clickOnElement(homeLink);
    }

    public void clickProductsLink() {
        clickOnElement(productsLink);
    }

    public void clickContactUsLink() {
        clickOnElement(contactUsLink);
    }

    public void search(String query) {
        typeInput(searchBar, query);
        clickOnElement(searchButton);
    }

    public boolean navigationOptionsAreDisplayed() {
        return isElementExist(homeLink) && isElementExist(productsLink) && isElementExist(servicesLink)
                && isElementExist(contactUsLink);
    }

    public void clickOnNavOption(WebElement navOption) {
        clickOnElement(navOption);
    }

    public boolean searchBarIsDisplayed() {
        clickOnElement(searchButton);
        return isElementExist(searchBar);
    }

    public boolean footerIsDisplayed() {
        return isElementExist(footer);
    }

    public boolean socialMediaIconsAreDisplayed() {
        for (WebElement icon : socialMediaIcons) {
            if (!isElementExist(icon)) {
                return false;
            }
        }
        return true;
    }

    public boolean newsletterFieldIsDisplayed() {
        return isElementExist(subscribeToNewsletterField);
    }

    public boolean newsletterSubscribeButtonIsDisplayedAndClickable() {
        return isElementExist(subscribeToNewsletterButton) && isElementExist(subscribeToNewsletterButton);
    }

}