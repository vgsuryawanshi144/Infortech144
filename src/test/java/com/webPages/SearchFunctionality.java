package com.webPages;

import com.utilities.SeleniumUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionality extends SeleniumUtility {
    WebDriver driver;

    public SearchFunctionality(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#search")
    WebElement searchBar;

    @FindBy(css = "div.header-search > span")
    WebElement searchButton;

    @FindBy(css = "#search_mini_form > button")
    WebElement enterSearchInputButton;

    @FindBy(css = "div.search.results > div.toolbar-bottom > div > div.pages > ul")
    WebElement searchSuccessResult;

    @FindBy(css = "div.message.notice > div")
    WebElement searchFailedResult;

    public WebElement getSearchBar() {
        return searchBar;
    }

    public void setSearchBar(WebElement searchBar) {
        this.searchBar = searchBar;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }

    public WebElement getEnterSearchInputButton() {
        return enterSearchInputButton;
    }

    public void setEnterSearchInputButton(WebElement enterSearchInputButton) {
        this.enterSearchInputButton = enterSearchInputButton;
    }

    public WebElement getSearchSuccessResult() {
        return searchSuccessResult;
    }

    public void setSearchSuccessResult(WebElement searchSuccessResult) {
        this.searchSuccessResult = searchSuccessResult;
    }

    public WebElement getSearchFailedResult() {
        return searchFailedResult;
    }

    public void setSearchFailedResult(WebElement searchFailedResult) {
        this.searchFailedResult = searchFailedResult;
    }

    // Actions
    public boolean searchButtonAvailable() {
        return isElementExist(searchButton);
    }

    public boolean searchBoxIsPresent() {
        return isElementExist(searchBar);
    }

    public void enterSearchInput(String searchInput) {
        clickOnElement(searchButton);
        typeInput(searchBar, searchInput);
        clickOnElement(enterSearchInputButton);
    }

    public boolean isSearchSuccessful() {
        return isElementExist(searchSuccessResult);
    }

    public boolean isSearchUnsuccessful() {
        return isElementExist(searchFailedResult);
    }
}
