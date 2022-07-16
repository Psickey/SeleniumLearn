package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyTextPage extends BasePage {

    @FindBy(xpath = "//div/span[contains(text(),'Welcome')]")
    private WebElement text;

    public VerifyTextPage(){
        super();
        VerifyText.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public String getWelcomeText(){
        return text.getText().split(" ")[0];
    }
}
