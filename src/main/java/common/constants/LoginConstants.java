package common.constants;

import static util.PropertyFileReader.getPropertyValue;

/**
 * Project Name    : appium-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 22/6/23
 * Time            : 11:11 pm
 * Description     :
 **/

public class LoginConstants {
    // Login Data Property File Path
    public static final String LOGIN_DATA_PROPERTY_FILE_PATH = "test_data/login_data.properties";

    // Login Credentials
    public static final String EMAIL_ADDRESS = getPropertyValue(LOGIN_DATA_PROPERTY_FILE_PATH, "email_address");
    public static final String PASSWORD = getPropertyValue(LOGIN_DATA_PROPERTY_FILE_PATH, "password");
}
