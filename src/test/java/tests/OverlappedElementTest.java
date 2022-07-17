package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OverlappedElementPage;

public class OverlappedElementTest extends BaseTest {

    @Test
    public void ScrollAndInput(){
        OverlappedElementPage overlappedElementPage = new OverlappedElementPage();
        overlappedElementPage.inputId("1");
        overlappedElementPage.inputName("Username: Tomo");
        Assert.assertEquals(overlappedElementPage.getNameValue(), "Username: Tomo",
                "Inputed name is correct");
    }
}
