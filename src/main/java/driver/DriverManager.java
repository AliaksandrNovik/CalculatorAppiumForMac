package driver;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    public enum DriverType{
        MAC_OS
    }

    DriverType driverType;

    public  RemoteWebDriver driver;

    private static DriverManager instance;

    private DriverManager(DriverType type) throws MalformedURLException {
        driverType = type;
        switch (type){
            case MAC_OS:
                driver = new RemoteWebDriver(new URL("http://localhost:4622/wd/hub"), Driver.getMacOsCaps());
                break;
            default:
                driver = new RemoteWebDriver(new URL("http://localhost:4622/wd/hub"), Driver.getMacOsCaps());
                break;
        }
    }


     public static DriverManager getInstance(DriverType type) throws MalformedURLException {
        if (instance == null) {
            instance = new DriverManager(type);
        }
        return instance;

    }
     public  RemoteWebDriver getDriver() {
        return driver;
    }
}
