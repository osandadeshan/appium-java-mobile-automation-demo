package util.driver;

import java.security.InvalidParameterException;

import static common.constants.DriverConstants.ANDROID;
import static common.constants.DriverConstants.IOS;

/**
 * Project Name    : appium-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 19/6/23
 * Time            : 12:47 pm
 * Description     :
 **/

public class MobileDriverFactory {
    public MobileDriverService getDriverService() {
        MobileDriverService driver;
        final String platform = System.getProperty("platform");

        if (platform != null) {
            switch (platform.toUpperCase()) {
                case ANDROID:
                    driver = new AndroidDriverServiceImpl();
                    break;
                case IOS:
                    driver = new IosDriverServiceImpl();
                    break;
                default:
                    throw new InvalidParameterException("Please use platform as '" + ANDROID + "' or '" + IOS + "'");
            }
        } else
            driver = new AndroidDriverServiceImpl();

        return driver;
    }
}
