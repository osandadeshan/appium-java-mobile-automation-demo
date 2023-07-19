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

public interface MobileDriverService {
    void spinUpDriver();

    void closeDriver();

    MobileDriver<MobileElement> getDriver();
}
