package screen;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 14/6/23
 * Time            : 2:14 pm
 * Description     :
 **/

public class NavigationBarScreen extends BaseScreen {
    public NavigationBarScreen(WebDriver driver) {
        super(driver);
    }

    public void tapOnLoginIcon() {
        tap(MobileBy.AccessibilityId("Login"));
    }
}
