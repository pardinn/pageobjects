package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by morae on 27/05/2017.
 */
public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "btn-signin")
    private WebElement loginButton;
    @FindBy(id = "user_password")
    private WebElement passwordField;
    @FindBy(id = "user_email")
    private WebElement emailField;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public StudentDashboardPage login(String username, String password) {
        typeUserName(username);
        typePassword(password);
        loginButton.click();

        return new StudentDashboardPage(driver);
    }

    private void typeUserName(String username) {
        emailField.click();
        emailField.clear();
        emailField.sendKeys(username);
    }

    private void typePassword(String password) {
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
    }
}
