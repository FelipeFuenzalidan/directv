package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFile;

    static {

        try {
            String path = System.getProperty("user.dir")+"/src/test/resources/serenity.properties";
            FileInputStream input = new FileInputStream(path);
            configFile = new Properties();
            configFile.load(input);
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyName) {
        return configFile.getProperty(keyName);
    }

}
