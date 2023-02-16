package utilities;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
    // Properties class is created to handle properties files (config.properties)
    public static Properties properties;

    public static void initializeProperties(){

        try {
            // we have created the Object of the FileReader Class from java.io
            // we could have also done it in the following way: FileInputStream inputStream = new FileInputStream(path);
            // it throws an exception which is why we have it surrounded in a try catch block
            FileReader fileReader = new FileReader("src/test/resources/config.properties");

            // initializing the Properties Object by storing it's reference in the "properties" variable
            properties = new Properties();

            // here we are using the .load(fileReader) method and passing the file reader to the Object of the Properties Class
            // in other words, we are loading our file in a "properties" variable
            properties.load(fileReader);
        } catch (Exception e){
            // here we are just printing the exception stack trace if there is one caught
            e.printStackTrace();
        }
    }

    public static String getConfigProperty(String key) {
        return properties.getProperty(key);
    }
}
