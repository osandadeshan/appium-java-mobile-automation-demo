import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Project Name    : appium-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 3/21/2021
 * Time            : 3:10 PM
 * Description     :
 **/

public class LoginTest {

    private final DesiredCapabilities caps = new DesiredCapabilities();
    private AndroidDriver<MobileElement> driver;
    private LoginPage loginPage;

    @BeforeSuite
    public void setupDeviceCapabilities() {
        caps.setCapability("deviceName", "Galaxy Nexus API 24");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0.0");
        caps.setCapability("app", new File(System.getProperty("user.dir")
                + "/src/test/resources/loginApp.apk").getAbsolutePath());
        caps.setCapability("appPackage", "com.maxsoftlk.loginapplication");
        caps.setCapability("appActivity", "com.maxsoftlk.loginapplication.MainActivity");
        caps.setCapability("noReset", true);
        caps.setCapability("fullReset", false);
    }

    @BeforeMethod
    public void spinUpAndroidDriver() {
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        loginPage = new LoginPage(driver);
    }

    @Test(description = "Verify that a user can login to the application with valid credentials")
    public void testValidLogin() {
        loginPage.login("Osanda", "MaxSoft123");
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getGreetingLabelText(), "Hi Osanda,");
        Assert.assertEquals(homePage.getWelcomeLabelText(), "Welcome!");
    }

    @Test(description = "Verify that a user cannot login to the application with invalid credentials")
    public void testInvalidLogin() {
        loginPage.login("Osanda", "MaxSoft1234");
        Assert.assertEquals(loginPage.getAttemptsCounterLabelText(), "Number of attempts remaining: 4");
    }

    @AfterMethod
    public void stopAndroidDriver() {
        driver.quit();
    }
}
