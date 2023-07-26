package screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 14/6/23
 * Time            : 2:15 pm
 * Description     :
 **/

public class BaseScreen {
    public final WebDriver driver;
    public final WebDriverWait wait;

    public BaseScreen(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void waitUntilElementVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void tap(By by) {
        waitUntilElementVisible(by);
        driver.findElement(by).click();
    }

    public void inputText(By by, String text) {
        waitUntilElementVisible(by);
        driver.findElement(by).sendKeys(text);
    }
}
