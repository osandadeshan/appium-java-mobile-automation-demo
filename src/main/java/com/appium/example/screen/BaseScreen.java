package com.appium.example.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.appium.example.constant.CommonConstants.MOBILE_PLATFORM_NAME;
import static com.appium.example.constant.DriverConstants.ANDROID;

public class BaseScreen {
    public final WebDriver driver;
    public final WebDriverWait wait;

    public BaseScreen(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void waitUntilElementVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement scrollToElement(String elementText) {
        WebElement element;

        if (MOBILE_PLATFORM_NAME.equalsIgnoreCase(ANDROID)) {
            element = driver
                    .findElement(
                            AppiumBy.androidUIAutomator(
                                    "new UiScrollable(new UiSelector().scrollable(true))"
                                            + ".scrollIntoView(new UiSelector().text(\"" + elementText + "\"))"
                            )
                    );
        } else {
            element = driver.findElement(AppiumBy.iOSNsPredicateString("label == '" + elementText + "'"));
        }

        return element;
    }

    public void tap(By by) {
        waitUntilElementVisible(by);
        driver.findElement(by).click();
    }

    public void scrollAndTap(String elementText) {
        scrollToElement(elementText).click();
    }

    public void inputText(By by, String text) {
        waitUntilElementVisible(by);
        driver.findElement(by).sendKeys(text);
    }

    public void scrollAndInputText(String elementText, String text) {
        scrollToElement(elementText).sendKeys(text);
    }
}
