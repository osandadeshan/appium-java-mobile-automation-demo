package util.driver;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static common.constant.DriverConstants.*;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
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

public class AndroidDriverServiceImpl implements MobileDriverService {
    private AndroidDriver<MobileElement> androidDriver;

    @Override
    public void spinUpDriver() {
        final DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(DEVICE_NAME, ANDROID_DEVICE_NAME);
        capabilities.setCapability(AUTOMATION_NAME, ANDROID_AUTOMATION_NAME);
        capabilities.setCapability(PLATFORM_NAME, ANDROID);
        capabilities.setCapability(PLATFORM_VERSION, ANDROID_PLATFORM_VERSION);
        capabilities.setCapability(APP, new File(ANDROID_APP_FILE_PATH).getAbsolutePath());
        capabilities.setCapability(APP_PACKAGE, ANDROID_APP_PACKAGE);
        capabilities.setCapability(APP_ACTIVITY, ANDROID_APP_ACTIVITY);
        capabilities.setCapability(NO_RESET, ANDROID_NO_RESET);
        capabilities.setCapability(FULL_RESET, ANDROID_FULL_RESET);

        try {
            androidDriver = new AndroidDriver<>(new URL(APPIUM_URL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        androidDriver.manage().timeouts().implicitlyWait(APPIUM_DRIVER_TIMEOUT_IN_SECONDS, SECONDS);
    }

    @Override
    public void closeDriver() {
        String appId = (String) androidDriver
                .getCapabilities()
                .getCapability(APP_PACKAGE);
        if (appId != null)
            androidDriver.terminateApp(appId);
    }

    public MobileDriver<MobileElement> getDriver() {
        return androidDriver;
    }
}
