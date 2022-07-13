package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VIsibilityPage extends BasePage {

    @FindBy(css = "#hideButton")
    private WebElement hideBtn;

    @FindBy(css = "#transparentButton")
    private WebElement opacityBtn;

    @FindBy(css = "#removedButton")
    private List<WebElement> rmBtn;

    @FindBy(css = "#invisibleButton")
    private WebElement invisBtn;

    @FindBy(css = "#zeroWidthButton")
    private WebElement zeroWidthBtn;

    @FindBy(css = "#notdisplayedButton")
    private WebElement notDisBtn;

    @FindBy(css = "#overlappedButton")
    private WebElement overlapBtn;

    @FindBy(css = "#offscreenButton")
    private WebElement offscreenBtn;

    @FindBy(css = "#hidingLayer")
    private List<WebElement> hidingLay;

    public VIsibilityPage() {
        super();
        Visibility.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void clickOnHide(){
        hideBtn.click();
    }

    public Boolean hideBtnIsVisible(){
        return hideBtn.isDisplayed();
    }

    public Boolean opacityBtnIsVisible(){
        return opacityBtn.isDisplayed();
    }

    public Boolean rmBtnIsVisible(){
        if (rmBtn.isEmpty()){
            return false;
        }
        else
            return rmBtn.get(0).isDisplayed();
    }

    public Boolean invisBtnIsVisible(){
        return invisBtn.isDisplayed();
    }

    public Boolean zeroBtnIsVisible(){
        return zeroWidthBtn.isDisplayed();
    }

    public Boolean displayBtnIsVisible(){
        return notDisBtn.isDisplayed();
    }

    public Boolean overpalBtnIsVisible(){
        if (hidingLay.isEmpty()){
            return true;
        }
        else
            return false;
    }

    public Boolean offscreenBtnIsVisible(){
        return offscreenBtn.isDisplayed();
    }
}
