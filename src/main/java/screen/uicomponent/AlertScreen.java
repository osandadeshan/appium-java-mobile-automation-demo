package screen.uicomponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import screen.BaseScreen;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 19/6/23
 * Time            : 12:28 pm
 * Description     :
 **/

public class AlertScreen extends BaseScreen {
    private final String alertText;

    public AlertScreen(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.alertIsPresent());
        alertText = driver.switchTo().alert().getText();
    }

    public String getAlertTitle() {
        return alertText.split("\n")[0];
    }

    public String getAlertMessage() {
        return alertText.split("\n")[1];
    }
}
