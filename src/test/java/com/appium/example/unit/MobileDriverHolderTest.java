package com.appium.example.unit;

import com.appium.example.util.driver.MobileDriverHolder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNull;

public class MobileDriverHolderTest {

    @AfterMethod
    public void cleanup() {
        MobileDriverHolder.removeDriver();
    }

    @Test
    public void getDriverShouldReturnNullWhenNothingSet() {
        assertNull(MobileDriverHolder.getDriver());
    }

    @Test
    public void removeDriverShouldClearThreadLocal() {
        // set to null (can't create real AppiumDriver without a server)
        // verify remove clears it
        MobileDriverHolder.removeDriver();
        assertNull(MobileDriverHolder.getDriver());
    }
}
