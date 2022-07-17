package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoadDelayPage;

public class LoadDelayTest extends BaseTest {

    @Test
    public void delayOnLoad(){
        LoadDelayPage loadDelayPage = new LoadDelayPage();
        loadDelayPage.clickOnButton();
        Assert.assertEquals(loadDelayPage.getButtonText(), "Button Appearing After Delay", "Page is loaded with button");
    }
}
