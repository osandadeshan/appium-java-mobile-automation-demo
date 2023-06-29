package util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Project Name    : appium-page-object-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 24/6/23
 * Time            : 5:38 pm
 * Description     :
 **/

public class PropertyFileReader {
    public static String getPropertyValue(String filename, String propertyName) {
        String propertyValue = null;

        try (InputStream input = Files.newInputStream(Paths.get("./src/test/resources/" + filename))) {
            Properties prop = new Properties();
            prop.load(input);
            propertyValue = prop.getProperty(propertyName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return propertyValue;
    }
}
