package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ScrollbarsPage;

public class ScrollbarsTest extends BaseTest {

    @Test
    public void scrollToHidingBtnAndClick(){
        ScrollbarsPage scrollbarsPage = new ScrollbarsPage();
        scrollbarsPage.scrollToBtn();
        Assert.assertTrue(scrollbarsPage.hidinBtnIsVisible());
    }
}
