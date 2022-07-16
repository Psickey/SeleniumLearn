package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerifyTextPage;

public class VerifyTextTest extends BaseTest {

    @Test
    public void findText(){
        VerifyTextPage verifyTextPage = new VerifyTextPage();
        Assert.assertEquals(verifyTextPage.getWelcomeText(), "Welcome",
                "Welcome text was found on the page");
    }
}
