package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.NonBreakingSpaceTest;

public class NonBreakingSpacePage extends BasePage {

    @FindBy(xpath = "//button[text()='My\u00A0Button']")
    private WebElement button;

    public NonBreakingSpacePage(){
        super();
        NonBreakingSpace.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void clickButton(){
        button.click();
    }

    public Boolean buttonIsDisplayed(){
        return button.isDisplayed();
    }
}
