import com.maxsoft.testngtestresultsanalyzer.DriverHolder;
import com.maxsoft.testngtestresultsanalyzer.TestAnalyzeReportListener;
import common.ScreenProvider;
import common.UiComponentProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import util.driver.MobileDriverFactory;
import util.driver.MobileDriverService;

import static common.constant.CommonConstants.EXECUTION_ENV_NAME;
import static common.constant.CommonConstants.MOBILE_PLATFORM_NAME;
import static java.util.concurrent.TimeUnit.SECONDS;
import static util.driver.MobileDriverHolder.getDriver;
import static util.driver.MobileDriverHolder.setDriver;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 15/6/23
 * Time            : 3:57 pm
 * Description     :
 **/

@Listeners(TestAnalyzeReportListener.class)
public class BaseTest {
    private final MobileDriverService driverService = new MobileDriverFactory().getDriverService();
    private final Logger logger = LogManager.getLogger();

    @BeforeSuite
    public void oneTimeSetup() {
        logger.debug("Test execution platform: {}", MOBILE_PLATFORM_NAME);
        logger.debug("Test execution environment: {}", EXECUTION_ENV_NAME);
    }

    @BeforeMethod
    public void openApp() {
        driverService.spinUpDriver();
        setDriver(driverService.getDriver());
        DriverHolder.setDriver(getDriver());    // Setting the driver for the html-reporter library
        getDriver().manage().timeouts().implicitlyWait(30, SECONDS);
    }

    public ScreenProvider screen() {
        return new ScreenProvider(getDriver());
    }

    public UiComponentProvider uiComponent() {
        return new UiComponentProvider(getDriver());
    }

    @AfterMethod
    public void closeApp() {
        driverService.closeDriver();
    }
}
