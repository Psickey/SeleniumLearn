package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicTablePage;

public class DynamicTableTest extends BaseTest {

    @Test
    public void CompareValue(){
        DynamicTablePage dynamicTablePage = new DynamicTablePage();
        Assert.assertEquals(dynamicTablePage.getDataFromCell(),
                dynamicTablePage.getDataFromResult(), "Chrome CPU value is equal");
    }
}
