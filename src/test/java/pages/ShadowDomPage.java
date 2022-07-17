package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class ShadowDomPage extends BasePage {

    private WebElement shadowHost = driver.findElement(By.cssSelector("div guid-generator"));
    private SearchContext shadowRoot = shadowHost.getShadowRoot();

    private WebElement editField = shadowRoot.findElement(By.cssSelector("#editField"));

    private WebElement generateBtn = shadowRoot.findElement(By.cssSelector("#buttonGenerate"));

    private WebElement copyBtn = shadowRoot.findElement(By.cssSelector("#buttonCopy"));

    public ShadowDomPage(){
        super();
        ShadowDom.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void generateAndCopy(){
        generateBtn.click();
        editField.getAttribute("value");
        copyBtn.click();
    }

    public String getGeneratedValue(){
        return editField.getAttribute("value");
    }

    public String getClipboardValue() {
        String copiedValue = "";
        try{
            copiedValue = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        }
        catch (IOException | UnsupportedFlavorException exception){
            System.out.println(exception.getMessage());
        }
        return copiedValue;
    }
}
