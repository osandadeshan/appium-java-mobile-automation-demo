package com.appium.example.util.driver;

import io.appium.java_client.AppiumDriver;

public class MobileDriverHolder {
    private static final ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    private MobileDriverHolder() {}

    public static AppiumDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(AppiumDriver appiumDriver) {
        driver.set(appiumDriver);
    }

    public static void removeDriver() {
        driver.remove();
    }
}
