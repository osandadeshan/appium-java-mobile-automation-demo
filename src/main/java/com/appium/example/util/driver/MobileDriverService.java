package com.appium.example.util.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.util.HashMap;
import java.util.Map;

import static com.appium.example.constant.DriverConstants.ANDROID_SDK_ROOT;
import static com.appium.example.constant.DriverConstants.APPIUM_SERVER_IP;
import static com.appium.example.constant.DriverConstants.APPIUM_SERVER_PORT;

public interface MobileDriverService {
    default AppiumDriverLocalService startAppiumService() {
        // Inherit the full system environment so Node.js can start normally,
        // then overlay the Android SDK variables that the uiautomator2 driver requires.
        Map<String, String> env = new HashMap<>(System.getenv());
        env.put("ANDROID_HOME", ANDROID_SDK_ROOT);
        env.put("ANDROID_SDK_ROOT", ANDROID_SDK_ROOT);
        // Append platform-tools to PATH so adb.exe is resolvable
        String currentPath = env.getOrDefault("PATH", env.getOrDefault("Path", ""));
        env.put("PATH", currentPath + ";" + ANDROID_SDK_ROOT + "\\platform-tools");

        AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildService(
                new AppiumServiceBuilder()
                        .withIPAddress(APPIUM_SERVER_IP)
                        .usingPort(APPIUM_SERVER_PORT)
                        .withEnvironment(env)
        );
        appiumService.start();
        return appiumService;
    }

    default void stopAppiumService(AppiumDriverLocalService appiumService) {
        appiumService.stop();
    }

    void spinUpDriver(AppiumDriverLocalService appiumService);

    void closeDriver();

    AppiumDriver getDriver();
}
