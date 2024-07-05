package com.appium.example.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class LoginScreen extends BaseScreen {
    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    public void login(String emailAddress, String password) {
        inputEmailAddress(emailAddress);
        inputPassword(password);
        tapOnLoginButton();
    }

    public LoginScreen tapOnSignUpContainer() {
        tap(AppiumBy.accessibilityId("button-sign-up-container"));
        return this;
    }

    public void signUp(String emailAddress, String password, String confirmPassword) {
        inputEmailAddress(emailAddress);
        inputPassword(password);
        inputConfirmPassword(confirmPassword);
        tapOnSignUpButton();
    }

    private void inputEmailAddress(String emailAddress) {
        inputText(AppiumBy.accessibilityId("input-email"), emailAddress);
    }

    private void inputPassword(String password) {
        inputText(AppiumBy.accessibilityId("input-password"), password);
    }

    private void inputConfirmPassword(String confirmPassword) {
        inputText(AppiumBy.accessibilityId("input-repeat-password"), confirmPassword);
    }

    private void tapOnLoginButton() {
        tap(AppiumBy.accessibilityId("button-LOGIN"));
    }

    private void tapOnSignUpButton() {
        tap(AppiumBy.accessibilityId("button-SIGN UP"));
    }
}
