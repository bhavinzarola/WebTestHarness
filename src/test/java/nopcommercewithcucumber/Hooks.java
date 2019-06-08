package nopcommercewithcucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

// This is hook class where I have declare Open browser and close browser method that executes before and after each test script

public class Hooks extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void driverSetup() {
        browserSelector.browserSelect();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
