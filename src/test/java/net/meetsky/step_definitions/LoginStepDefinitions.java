package net.meetsky.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.meetsky.page.LoginPage;
import net.meetsky.utilities.ConfigurationReader;
import net.meetsky.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");
        String URL = ConfigurationReader.getProperty("qa1");
        driver.get(URL);
    }

    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String userNameInput, String passwordInput) {
       loginPage.login(userNameInput,passwordInput);
        System.out.println("Logging in");
    }

    @Then("user should verify that title is {string}")
    public void user_should_verify_that_title_is(String string) {
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }

    @Then("user should be able to navigate to {string}")
    public void user_should_be_able_to_navigate_to(String string) {
        WebElement moduleName = driver.findElement(By.xpath("//*[@id='appmenu']/li[@data-id='"+string+"']"));

        moduleName.click();
    }

    @Then("user should very that title is {string}")
    public void user_should_very_that_title_is(String string) {
        Assert.assertEquals(string, driver.getTitle());
    }

}
