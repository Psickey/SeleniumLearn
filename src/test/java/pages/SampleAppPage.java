package pages;

public class SampleAppPage extends BasePage {

    public SampleAppPage() {
        super();
        SampleApp.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }
}
