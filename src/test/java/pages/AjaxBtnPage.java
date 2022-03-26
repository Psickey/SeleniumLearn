package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AjaxBtnPage extends BasePage {

    @FindBy(id = "ajaxButton")
    private WebElement ajaxBtn;

    @FindBy(id = "spinner")
    private WebElement spinner;

    @FindBy(className = "bg-success")
    private WebElement textData;

    public AjaxBtnPage() {
        super();
        AjaxData.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public void WaitForData() {
        wait.until(ExpectedConditions.visibilityOf(textData));
    }

    public void BtnClick() {
        ajaxBtn.click();
    }

    public boolean SpinnerIsDisplayed() {
        if (spinner.isDisplayed())
            return true;
        else
            return false;
    }

    public boolean DataIsDisplayed() {
        if (textData.isDisplayed()){
            textData.click();
            textData.click();
            return true;
        }
        else
            return false;
    }

}
