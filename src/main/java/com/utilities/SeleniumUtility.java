package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {
    public static WebDriver driver;
    public static WebDriverWait wait;
    protected Properties properties;
    protected Actions action;
    protected FileInputStream fis;
    protected static String filePath;

    {
        filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testData\\testAppData.properties";
    }

    public WebDriver setUp(String browserName, String appUrl) {
        properties = new Properties();
        try {
            fis = new FileInputStream(filePath);
            properties.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get(appUrl);
        action = new Actions(driver);
        return driver;
    }

    public String getValueFromPropertyFile(String key) {
        return properties.getProperty(key);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void typeInput(WebElement element, String input) {
        waitForElementDisplayed(element);
        element.clear();
        element.sendKeys(input);
    }

    public void clickOnElement(WebElement element) {
        waitForElementToBeClickable(element);
        try {
            element.click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            waitForElementToBeClickable(element);
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void performMouseOverOperation(WebElement element) {
        action.moveToElement(element).perform();
    }

    public void performRightClickOperation(WebElement element) {
        action.moveToElement(element).contextClick().build().perform();
    }

    public void performDragAndDrop(WebElement source, WebElement target) {
        action.dragAndDrop(source, target).build().perform();
    }

    public void takeScreenShotOfThePage(String location) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(location));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeScreenshotWithTimestamp(String basePath) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        try {
            FileUtils.copyFile(file, new File(basePath + "_screenshot_" + timestamp + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getRequiredAttributeValue(WebElement element, String attribute) {
        waitForElementDisplayed(element);
        setSleepTime(2000);
        return element.getAttribute(attribute);
    }

    public WebElement getActiveElement() {
        return driver.switchTo().activeElement();
    }

    public String getCurrentTitleOfApplication(String title) {
        wait.until(ExpectedConditions.titleContains(title));
        return driver.getTitle();
    }

    public String getCurrentTitleOfApplication() {
        return driver.getTitle();
    }

    public String getCurrentUrlOfApplication() {
        return driver.getCurrentUrl();
    }

    public boolean isElementExist(WebElement element) {
        waitForElementDisplayed(element);
        return element.isDisplayed();
    }

    public boolean isCheckBoxSelected(WebElement element) {
        waitForElementDisplayed(element);
        return element.isSelected();
    }

    protected void handleHtmlDropdownListWithVisibleText(WebElement element, String visibleText) {
        waitForElementDisplayed(element);
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    protected void handleHtmlDropdownListWithIndex(WebElement element, int index) {
        waitForElementDisplayed(element);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    protected List<WebElement> getHtmlDropdownListSize(WebElement element) {
        waitForElementDisplayed(element);
        Select select = new Select(element);
        return select.getOptions();
    }

    protected WebElement getFirstSelectedOptionFromHtmlDropdownList(WebElement element) {
        waitForElementDisplayed(element);
        Select select = new Select(element);
        return select.getFirstSelectedOption();
    }

    protected List<WebElement> getAllSelectedOptionFromMultiSelectDropdownList(WebElement element) {
        waitForElementDisplayed(element);
        Select select = new Select(element);
        return select.getAllSelectedOptions();
    }

    protected void switchToIFrameWithWebElement(WebElement element) {
        waitForElementDisplayed(element);
        driver.switchTo().frame(element);
    }

    protected void switchToIFrameWithIndex(int index) {
        driver.switchTo().frame(index);
    }

    protected void switchFromIFrameToMainPage() {
        driver.switchTo().defaultContent();
    }

    protected void setSleepTime(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void refreshPage() {
        driver.navigate().refresh();
    }

    public void waitForElementDisplayed(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void acceptAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText() {
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }

    public void sendKeysToAlert(String text) {
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().sendKeys(text);
    }

    public void cleanUp() {
        driver.quit();
    }
}