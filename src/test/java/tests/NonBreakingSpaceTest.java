package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NonBreakingSpacePage;

public class NonBreakingSpaceTest extends BaseTest {

    @Test
    public void findButton(){
        NonBreakingSpacePage nonBreakingSpacePage = new NonBreakingSpacePage();
        Assert.assertTrue(nonBreakingSpacePage.buttonIsDisplayed(), "Button is on page");
        nonBreakingSpacePage.clickButton();
    }
}
