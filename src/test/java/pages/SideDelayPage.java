package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SideDelayPage extends BasePage {

    @FindBy(css = "#ajaxButton")
    private WebElement ajaxBtn;

    @FindBy(css = "#spinner")
    private WebElement spinner;

    @FindBy(css = "div > p.bg-success")
    private WebElement successLine;

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public SideDelayPage(){
        super();
        SideDelay.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void clickOnAjaxBtn(){
        ajaxBtn.click();
    }

    public void WaitForData() {
        wait.until(ExpectedConditions.visibilityOf(successLine));
    }

    public boolean SpinnerIsDisplayed() {
        if (spinner.isDisplayed())
            return true;
        else
            return false;
    }

    public boolean LineIsDisplayed() {
        return successLine.isDisplayed();
    }

    public String getSuccessTest(){
        return successLine.getText();
    }
}
