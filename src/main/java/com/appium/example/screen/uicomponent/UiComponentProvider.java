package com.appium.example.screen.uicomponent;

import com.appium.example.screen.BaseScreen;
import org.openqa.selenium.WebDriver;

public class UiComponentProvider extends BaseScreen {
    public UiComponentProvider(WebDriver driver) {
        super(driver);
    }

    public AlertScreen getAlertScreen() {
        return new AlertScreen(driver);
    }
}
