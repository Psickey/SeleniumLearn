package tests;

import org.testng.annotations.Test;
import pages.DynamicIdPage;

public class DynamicIdTest extends BaseTest {

    @Test
    public void Click10TimesOnButton() {
        DynamicIdPage dynamicIdPage = new DynamicIdPage();
        int n = 10;

        for (int i = 0; i < n; i++){
            dynamicIdPage.FindClickRefresh();
        }
    }
}
