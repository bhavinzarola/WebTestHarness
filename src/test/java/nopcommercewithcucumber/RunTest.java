package nopcommercewithcucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/*Given cucumber option file with selected tag name (i.e registration") given to acieve desire execution of the test script. with the help of "."
 operator it is easy to locate the file for selenium webdriver and selected pretty formate for the reporting structure*/
@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = " @registration", format = {"pretty", "html:target/cucumber-reports"})

public class RunTest {

}
