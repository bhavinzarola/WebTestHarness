package nopcommercewithcucumber.PageObjectModel;

import nopcommercewithcucumber.Utils;
import org.openqa.selenium.By;

public class RegisterResult extends Utils {

    private By _registrationSuccessfulMessage = By.xpath("//div[contains(text(),'Your registration completed')]");


    // I wrote post action  TestNG ssertion reusable method that I have created in Utils class (Expected result, Actual result , Error message to display when test fails)
    public void yourRegistrationCompleted() {
        assertByGetText("Your registration completed", _registrationSuccessfulMessage, "Sorry your registration is not successful");
    }
}
