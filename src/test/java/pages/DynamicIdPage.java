package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicIdPage extends BasePage {

    @FindBy(css = "section div button")
    private WebElement BtnWithDynId;

    public DynamicIdPage() {
        super();
        DynamicID.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void FindClickRefresh() {
        BtnWithDynId.click();
        driver.navigate().refresh();
    }
}
