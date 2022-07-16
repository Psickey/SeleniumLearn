package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MouseOverPage;

public class MouseOverTest extends BaseTest {

    @Test
    public void mouseOverToClicMe(){
        MouseOverPage mouseOverPage = new MouseOverPage();
        mouseOverPage.mouseOverOnClickMe();
        Assert.assertTrue(mouseOverPage.clickLinkIsDisplayed(), "Mouse is on Click Me link");
        mouseOverPage.clickOnLink();
        mouseOverPage.clickOnLink();
        Assert.assertEquals(mouseOverPage.getClickCount(), "2", "Clicked on link two times");
    }
}
