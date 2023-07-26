package common.constant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static common.constant.DriverConstants.ANDROID;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 19/7/23
 * Time            : 12:13 pm
 * Description     :
 **/

public class CommonConstants {
    private final static Logger logger = LogManager.getLogger();
    public static final String MOBILE_PLATFORM_NAME = getPlatformName();
    public static final String EXECUTION_ENV_NAME = getEnvironmentName();

    private static String getEnvironmentName() {
        String environmentNameFromPomXml = System.getProperty("environment");
        String envName;

        if (environmentNameFromPomXml != null)
            envName = environmentNameFromPomXml;
        else {
            logger.warn("The Maven Profile is missing the environment configuration.");
            logger.warn("The default environment 'dev' will be enabled for this run.");
            envName = "dev";
        }

        return envName.toLowerCase();
    }

    private static String getPlatformName() {
        String platformNameFromPomXml = System.getProperty("platform");
        String platformName;

        if (platformNameFromPomXml != null)
            platformName = platformNameFromPomXml;
        else {
            logger.warn("The Maven Profile is missing the platform configuration.");
            logger.warn("The default platform '{}' will be enabled for this run.", ANDROID);
            platformName = ANDROID;
        }

        return platformName.toLowerCase();
    }
}
