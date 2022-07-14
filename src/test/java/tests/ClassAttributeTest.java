package tests;

import org.testng.annotations.Test;
import pages.ClassAttributePage;

public class ClassAttributeTest extends BaseTest{

    @Test
    public void ButtonsClicks(){
        ClassAttributePage attributePage = new ClassAttributePage();
        attributePage.clickPrimaryBtn();
        attributePage.acceptAllert();
        attributePage.clickWarningBtn();
        attributePage.clickSuccessBtn();
    }
}
