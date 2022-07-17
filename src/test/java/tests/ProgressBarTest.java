package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ProgressBarPage;

public class ProgressBarTest extends BaseTest {


    private ProgressBarPage progressBarPage;

    @BeforeClass
    public void loadPage(){
        progressBarPage = new ProgressBarPage();
    }

    @Test
    public void progressResultZero(){
        progressBarPage.clickStart();
        progressBarPage.clickStopWhenReach("75");
        Assert.assertEquals(progressBarPage.getResultValue().toString(), "0", "Progress bar should reach 75%");
    }

    @Test
    public void progressResultLess(){
        progressBarPage.clickStart();
        progressBarPage.clickStopWhenReach("55");
        Assert.assertEquals(progressBarPage.getResultValue(),
                calculateDifference(progressBarPage.getProgressBarValue(), 75), "Progress bar should reach 55%");
    }

    @Test
    public void progressResultMore(){
        progressBarPage.clickStart();
        progressBarPage.clickStopWhenReach("99");
        Assert.assertEquals(progressBarPage.getResultValue(),
                calculateDifference(progressBarPage.getProgressBarValue(), 75), "Progress bar should reach 99%");
    }

    private Integer calculateDifference(int a, int b){
        return a - b;
    }
}
