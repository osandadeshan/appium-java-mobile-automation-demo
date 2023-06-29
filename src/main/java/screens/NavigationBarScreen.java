package screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : appium-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 14/6/23
 * Time            : 2:14 pm
 * Description     :
 **/

public class NavigationBarScreen extends BaseScreen {
    private final By loginIcon = MobileBy.AccessibilityId("Login");

    public NavigationBarScreen(WebDriver driver) {
        super(driver);
    }

    public void tapOnLoginIcon() {
        tap(loginIcon);
    }
}
