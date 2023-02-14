package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverUtilities {

    static WebDriver driver;

    public static void createDriver(){
        // WebDriverManager essentially removes the need to manually manage any drivers
        // (meaning to set property for each driver, download the .exe files)
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get(ConfigReader.getConfigProperty("app.baseurl"));
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
