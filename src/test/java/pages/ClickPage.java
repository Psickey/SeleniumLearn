package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickPage extends BasePage {

    @FindBy(css = "#badButton")
    private WebElement badButton;

    @FindBy(css = ".btn.btn-success")
    private WebElement greenButton;

    public ClickPage() {
        super();
        Click.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void clickBadButton(){
        badButton.click();
    }

    public Boolean greenButtonIsDisplayed(){
        return greenButton.isDisplayed();
    }
}
