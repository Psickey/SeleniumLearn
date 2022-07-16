package tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.HiddenLayersPage;

public class HiddenLayersTest extends BaseTest {

    @Test
    public void clickTwiceOnGreenButton(){
        Boolean buttonIsClickable;
        HiddenLayersPage hiddenLayersPage = new HiddenLayersPage();
        Assertions.assertThat(hiddenLayersPage.greenIsDisplayed()).as("Green button is displayed").isTrue();
        buttonIsClickable = hiddenLayersPage.tryClickGreen();
        Assertions.assertThat(buttonIsClickable).as("Green button was clicked").isTrue();
        buttonIsClickable = hiddenLayersPage.tryClickGreen();
        Assertions.assertThat(buttonIsClickable).as("Green button not clickable anymore").isFalse();
        Assertions.assertThat(hiddenLayersPage.blueIsDisplayed()).as("Blue Button is displayed").isTrue();
    }
}
