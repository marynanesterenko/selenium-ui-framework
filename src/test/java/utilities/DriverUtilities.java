package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverUtilities {

    static WebDriver driver;

    public static void createDriver(){

        if (driver == null) {
            switch (ConfigReader.getConfigProperty("app.browser")) {
                // setting up the switch case based on the data in the config.properties
                // we have to have browsers installed on our PC, bc if we do not - this switch case will not work
                case "edge" -> {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
                case "safari" -> {
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                default -> {
                    // WebDriverManager essentially removes the need to manually manage any drivers
                    // (meaning to set property for each driver, download the .exe files)
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
            }
        }
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get(ConfigReader.getConfigProperty("app.baseurl"));
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
