package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoadDelayPage extends BasePage {

    @FindBy(css = ".btn.btn-primary")
    private WebElement button;

    public LoadDelayPage() {
        super();
        LoadDelay.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public void WaitForData() {
        wait.until(ExpectedConditions.visibilityOf(button));
    }

    public void clickOnButton(){
        WaitForData();
        button.click();
    }

    public String getButtonText(){
        return button.getText();
    }

}
