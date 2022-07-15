package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SampleAppPage extends BasePage {

    @FindBy(css = "#loginstatus")
    private WebElement status;

    @FindBy(css = "#login")
    private WebElement loginBtn;

    @FindBy(css = "input[name='UserName']")
    private WebElement usernameField;

    @FindBy(css = "input[name='Password']")
    private WebElement passwordField;

    public SampleAppPage() {
        super();
        SampleApp.click();
        System.out.println(driver.getTitle() + " page has been opened");
    }

    public void fillUsername(String username){
        usernameField.sendKeys(username);
    }

    public void fillPassword(String password){
        passwordField.sendKeys(password);
    }

    public void login(){
        fillUsername("Welma");
        fillPassword("pwd");
        loginBtn.click();
    }

    public void clickLogIn(){
        loginBtn.click();
    }

    public void logout(){
        if (loginBtn.getText().equals("Log Out"))
            loginBtn.click();
        else
            driver.navigate().refresh();
    }

    public String getButtonText() {
        return loginBtn.getText();
    }

    public String getStatusText(){
        return status.getText();
    }

    public String welcomeText(){
        String username;
        username = usernameField.getAttribute("value");
        return "Welcome, " + username + "!";
    }
}
