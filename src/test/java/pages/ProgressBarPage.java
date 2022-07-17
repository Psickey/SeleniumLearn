package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBarPage extends BasePage {

    @FindBy(css = "#startButton")
    private WebElement startButton;

    @FindBy(css = "#stopButton")
    private WebElement stopButton;

    @FindBy(css = "#progressBar")
    private WebElement progressBar;

    @FindBy(css = "#result")
    private WebElement result;

    public ProgressBarPage(){
        super();
        ProgressBar.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public void clickStart() {
        startButton.click();
    }

    public void clickStopWhenReach(String value) {
        while (true){
            if (progressBar.getAttribute("aria-valuenow").equals(value)){
                stopButton.click();
                break;
            }
        }
    }

    public Integer getResultValue() {
        Integer value;
        String valueFromResultLine = result.getText().split(" ")[1];
        valueFromResultLine = valueFromResultLine.substring(0, valueFromResultLine.length()-1);
        value = Integer.parseInt(valueFromResultLine);
        return value;
    }

    public int getProgressBarValue() {
        return Integer.parseInt(progressBar.getAttribute("aria-valuenow"));
    }
}
