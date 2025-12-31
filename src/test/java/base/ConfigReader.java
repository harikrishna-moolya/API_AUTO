/*
package base;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}
*/
package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    public static String get(String key) {
        if (prop == null) {
            prop = new Properties();
            try {
                FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
                prop.load(fis);
            } catch (IOException e) {
                throw new RuntimeException("❌ Unable to load config.properties file");
            }
        }
        return prop.getProperty(key);
    }
}
