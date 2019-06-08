package nopcommercewithcucumber.PageObjectModel;

import nopcommercewithcucumber.LoadProperty;
import nopcommercewithcucumber.Utils;
import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

   // Elements related to registration page

    private By genderMale = By.id("gender-male");
    private By firstNameField = By.cssSelector("input#FirstName");
    private By lastNameField = By.id("LastName");
    private By dateOfBirthDayField = By.name("DateOfBirthDay");
    private By dateOfBirthMonthField = By.name("DateOfBirthMonth");
    private By daOfBirthYearField = By.name("DateOfBirthYear");
    private By emailAddressField = By.id("Email");
    private By companyNameField = By.id("Company");
    private By newsletterBox = By.id("Newsletter");
    private By passwordField = By.id("Password");
    private By passwordConfirmationField = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");

    // Method

    public void registration() {

        //Click on gender
        clickOnElement(genderMale);

        //Click on First Name
        enterText(firstNameField, loadProperty.getProperty("firstName"));
        enterText(firstNameField, loadProperty.getProperty("firstName"));

        //Click on Last Name
        enterText(lastNameField, loadProperty.getProperty("lastName"));

        //Input Date of Birth Day by using Text
        selectText(dateOfBirthDayField, loadProperty.getProperty("dateOfBirthDay"));

        //Input Date of Birth Month by using Index
        selectIndex(dateOfBirthMonthField, Integer.parseInt(loadProperty.getProperty("dateOfBirthMonth")));

        //Input Date of Birth Year
        selectValue(daOfBirthYearField, loadProperty.getProperty("dateOfBirthYear"));

        //Entering email id in the email field
        enterText(emailAddressField, loadProperty.getProperty("emailAddress") + dateStamp() + "@yahoo.com");

        //Enter Company name
        enterText(companyNameField, loadProperty.getProperty("companyName"));

        //For Options - Click on Newsletters box
        clickOnElement(newsletterBox);

        //Declaring variable for password
        String password = "test123";

        //Entering Password in Password field
        enterText(passwordField, loadProperty.getProperty("password"));

        //Confirming Password
        enterText(passwordConfirmationField, loadProperty.getProperty("password"));

        //Click on Registration Button
        clickOnElement(registerButton);
    }
}