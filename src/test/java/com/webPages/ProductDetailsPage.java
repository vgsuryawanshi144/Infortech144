package com.webPages;

import com.utilities.SeleniumUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends SeleniumUtility {
    WebDriver driver;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators for product page elements
    @FindBy(css = "#layerednav-list-products > div.category-products.clearfix.products.wrapper.grid.products-grid > ol > li:nth-child(1) > div > div > div.images-container > div > a > span > span > img.lazyload.product-image-photo.lazyload.thumbnail.hover-img.loaded")
    WebElement firstProduct;

    @FindBy(css = "#html-body > div.zoomContainer")
    WebElement productImage;

    @FindBy(css = "div.page-title-wrapper.product")
    WebElement productTitle;

    @FindBy(css = "#product-price-7404 > span")
    WebElement productPrice;

    @FindBy(css = "div.product.attribute.overview > div")
    WebElement productDescription;

    @FindBy(css = "div.product-shop-content.clearfix > div.categories-product-view")
    WebElement productSpecifications;

    @FindBy(css = "#tab-label-reviews-title")
    WebElement productReviews;

    @FindBy(css = "#product-addtoquote-button")
    WebElement addToCartButton;

    @FindBy(css = "div.product-social-links > div > a.action.towishlist")
    WebElement addToWishlistButton;

    @FindBy(css = "div.product-social-links > div > a.action.tocompare")
    WebElement compareButton;

    @FindBy(css = "div.product-shop-content.clearfix > div.product-info-stock-sku > div.stock.available")
    WebElement productAvailabilityStatus;

    @FindBy(css = "div.product-shop-content.clearfix > div.product-sku > span.sku")
    WebElement productSKU;

    @FindBy(css = "#qty")
    WebElement quantitySelector;

    // Methods to interact with product page elements
    public boolean isProductImageVisible() {
        return isElementExist(productImage);
    }

    public boolean isProductTitleVisible() {
        return isElementExist(productTitle);
    }

    public boolean isProductPriceVisible() {
        return isElementExist(productPrice);
    }

    public boolean isProductDescriptionVisible() {
        return isElementExist(productDescription);
    }

    public boolean isProductSpecificationsVisible() {
        return isElementExist(productSpecifications);
    }

    public boolean isProductReviewsVisible() {
        return isElementExist(productReviews);
    }

    public boolean isAddToCartButtonVisible() {
        return isElementExist(addToCartButton);
    }

    public boolean isAddToWishlistButtonVisible() {
        return isElementExist(addToWishlistButton);
    }

    public boolean isCompareButtonVisible() {
        return isElementExist(compareButton);
    }

    public boolean isProductAvailabilityStatusVisible() {
        return isElementExist(productAvailabilityStatus);
    }

    public boolean isProductSKUVisible() {
        return isElementExist(productSKU);
    }

    public boolean isQuantitySelectorVisible() {
        return isElementExist(quantitySelector);
    }

}
