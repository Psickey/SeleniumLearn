package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DynamicTablePage extends BasePage {

    @FindBy(xpath = "//div/span[@role='cell'][contains(text(), 'Chrome')]/following::span")
    private List<WebElement> chromeRow;

    @FindBy(css = "p.bg-warning")
    private WebElement resultLine;

    public DynamicTablePage(){
        super();
        DynamicTable.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public String getDataFromCell(){
        for (WebElement element : chromeRow){
            if (element.getText().endsWith("%"))
                return element.getText();
        }
        return "Not found";
    }

    public String getDataFromResult(){
        String[] result = resultLine.getText().split(" ");
        return result[2];
    }
}
