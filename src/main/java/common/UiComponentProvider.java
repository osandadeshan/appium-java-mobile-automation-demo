package common;

import org.openqa.selenium.WebDriver;
import screen.BaseScreen;
import screen.uicomponent.AlertScreen;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 19/6/23
 * Time            : 12:47 pm
 * Description     :
 **/

public class UiComponentProvider extends BaseScreen {
    public UiComponentProvider(WebDriver driver) {
        super(driver);
    }

    public AlertScreen getAlertScreen() {
        return new AlertScreen(driver);
    }
}
