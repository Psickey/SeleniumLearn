package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClassAttributePage extends BasePage {

    @FindBy(xpath = "//button[contains(@class, 'btn-primary')]")
    private WebElement blueBtn;

    @FindBy(xpath = "//button[contains(@class, 'btn-warning')]")
    private WebElement yellowBtn;

    @FindBy(xpath = "//button[contains(@class, 'btn-success')]")
    private WebElement greenBtn;

    public ClassAttributePage(){
        super();
        ClassAttr.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void acceptAllert(){
        driver.switchTo().alert().accept();
    }

    public void clickPrimaryBtn(){
        blueBtn.click();
    }

    public void clickWarningBtn(){
        yellowBtn.click();
    }

    public void clickSuccessBtn(){
        greenBtn.click();
    }
}
