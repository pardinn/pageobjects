package firstlevel.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by morae on 27/05/2017.
 */
public class CoursesPage {

    private WebDriver driver;

    @FindBy(className = "my-account")
    private WebElement signInLink;

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.get("http://courses.ultimateqa.com/");
    }

    public LoginPage clickSignInLink() {
        signInLink.click();
        return new LoginPage(driver);
    }
}
