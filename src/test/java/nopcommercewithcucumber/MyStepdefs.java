package nopcommercewithcucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nopcommercewithcucumber.PageObjectModel.*;
import org.openqa.selenium.By;
import org.testng.Assert;

/* This is stepdef class where I have implements the actions carried out when running feature file
I have called the action method with relevatn class name */
public class MyStepdefs extends Utils {
    RegistrationPage register = new RegistrationPage();
    HomePage homePage = new HomePage();
    RegisterResult registerResult = new RegisterResult();

    @Given("^user is on the registration page$")
    public void userIsOnTheRegistrationPage() {
    }

    @When("^user enter all the personal detail and click on Register button$")
    public void userEnterAllThePersonalDetailAndClickOnRegisterButton() {
        homePage.clickOnRegistrationButton();
        register.registration();
    }

    @Then("^user should be able to register successfully$")
    public void userShouldBeAbleToRegisterSuccessfully() {
        registerResult.yourRegistrationCompleted();
    }

}