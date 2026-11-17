
package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop = new Properties();

    static {
        try {
            prop.load(
                    ConfigReader.class
                            .getClassLoader()
                            .getResourceAsStream("config.properties")
            );
        } catch (Exception e) {
            throw new RuntimeException(
                    "Unable to load config.properties", e
            );
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
