package tests;

import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SideDelayPage;

public class SideDelayTest extends BaseTest {

    @Test
    public void WaitForSuccess() {
        SideDelayPage sideDelayPage = new SideDelayPage();
        sideDelayPage.clickOnAjaxBtn();
        Assert.assertTrue(sideDelayPage.SpinnerIsDisplayed(), "Spinner is displayed");
        sideDelayPage.WaitForData();
        Assert.assertFalse(sideDelayPage.SpinnerIsDisplayed(), "Spinner is not displayed after time");
        Assert.assertTrue(sideDelayPage.LineIsDisplayed(), "Success line is displayed");
        Assertions.assertThat(sideDelayPage.getSuccessTest()).as("Success line is correct")
                .isEqualTo("Data calculated on the client side.");

    }
}
