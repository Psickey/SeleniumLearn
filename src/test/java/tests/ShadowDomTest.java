package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShadowDomPage;

public class ShadowDomTest extends BaseTest {

    @Test
    public void compareGeneratedValue(){
        ShadowDomPage shadowDomPage = new ShadowDomPage();
        shadowDomPage.generateAndCopy();
        Assert.assertEquals(shadowDomPage.getGeneratedValue(), shadowDomPage.getClipboardValue(), "");
    }
}
