package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ClickPage;

public class ClickTest extends BaseTest {


    @Test
    public void makeClick(){
        ClickPage clickPage = new ClickPage();
        clickPage.clickBadButton();
        Assert.assertTrue(clickPage.greenButtonIsDisplayed(), "Bad button was clicked");
    }
}
