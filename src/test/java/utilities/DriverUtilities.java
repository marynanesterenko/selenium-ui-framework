package utilities;

import io.cucumber.java.Scenario;
import io.cucumber.java.et.Ja;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.URL;
import java.time.Duration;

public class DriverUtilities {

    static WebDriver driver;

    public static void createDriver(Scenario scenario){
        // our PC is local host, SauceLabs - is a remote host
        // set up an if st to determine what app.host is
        if(ConfigReader.getConfigProperty("app.host").equalsIgnoreCase("local.host")) {
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
        // else if the value of the app.host is SauceLabs, we are setting up a remote driver to run test on SauceLabs
        } else if (ConfigReader.getConfigProperty("app.host").equalsIgnoreCase("saucelabs")){
            // capabilities - options we can pass to our driver
            // we created this Obj to save our username
            MutableCapabilities sauceOptions = new MutableCapabilities();
            sauceOptions.setCapability("username", ConfigReader.getConfigProperty("sauce.username"));
            sauceOptions.setCapability("accessKey", ConfigReader.getConfigProperty("sauce.accessKey"));

            MutableCapabilities capabilities = new MutableCapabilities();
            capabilities.setCapability("browserName", ConfigReader.getConfigProperty("sauce.browserName"));
            capabilities.setCapability("browserVersion", ConfigReader.getConfigProperty("sauce.browserVersion"));
            capabilities.setCapability("platformName", ConfigReader.getConfigProperty("sauce.platformName"));
            capabilities.setCapability("sauce:options", sauceOptions);

            try {
                // here we are initializing the WebDriver to a Remote driver and passing the URL to the Selenium Grid hub
            driver = new RemoteWebDriver(new URL(ConfigReader.getConfigProperty("sauce.urlWest")), capabilities);
                ((JavascriptExecutor)driver).executeScript("sauce:job-name=" + scenario.getName());
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(ConfigReader.getConfigProperty("app.baseurl"));
    }

    public static void quitDriver(Scenario scenario){
        if (ConfigReader.getConfigProperty("app.host").equalsIgnoreCase("saucelabs")){
            // ((JavascriptExecutor)driver).executeScript("sauce:job-result=" + (scenario.isFailed() ? "failed" : "passed"));
            // Condition ? True : false
            if (scenario.isFailed()){
                ((JavascriptExecutor)driver).executeScript("sauce:job-result=failed");
            } else {
                ((JavascriptExecutor)driver).executeScript("sauce:job-result=passed");
            }
        }

        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
