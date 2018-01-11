package driver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class Driver {

    public static RemoteWebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public static void setUpDriver() throws MalformedURLException {
        driver = DriverManager.getInstance(DriverManager.DriverType.MAC_OS).getDriver();
    }


    @AfterSuite(alwaysRun = true)
    public static void closeDriver() throws MalformedURLException {
        DriverManager.getInstance(DriverManager.DriverType.MAC_OS).getDriver().quit();
    }

    public static DesiredCapabilities getMacOsCaps() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", "Mac");
        caps.setCapability("commandDelay", "50");
        caps.setCapability("loopDelay", "1000");
        caps.setCapability("implicitTimeout", "utilities.defaultImplicitTimeout_sec * 1000");
        caps.setCapability("mouseMoveSpeed", "50");
        caps.setCapability("screenShotOnError", "1");
        return caps;
    }

}
