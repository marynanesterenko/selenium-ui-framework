package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilities.CommonMethods;
import utilities.ConfigReader;
import utilities.DriverUtilities;

public class Hooks {
    @Before
    //We are adding the cucumber scenario parameter which will hold the data for the scenario which is currently running
    public void setUp(Scenario scenario){
        // here are initializing the properties Object inside the ConfigReader Class we created
        ConfigReader.initializeProperties();
        DriverUtilities.createDriver(scenario);
    }

    @After
    public void tearDown(Scenario scenario){

        scenario.attach(CommonMethods.takeScreenshot(), "image/png", scenario.getName());
        CommonMethods.takeScreenshot();

        DriverUtilities.quitDriver(scenario);
    }
}
