package nopcommercewithcucumber;

import org.openqa.selenium.WebDriver;

// I have initialise the driver in basepage and will inheritate to another class with  help of extend keyword so I dont need to initialise driver all the time.
public class BasePage {
    protected static WebDriver driver;
    protected static LoadProperty loadProperty = new LoadProperty();

}
