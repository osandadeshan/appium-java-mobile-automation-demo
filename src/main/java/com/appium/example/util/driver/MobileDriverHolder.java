package com.appium.example.util.driver;

import io.appium.java_client.AppiumDriver;

public class MobileDriverHolder {
    private static final ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public static AppiumDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(AppiumDriver driver) {
        MobileDriverHolder.driver.set(driver);
    }
}
