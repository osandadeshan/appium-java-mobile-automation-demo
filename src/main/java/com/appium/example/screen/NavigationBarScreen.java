package com.appium.example.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class NavigationBarScreen extends BaseScreen {
    public NavigationBarScreen(WebDriver driver) {
        super(driver);
    }

    public void tapOnLoginIcon() {
        tap(AppiumBy.accessibilityId("Login"));
    }

    public void tapOnSwipeIcon() {
        tap(AppiumBy.accessibilityId("Swipe"));
    }
}
