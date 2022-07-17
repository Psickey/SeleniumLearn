package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextInputPage extends BasePage {

    @FindBy(css = "#newButtonName")
    private WebElement inputField;

    @FindBy(css = "#updatingButton")
    private WebElement button;

    public TextInputPage(){
        super();
        TextInput.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public String getButtonText() {
        return button.getText();
    }

    public void inputText(String text) {
        inputField.sendKeys(text);
        button.click();
        inputField.clear();
    }
}
