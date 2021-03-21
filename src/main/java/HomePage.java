import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

/**
 * Project Name    : appium-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 3/21/2021
 * Time            : 3:08 PM
 * Description     :
 **/

public class HomePage {

    private final By greetingLabel = By.id("com.maxsoftlk.loginapplication:id/tvGreeting");
    private final By welcomeLabel = By.id("com.maxsoftlk.loginapplication:id/tvWelcome");

    private final AndroidDriver<MobileElement> driver;

    public HomePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public String getGreetingLabelText() {
        return driver.findElement(greetingLabel).getText();
    }

    public String getWelcomeLabelText() {
        return driver.findElement(welcomeLabel).getText();
    }
}
