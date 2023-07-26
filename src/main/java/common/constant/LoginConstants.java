package common.constant;

import static util.Reader.getEnvironmentConfig;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 22/6/23
 * Time            : 11:11 pm
 * Description     :
 **/

public class LoginConstants {
    public static final String EMAIL_ADDRESS = getEnvironmentConfig("email_address");
    public static final String PASSWORD = getEnvironmentConfig("password");
}
