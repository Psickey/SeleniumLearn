package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = BaseTest.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Dynamic ID")
    protected WebElement DynamicID;

    @FindBy(linkText = "AJAX Data")
    protected WebElement AjaxData;

    @FindBy(linkText = "Scrollbars")
    protected WebElement Scrollbars;

    @FindBy(linkText = "Visibility")
    protected WebElement Visibility;

    @FindBy(linkText = "Class Attribute")
    protected WebElement ClassAttr;
}
