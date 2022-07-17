package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverlappedElementPage extends BasePage {

    @FindBy(css = "#id")
    private WebElement idField;

    @FindBy(css = "#name")
    private WebElement nameField;

    public OverlappedElementPage(){
        super();
        OverlappedElement.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void inputId(String id){
        idField.sendKeys(id);
    }

    public void inputName(String name){
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", nameField);
        nameField.sendKeys(name);
    }

    public String getNameValue(){
        return nameField.getAttribute("value");
    }

}
