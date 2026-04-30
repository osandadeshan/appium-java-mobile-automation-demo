package com.appium.example.unit;

import com.appium.example.constant.AlertConstants;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class AlertConstantsTest {

    @Test
    public void loginAlertTitleShouldBeSuccess() {
        assertEquals(AlertConstants.LOGIN_ALERT.getAlertTitle(), "Success");
    }

    @Test
    public void loginAlertMessageShouldBeCorrect() {
        assertEquals(AlertConstants.LOGIN_ALERT.getAlertMessage(), "You are logged in!");
    }

    @Test
    public void signupAlertTitleShouldBeCorrect() {
        assertEquals(AlertConstants.SIGNUP_ALERT.getAlertTitle(), "Signed Up!");
    }

    @Test
    public void signupAlertMessageShouldBeCorrect() {
        assertEquals(AlertConstants.SIGNUP_ALERT.getAlertMessage(), "You successfully signed up!");
    }

    @Test
    public void allConstantsShouldBeNonNull() {
        for (AlertConstants constant : AlertConstants.values()) {
            assertNotNull(constant.getAlertTitle());
            assertNotNull(constant.getAlertMessage());
        }
    }
}
