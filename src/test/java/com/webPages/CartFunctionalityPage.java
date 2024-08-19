package com.webPages;

import com.utilities.SeleniumUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartFunctionalityPage extends SeleniumUtility {
    WebDriver driver;

    public CartFunctionalityPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators

    @FindBy(css = "div.col-xl-2.col-lg-6.col-md-6.col-sm-6.col-6.item.item-tool > div > div.header-account > div.outside-close.mobile")
    private WebElement openProduct;

    @FindBy(css = "#maincontent > div.columns > div > div.product-view > div > "
            + "div.product-info-main.product-shop.col > div.product-shop-content.clearfix >"
            + " div.product-social-links > div > a.action.tocompare")
    private WebElement addToCompare;

    @FindBy(css = "#ajaxcompare_checkout > span")
    private WebElement veiwCoparisonList;

    @FindBy(css = "#html-body > div.page-wrapper > header > div > header >" + " div > div.header-content > div > div > "
            + "div.col-xl-2.col-lg-6.col-md-6.col-sm-6.col-6.item.item-tool > "
            + "div > div.header-account > div.outside-close.mobile")
    private WebElement addToCartButton;

    @FindBy(css = "#maincontent > div.page.messages > div:nth-child(2) > div > div > div > a")
    private WebElement openCart;

    @FindBy(css = ".cart-item-quantity")
    public WebElement cartItemQuantity;

    @FindBy(css = ".remove-from-cart-button")
    public WebElement removeFromCartButton;

    @FindBy(css = ".cart-total-price")
    public WebElement cartTotalPrice;

    @FindBy(css = ".continue-shopping-button")
    public WebElement continueShoppingButton;

    @FindBy(css = ".proceed-to-checkout-button")
    public WebElement proceedToCheckoutButton;

    @FindBy(css = ".cart-product-thumbnail")
    public WebElement cartProductThumbnail;

    @FindBy(css = ".cart-product-name")
    public WebElement cartProductName;

    @FindBy(css = ".cart-product-price")
    public WebElement cartProductPrice;

    @FindBy(css = ".discount-code-input")
    public WebElement discountCodeInput;

    @FindBy(css = ".apply-discount-button")
    public WebElement applyDiscountButton;

    @FindBy(css = ".total-price-before-discount")
    public WebElement totalPriceBeforeDiscount;

    @FindBy(css = ".total-price-after-discount")
    public WebElement totalPriceAfterDiscount;

    @FindBy(css = ".shipping-cost")
    public WebElement shippingCost;

    @FindBy(css = ".tax-amount")
    public WebElement taxAmount;

    // Methods to interact with cart elements
    public void addToCart() {
        clickOnElement(openProduct);
        clickOnElement(addToCompare);
        clickOnElement(veiwCoparisonList);
        clickOnElement(addToCartButton);
        clickOnElement(openCart);
    }

    public void updateQuantity(String quantity) {
        cartItemQuantity.clear();
        cartItemQuantity.sendKeys(quantity);
    }

    public void removeFromCart() {
        clickOnElement(removeFromCartButton);
    }

    public String getTotalPrice() {
        return cartTotalPrice.getText();
    }

    public void applyDiscountCode(String code) {
        discountCodeInput.clear();
        discountCodeInput.sendKeys(code);
        clickOnElement(applyDiscountButton);
    }

    // Methods to verify if elements are visible
    public boolean isProductThumbnailVisible() {
        return isElementExist(cartProductThumbnail);
    }

    public boolean isProductNameVisible() {
        return isElementExist(cartProductName);
    }

    public boolean isProductPriceVisible() {
        return isElementExist(cartProductPrice);
    }

    public boolean isContinueShoppingButtonVisible() {
        return isElementExist(continueShoppingButton);
    }

    public boolean isProceedToCheckoutButtonVisible() {
        return isElementExist(proceedToCheckoutButton);
    }

    // Methods to get text values from elements
    public String getTotalPriceBeforeDiscount() {
        return totalPriceBeforeDiscount.getText();
    }

    public String getTotalPriceAfterDiscount() {
        return totalPriceAfterDiscount.getText();
    }

    public String getShippingCost() {
        return shippingCost.getText();
    }

    public String getTaxAmount() {
        return taxAmount.getText();
    }
}