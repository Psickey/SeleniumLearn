package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollbarsPage extends BasePage{

    @FindBy(css = "#hidingButton")
    private WebElement hidingBtn;

    public ScrollbarsPage(){
        super();
        Scrollbars.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void clickBtn(){
        hidingBtn.click();
    }

    public Boolean hidinBtnIsVisible(){
        return hidingBtn.isDisplayed();
    }

    public void scrollToBtn(){
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", hidingBtn);
        hidingBtn.click();
    }
}
