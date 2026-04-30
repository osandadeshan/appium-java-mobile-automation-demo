package com.appium.example.unit;

import com.appium.example.util.PropertyReader;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertFalse;

public class PropertyReaderTest {

    @Test
    public void appiumServerIpShouldBePresentInConfig() {
        String value = PropertyReader.getAppiumConfig("appium_server_ip");
        assertNotNull(value, "appium_server_ip must be configured");
        assertFalse(value.isBlank(), "appium_server_ip must not be blank");
    }

    @Test
    public void appiumServerPortShouldBePresentInConfig() {
        String value = PropertyReader.getAppiumConfig("appium_server_port");
        assertNotNull(value, "appium_server_port must be configured");
        assertFalse(value.isBlank(), "appium_server_port must not be blank");
    }

    @Test
    public void reporterDocumentTitleShouldBePresentInConfig() {
        String value = PropertyReader.getReporterConfig("extent_document_title");
        assertNotNull(value, "extent_document_title must be configured");
    }

    @Test
    public void environmentConfigForDevShouldBeReadable() {
        // Default env is 'dev' when no system property is set
        System.setProperty("environment", "dev");
        System.setProperty("platform", "android");
        String emailAddress = PropertyReader.getEnvironmentConfig("email_address");
        assertNotNull(emailAddress, "email_address for dev environment must be configured");
    }
}
