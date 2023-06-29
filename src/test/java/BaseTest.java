import com.maxsoft.testngtestresultsanalyzer.TestAnalyzeReportListener;
import common.ScreenProvider;
import common.UiComponentProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import util.driver.MobileDriverFactory;
import util.driver.MobileDriverHolder;
import util.driver.MobileDriverService;

import static com.maxsoft.testngtestresultsanalyzer.DriverHolder.getDriver;
import static com.maxsoft.testngtestresultsanalyzer.DriverHolder.setDriver;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Project Name    : appium-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 15/6/23
 * Time            : 3:57 pm
 * Description     :
 **/

@Listeners(TestAnalyzeReportListener.class)
public class BaseTest {
    private final MobileDriverFactory driverFactory = new MobileDriverFactory();
    private final MobileDriverService driverService = driverFactory.getDriverService();

    @BeforeMethod
    public void setUp() {
        driverService.spinUpDriver();
        MobileDriverHolder.setDriver(driverService.getDriver());
        setDriver(MobileDriverHolder.getDriver());
        MobileDriverHolder.getDriver().manage().timeouts().implicitlyWait(30, SECONDS);
    }

    public ScreenProvider screen() {
        return new ScreenProvider(getDriver());
    }

    public UiComponentProvider uiComponent() {
        return new UiComponentProvider(getDriver());
    }

    @AfterMethod
    public void tearDown() {
        driverService.closeDriver();
    }
}
