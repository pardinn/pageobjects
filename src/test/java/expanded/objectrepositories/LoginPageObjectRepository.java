package expanded.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by morae on 28/05/2017.
 */
public class LoginPageObjectRepository extends BasePageObjectRepository {
    @FindBy(id = "btn-signin")
    public WebElement loginButton;
    @FindBy(id = "user_password")
    public WebElement passwordField;
    @FindBy(id = "user_email")
    public WebElement emailField;

    public LoginPageObjectRepository(WebDriver driver) {
        super(driver);
    }
}
