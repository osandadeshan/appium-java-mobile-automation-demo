package screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : appium-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 6/15/2023
 * Time            : 3:01 PM
 * Description     :
 **/

public class LoginScreen extends BaseScreen {
    private final By signUpContainer = MobileBy.AccessibilityId("button-sign-up-container");
    private final By emailAddressTextBox = MobileBy.AccessibilityId("input-email");
    private final By passwordTextBox = MobileBy.AccessibilityId("input-password");
    private final By confirmPasswordTextBox = MobileBy.AccessibilityId("input-repeat-password");
    private final By signupButton = MobileBy.AccessibilityId("button-SIGN UP");
    private final By loginButton = MobileBy.AccessibilityId("button-LOGIN");

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    public LoginScreen tapOnSignUpContainer() {
        tap(signUpContainer);
        return this;
    }

    public void login(String emailAddress, String password) {
        inputEmailAddress(emailAddress);
        inputPassword(password);
        tapOnLoginButton();
    }

    public void signUp(String emailAddress, String password, String confirmPassword) {
        inputEmailAddress(emailAddress);
        inputPassword(password);
        inputConfirmPassword(confirmPassword);
        tapOnSignUpButton();
    }

    private void inputEmailAddress(String emailAddress) {
        inputText(emailAddressTextBox, emailAddress);
    }

    private void inputPassword(String password) {
        inputText(passwordTextBox, password);
    }

    private void inputConfirmPassword(String confirmPassword) {
        inputText(confirmPasswordTextBox, confirmPassword);
    }

    private void tapOnLoginButton() {
        tap(loginButton);
    }

    private void tapOnSignUpButton() {
        tap(signupButton);
    }
}
