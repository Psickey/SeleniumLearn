package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MouseOverPage extends BasePage {

    @FindBy(css = "a.text-warning")
    private WebElement clickLink;

    @FindBy(css = "a.text-primary")
    private WebElement clickMe;

    @FindBy(css = "#clickCount")
    private WebElement clickCount;

    public MouseOverPage(){
        super();
        MouseOver.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void mouseOverOnClickMe(){
        Actions action = new Actions(driver);
        action.moveToElement(clickMe).perform();
    }

    public Boolean clickLinkIsDisplayed(){
        return clickLink.isDisplayed();
    }

    public void clickOnLink(){
        clickLink.click();
    }

    public String getClickCount(){
        return clickCount.getText();
    }
}
