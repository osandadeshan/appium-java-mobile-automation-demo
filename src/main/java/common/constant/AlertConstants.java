package common.constant;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 22/6/23
 * Time            : 11:14 pm
 * Description     :
 **/

public enum AlertConstants {
    LOGIN_ALERT("Success", "You are logged in!"),
    SIGNUP_ALERT("Signed Up!", "You successfully signed up!");

    private final String alertTitle, alertMessage;

    AlertConstants(String alertTitle, String alertMessage) {
        this.alertTitle = alertTitle;
        this.alertMessage = alertMessage;
    }

    public String getAlertTitle() {
        return alertTitle;
    }

    public String getAlertMessage() {
        return alertMessage;
    }
}
