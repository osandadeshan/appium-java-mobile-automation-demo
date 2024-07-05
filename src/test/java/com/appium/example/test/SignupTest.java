package com.appium.example.test;

import com.appium.example.annotation.Feature;
import org.testng.annotations.Test;

import static com.appium.example.constant.AlertConstants.SIGNUP_ALERT;
import static com.appium.example.constant.Feature.SIGN_UP;
import static com.appium.example.constant.LoginConstants.PASSWORD;
import static net.andreinc.mockneat.unit.user.Emails.emails;
import static org.testng.Assert.assertEquals;

public class SignupTest extends BaseTest {
    @Feature(SIGN_UP)
    @Test(description = "Verify that a user can signup to the application")
    public void testSignup() {
        screen().getNavigationBarScreen()
                .tapOnLoginIcon();
        screen().getLoginScreen()
                .tapOnSignUpContainer()
                .signUp(emails().domain("startup.io").val(), PASSWORD, PASSWORD);
        assertEquals(
                uiComponent().getAlertScreen().getAlertTitle(),
                SIGNUP_ALERT.getAlertTitle()
        );
        assertEquals(
                uiComponent().getAlertScreen().getAlertMessage(),
                SIGNUP_ALERT.getAlertMessage()
        );
    }
}
