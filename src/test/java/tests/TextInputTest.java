package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TextInputPage;

public class TextInputTest extends BaseTest {

    private TextInputPage textInputPage;

    @BeforeClass
    public void loadPage(){
        textInputPage = new TextInputPage();
    }

    @Test
    public void inputValidText(){
        String textToInput = "Mega";
        Assert.assertEquals(textInputPage.getButtonText(),
                "Button That Should Change it's Name Based on Input Value",
                "Default value of button on loaded page");
        textInputPage.inputText(textToInput);
        Assert.assertEquals(textInputPage.getButtonText(), textToInput, "Input and button text is correct");

        textToInput = "Gena and Lena";
        textInputPage.inputText(textToInput);
        Assert.assertEquals(textInputPage.getButtonText(), textToInput, "Input and button text is correct");

        textToInput = "    ";
        textInputPage.inputText(textToInput);
        Assert.assertEquals(textInputPage.getButtonText(), "", "Input and button text is correct");

        textToInput = "123455";
        textInputPage.inputText(textToInput);
        Assert.assertEquals(textInputPage.getButtonText(), textToInput, "Input and button text is correct");
    }

    @Test
    public void inputEmptyText(){
        String textToInput = "";
        Assert.assertEquals(textInputPage.getButtonText(),
                "Button That Should Change it's Name Based on Input Value",
                "Default value of button on loaded page");
        textInputPage.inputText(textToInput);

        textInputPage.inputText(textToInput);
        Assert.assertEquals(textInputPage.getButtonText(),
                "Button That Should Change it's Name Based on Input Value",
                "Text is not changed. Button has default value");
    }
}
