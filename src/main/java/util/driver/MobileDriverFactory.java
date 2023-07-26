package util.driver;

import java.security.InvalidParameterException;

import static common.constant.CommonConstants.MOBILE_PLATFORM_NAME;
import static common.constant.DriverConstants.ANDROID;
import static common.constant.DriverConstants.IOS;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 19/6/23
 * Time            : 12:47 pm
 * Description     :
 **/

public class MobileDriverFactory {
    public MobileDriverService getDriverService() {
        MobileDriverService driver;

        switch (MOBILE_PLATFORM_NAME) {
            case ANDROID:
                driver = new AndroidDriverServiceImpl();
                break;
            case IOS:
                driver = new IosDriverServiceImpl();
                break;
            default:
                throw new InvalidParameterException("Please use platform as '" + ANDROID + "' or '" + IOS + "'");
        }

        return driver;
    }
}
