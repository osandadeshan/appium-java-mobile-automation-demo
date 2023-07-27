package util.driver;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static common.constant.DriverConstants.*;
import static io.appium.java_client.remote.MobileCapabilityType.*;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 19/6/23
 * Time            : 12:47 pm
 * Description     :
 **/

public class IosDriverServiceImpl implements MobileDriverService {
    private IOSDriver<MobileElement> iosDriver;

    @Override
    public void spinUpDriver() {
        final DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(DEVICE_NAME, IOS_DEVICE_NAME);
        capabilities.setCapability(AUTOMATION_NAME, IOS_AUTOMATION_NAME);
        capabilities.setCapability(PLATFORM_NAME, IOS);
        capabilities.setCapability(PLATFORM_VERSION, IOS_PLATFORM_VERSION);
        capabilities.setCapability(APP, new File(IOS_APP_FILE_PATH).getAbsolutePath());
        capabilities.setCapability("appium:shouldTerminateApp", IOS_SHOULD_TERMINATE_APP);
        capabilities.setCapability(NO_RESET, IOS_NO_RESET);
        capabilities.setCapability(FULL_RESET, IOS_FULL_RESET);

        try {
            iosDriver = new IOSDriver<>(new URL(APPIUM_URL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        iosDriver.manage().timeouts().implicitlyWait(APPIUM_DRIVER_TIMEOUT_IN_SECONDS, SECONDS);
    }

    @Override
    public void closeDriver() {
        iosDriver.closeApp();
    }

    @Override
    public MobileDriver<MobileElement> getDriver() {
        return iosDriver;
    }
}
