package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = BaseTest.getDriver();
        PageFactory.initElements(driver, this);
    }
}
