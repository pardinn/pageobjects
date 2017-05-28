package expanded.pageobjects;

import expanded.objectrepositories.LoginPageObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 * Created by morae on 27/05/2017.
 */
public class LoginPage extends BasePage<LoginPageObjectRepository> {

    LoginPage(WebDriver driver) {
        super(driver, new LoginPageObjectRepository(driver));
    }

    public StudentDashboardPage login(String username, String password) {
        typeUserName(username);
        typePassword(password);
        objectRepository.loginButton.click();

        return new StudentDashboardPage(driver);
    }

    private void typeUserName(String username) {
        objectRepository.emailField.click();
        objectRepository.emailField.clear();
        objectRepository.emailField.sendKeys(username);
    }

    private void typePassword(String password) {
        objectRepository.passwordField.click();
        objectRepository.passwordField.clear();
        objectRepository.passwordField.sendKeys(password);
    }
}
