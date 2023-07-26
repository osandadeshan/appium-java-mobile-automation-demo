package screen;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 6/15/2023
 * Time            : 3:01 PM
 * Description     :
 **/

public class LoginScreen extends BaseScreen {
    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    public LoginScreen tapOnSignUpContainer() {
        tap(MobileBy.AccessibilityId("button-sign-up-container"));
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
        inputText(MobileBy.AccessibilityId("input-email"), emailAddress);
    }

    private void inputPassword(String password) {
        inputText(MobileBy.AccessibilityId("input-password"), password);
    }

    private void inputConfirmPassword(String confirmPassword) {
        inputText(MobileBy.AccessibilityId("input-repeat-password"), confirmPassword);
    }

    private void tapOnLoginButton() {
        tap(MobileBy.AccessibilityId("button-LOGIN"));
    }

    private void tapOnSignUpButton() {
        tap(MobileBy.AccessibilityId("button-SIGN UP"));
    }
}
