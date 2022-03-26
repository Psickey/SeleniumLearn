package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AjaxBtnPage;


public class AjaxDataTest extends BaseTest {

    @Test
    public void WaitForData() {
        AjaxBtnPage ajaxBtnPage = new AjaxBtnPage();
        Assert.assertFalse(ajaxBtnPage.SpinnerIsDisplayed(), "Spinner is displayed before click on button");
        ajaxBtnPage.BtnClick();
        Assert.assertTrue(ajaxBtnPage.SpinnerIsDisplayed());
        ajaxBtnPage.WaitForData();
        Assert.assertFalse(ajaxBtnPage.SpinnerIsDisplayed(), "Spinner is displayed after time");
        Assert.assertTrue(ajaxBtnPage.DataIsDisplayed());
    }
}
