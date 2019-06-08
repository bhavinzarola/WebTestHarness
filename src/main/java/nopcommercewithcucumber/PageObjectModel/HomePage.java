package nopcommercewithcucumber.PageObjectModel;

import nopcommercewithcucumber.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils {
    //  all the element access has been restricted to class only with private keyword
    private By registrationButton = By.linkText("Register");
    private By yourPersonalDetail = By.xpath("//strong[contains(text(),'Your Personal Details')]");

    public void clickOnRegistrationButton() {
        //Click on Register Button
        clickOnElement(registrationButton);
        assertByGetText("Your Personal Details", yourPersonalDetail, "You are not on Registration Page");
    }
}
