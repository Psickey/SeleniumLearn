package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VIsibilityPage;

public class VisibilityTest extends BaseTest {

    @Test
    public void checkVisibilityOfButtons(){
        VIsibilityPage vIsibilityPage = new VIsibilityPage();
        vIsibilityPage.clickOnHide();
        Assert.assertTrue(vIsibilityPage.hideBtnIsVisible(), "Hide button is visible");
        Assert.assertFalse(vIsibilityPage.rmBtnIsVisible(), "Remove button is not visible");
        Assert.assertFalse(vIsibilityPage.opacityBtnIsVisible(), "Opacity button is not visible");
        Assert.assertFalse(vIsibilityPage.invisBtnIsVisible(), "Visibility button is not visible");
        Assert.assertFalse(vIsibilityPage.zeroBtnIsVisible(), "Zero width button is not visible");
        Assert.assertFalse(vIsibilityPage.displayBtnIsVisible(), "Display button is not visible");
        Assert.assertFalse(vIsibilityPage.overpalBtnIsVisible(), "Overlapped button is not visible");
        Assert.assertFalse(vIsibilityPage.offscreenBtnIsVisible(), "Offscreen button is not visible");
    }
}
