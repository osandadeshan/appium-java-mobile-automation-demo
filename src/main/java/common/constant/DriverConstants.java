package common.constant;

import static util.Reader.*;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 22/6/23
 * Time            : 1:16 pm
 * Description     :
 **/

public class DriverConstants {
    // Appium Constants
    public static final String APPIUM_URL = getAppiumConfig("appium_url");
    public static final Long APPIUM_DRIVER_TIMEOUT_IN_SECONDS = Long.parseLong(
            getAppiumConfig("appium_driver_timeout_in_seconds")
    );

    // Android Constants
    public static final String ANDROID = "android";
    public static final String ANDROID_DEVICE_NAME = getDeviceConfig("android_device_name");
    public static final String ANDROID_AUTOMATION_NAME = getDeviceConfig("android_automation_name");
    public static final String ANDROID_PLATFORM_VERSION = getDeviceConfig("android_platform_version");
    public static final String ANDROID_APP_FILE_PATH = getEnvironmentConfig("android_app_file_path");
    public static final String ANDROID_APP_PACKAGE = getDeviceConfig("android_app_package");
    public static final String ANDROID_APP_ACTIVITY = getDeviceConfig("android_app_activity");
    public static final String ANDROID_NO_RESET = getDeviceConfig("android_no_reset");
    public static final String ANDROID_FULL_RESET = getDeviceConfig("android_full_reset");

    // iOS Constants
    public static final String IOS = "ios";
    public static final String IOS_DEVICE_NAME = getDeviceConfig("ios_device_name");
    public static final String IOS_AUTOMATION_NAME = getDeviceConfig("ios_automation_name");
    public static final String IOS_PLATFORM_VERSION = getDeviceConfig("ios_platform_version");
    public static final String IOS_APP_FILE_PATH = getEnvironmentConfig("ios_app_file_path");
    public static final String IOS_SHOULD_TERMINATE_APP = getDeviceConfig("ios_should_terminate_app");
    public static final String IOS_NO_RESET = getDeviceConfig("ios_no_reset");
    public static final String IOS_FULL_RESET = getDeviceConfig("ios_full_reset");
}
