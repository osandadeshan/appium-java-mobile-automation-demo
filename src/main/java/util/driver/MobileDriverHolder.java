package util.driver;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 19/6/23
 * Time            : 12:47 pm
 * Description     :
 **/

public class MobileDriverHolder {
    private static final ThreadLocal<MobileDriver<MobileElement>> driver = new ThreadLocal<>();

    public static MobileDriver<MobileElement> getDriver() {
        return driver.get();
    }

    public static void setDriver(MobileDriver<MobileElement> driver) {
        MobileDriverHolder.driver.set(driver);
    }
}
