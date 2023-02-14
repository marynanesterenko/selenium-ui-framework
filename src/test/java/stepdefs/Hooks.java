package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utilities.ConfigReader;
import utilities.DriverUtilities;

public class Hooks {
    @Before
    public void setUp(){
        // here are initializing the properties Object inside the ConfigReader Class we created
        ConfigReader.initializeProperties();

        DriverUtilities.createDriver();
    }

    @After
    public void tearDown(){
        DriverUtilities.getDriver().quit();
    }
}
