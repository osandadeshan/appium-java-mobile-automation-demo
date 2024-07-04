package com.appium.example.test;

import com.appium.example.annotation.Feature;
import org.testng.annotations.Test;

import static com.appium.example.constant.AlertConstants.LOGIN_ALERT;
import static com.appium.example.constant.Feature.LOGIN;
import static com.appium.example.constant.LoginConstants.EMAIL_ADDRESS;
import static com.appium.example.constant.LoginConstants.PASSWORD;
import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    @Feature(LOGIN)
    @Test(description = "Verify that a user can login to the application with valid credentials")
    public void testValidLogin() {
        screen().getNavigationBarScreen()
                .tapOnLoginIcon();
        screen().getLoginScreen()
                .login(EMAIL_ADDRESS, PASSWORD);
        assertEquals(
                uiComponent().getAlertScreen().getAlertTitle(),
                LOGIN_ALERT.getAlertTitle()
        );
        assertEquals(
                uiComponent().getAlertScreen().getAlertMessage(),
                LOGIN_ALERT.getAlertMessage()
        );
    }
}
