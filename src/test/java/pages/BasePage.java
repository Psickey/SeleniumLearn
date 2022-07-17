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

    @FindBy(linkText = "Client Side Delay")
    protected WebElement SideDelay;

    @FindBy(linkText = "Dynamic Table")
    protected WebElement DynamicTable;

    @FindBy(linkText = "Sample App")
    protected WebElement SampleApp;

    @FindBy(linkText = "Hidden Layers")
    protected WebElement HiddenLayers;

    @FindBy(linkText = "Click")
    protected WebElement Click;

    @FindBy(linkText = "Verify Text")
    protected WebElement VerifyText;

    @FindBy(linkText = "Mouse Over")
    protected WebElement MouseOver;

    @FindBy(linkText = "Load Delay")
    protected WebElement LoadDelay;

    @FindBy(linkText = "Text Input")
    protected WebElement TextInput;

    @FindBy(linkText = "Progress Bar")
    protected WebElement ProgressBar;

    @FindBy(linkText = "Non-Breaking Space")
    protected WebElement NonBreakingSpace;

    @FindBy(linkText = "Overlapped Element")
    protected WebElement OverlappedElement;

    @FindBy(linkText = "Shadow DOM")
    protected WebElement ShadowDom;
}
