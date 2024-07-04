package com.appium.example.constant;

import java.time.Duration;

import static com.appium.example.util.PropertyReader.*;

public class DriverConstants {
    // Appium Constants
    public static final String APPIUM_SERVER_IP = getAppiumConfig("appium_server_ip");
    public static final int APPIUM_SERVER_PORT = Integer.parseInt(getAppiumConfig("appium_server_port"));
    public static final Duration APPIUM_DRIVER_TIMEOUT = Duration.ofSeconds(
            Long.parseLong(getAppiumConfig("appium_driver_timeout_in_seconds"))
    );

    // Android Constants
    public static final String ANDROID = "android";
    public static final String ANDROID_DEVICE_NAME = getDeviceConfig("android_device_name");
    public static final String ANDROID_APP_FILE_PATH = getEnvironmentConfig("android_app_file_path");
    public static final String ANDROID_APP_PACKAGE = getDeviceConfig("android_app_package");
    public static final String ANDROID_APP_ACTIVITY = getDeviceConfig("android_app_activity");
    public static final String ANDROID_NO_RESET = getDeviceConfig("android_no_reset");
    public static final String ANDROID_FULL_RESET = getDeviceConfig("android_full_reset");

    // iOS Constants
    public static final String IOS = "ios";
    public static final String IOS_DEVICE_NAME = getDeviceConfig("ios_device_name");
    public static final String IOS_APP_FILE_PATH = getEnvironmentConfig("ios_app_file_path");
    public static final String IOS_PLATFORM_VERSION = getDeviceConfig("ios_platform_version");
    public static final String IOS_NO_RESET = getDeviceConfig("ios_no_reset");
    public static final String IOS_FULL_RESET = getDeviceConfig("ios_full_reset");
}
