package net.meetsky.page;

import net.meetsky.utilities.BrowserUtilities;
import net.meetsky.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPageBase {
    @FindBy(id = "user")
    protected WebElement loginUserNameOrEmailBox;

    @FindBy(id = "password")
    protected WebElement loginPasswordBox;

    @FindBy(id = "submit")
    protected WebElement loginSubmitBtn;


    public void login(){
        loginUserNameOrEmailBox.sendKeys(ConfigurationReader.getProperty("userUserNameInput"));
        loginPasswordBox.sendKeys(ConfigurationReader.getProperty("userPasswordInput"));
        loginSubmitBtn.click();
        BrowserUtilities.waitForPageToLoad(10);
    }

    public void login(String userNameInput, String passwordInput){
        loginUserNameOrEmailBox.sendKeys(userNameInput);
        loginPasswordBox.sendKeys(passwordInput);
        loginSubmitBtn.click();
        BrowserUtilities.waitForPageToLoad(10);
    }
}
