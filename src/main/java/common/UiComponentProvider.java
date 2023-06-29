package common;

import org.openqa.selenium.WebDriver;
import screens.BaseScreen;
import screens.uicomponents.AlertScreen;

/**
 * Project Name    : appium-page-object-demo
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
