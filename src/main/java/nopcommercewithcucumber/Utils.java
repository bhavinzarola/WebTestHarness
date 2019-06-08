package nopcommercewithcucumber;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;

//In this class I have declare all the reusable methods which I have used in whole page object

public class Utils extends BasePage {

    //Reusable method for click
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //Reusable method for Enter text with SendKey
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Reusable method for time stamp

    public static String dateStamp() {

        DateFormat dateFormat = new SimpleDateFormat("DDMMYYYYSSmmHH");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;
    }

    //Reusable Method For assert
    public static void assertByGetText(String expectedResult, By by, String errorMessage) {
        Assert.assertEquals(expectedResult, driver.findElement(by).getText(), errorMessage);
    }


    // drop down selection  by visible text
    public static void selectText(By by, String text) {

        new Select(driver.findElement(by)).selectByVisibleText(text);
    }

    // Drop down selection by value
    public static void selectValue(By by, String value) {

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    // Drop down selection by index number
    public static void selectIndex(By by, int indexNumber) {
        new Select(driver.findElement(by)).selectByIndex(indexNumber);

    }

    //Wait for element visible for given time in second
    public static void waitForElementVisible(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //wait for element to be invisible
    public static void waitForElementInvisible(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    // get selected value from dropdown
    public static String selectValueFromDropDown(By by) {
        driver.findElement(by).isDisplayed();
        Select dropBox = new Select(driver.findElement(by));
        return dropBox.getFirstSelectedOption().getText();
    }
}
