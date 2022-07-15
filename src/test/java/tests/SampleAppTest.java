package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SampleAppPage;

public class SampleAppTest extends BaseTest {

    private SampleAppPage sampleAppPage;

    @BeforeClass
    public void loadPage(){
        sampleAppPage = new SampleAppPage();
    }

    @Test
    public void LogInApp(){
        sampleAppPage.login();
        Assert.assertEquals(sampleAppPage.getStatusText(), sampleAppPage.welcomeText(), "User successfully logged in");
        Assert.assertEquals(sampleAppPage.getButtonText(), "Log Out", "Text of login button is changed");
    }

    @Test
    public void LogOut(){
        sampleAppPage.logout();
        Assert.assertEquals(sampleAppPage.getStatusText(), "User logged out.", "User successfully logged out");
        Assert.assertEquals(sampleAppPage.getButtonText(), "Log In", "Text of login button is changed");
    }

    @Test
    public void validationNotLoggedIn(){
        sampleAppPage.fillUsername("user");
        sampleAppPage.clickLogIn();
        Assert.assertEquals(sampleAppPage.getStatusText(), "Invalid username/password",
                "Empty password input");

        refreshPage();
        sampleAppPage.fillUsername("");
        sampleAppPage.clickLogIn();
        Assert.assertEquals(sampleAppPage.getStatusText(), "Invalid username/password",
                "Empty username and password inputs");

        refreshPage();
        sampleAppPage.fillPassword("pwd");
        sampleAppPage.clickLogIn();
        Assert.assertEquals(sampleAppPage.getStatusText(), "Invalid username/password",
                "Empty username input");

        refreshPage();
        sampleAppPage.fillUsername("");
        sampleAppPage.fillPassword("123");
        sampleAppPage.clickLogIn();
        Assert.assertEquals(sampleAppPage.getStatusText(), "Invalid username/password",
                "Empty username and invalid password inputs");

        refreshPage();
        sampleAppPage.fillUsername(" ");
        sampleAppPage.fillPassword(" ");
        sampleAppPage.clickLogIn();
        Assert.assertEquals(sampleAppPage.getStatusText(), "Invalid username/password",
                "Space username and password inputs");

        refreshPage();
        sampleAppPage.fillUsername("user");
        sampleAppPage.fillPassword("123");
        sampleAppPage.clickLogIn();
        Assert.assertEquals(sampleAppPage.getStatusText(), "Invalid username/password",
                "Valid username and invalid password inputs");

        refreshPage();
        sampleAppPage.fillUsername("User123");
        sampleAppPage.fillPassword("pwd ");
        sampleAppPage.clickLogIn();
        Assert.assertEquals(sampleAppPage.getStatusText(), "Invalid username/password",
                "Invalid password with space input");
    }
}
