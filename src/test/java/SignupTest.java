import org.testng.annotations.Test;

import static common.constant.AlertConstants.SIGNUP_ALERT;
import static common.constant.LoginConstants.PASSWORD;
import static net.andreinc.mockneat.unit.user.Emails.emails;
import static org.testng.Assert.assertEquals;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 22/6/23
 * Time            : 10:58 pm
 * Description     :
 **/

public class SignupTest extends BaseTest {
    @Test(description = "Verify that a user can login to the application with valid credentials")
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
