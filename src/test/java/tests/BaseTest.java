package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import utils.DriverFactory;
import utils.PropertyReader;

public abstract class BaseTest {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver(PropertyReader.getBrowser());
        driver.get(PropertyReader.getBaseUrl());
        System.out.println(driver.getTitle() + " page has been opened");
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}