package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CommonMethods {

    public static byte [] takeScreenshot() {
        // TakeScreenshot Interface is implemented in the same way as the JSExecutor
        TakesScreenshot takesScreenshot = (TakesScreenshot) DriverUtilities.getDriver();
        byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);

        return screenshot;
    }
}
