package net.meetsky.page;

import net.meetsky.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,25);



    public AbstractPageBase(){
        PageFactory.initElements(driver,this);
    }

}
