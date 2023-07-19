package common;

import org.openqa.selenium.WebDriver;
import screens.BaseScreen;
import screens.LoginScreen;
import screens.NavigationBarScreen;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 19/6/23
 * Time            : 12:45 pm
 * Description     :
 **/

public class ScreenProvider extends BaseScreen {
    public ScreenProvider(WebDriver driver) {
        super(driver);
    }

    public NavigationBarScreen getNavigationBarScreen() {
        return new NavigationBarScreen(driver);
    }

    public LoginScreen getLoginScreen() {
        return new LoginScreen(driver);
    }
}
