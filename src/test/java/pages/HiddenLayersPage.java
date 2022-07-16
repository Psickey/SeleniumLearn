package pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HiddenLayersPage extends BasePage {

    @FindBy(css = "#greenButton")
    private WebElement greenBtn;

    @FindBy(css = "#blueButton")
    private WebElement blueBtn;

    public HiddenLayersPage(){
        super();
        HiddenLayers.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }


    public Boolean tryClickGreen(){
        boolean clickable = true;
        try {
            greenBtn.click();
        }
        catch (ElementClickInterceptedException exp){
            exp.getMessage();
            clickable = false;
        }
        return clickable;
    }

    public Boolean greenIsDisplayed(){
        return greenBtn.isDisplayed();
    }

    public Boolean greenIsEnabled(){
        return greenBtn.isEnabled();
    }

    public Boolean blueIsDisplayed(){
        return blueBtn.isDisplayed();
    }
}
