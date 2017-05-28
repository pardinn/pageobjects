package expanded.pageobjects;

import expanded.objectrepositories.CoursesPageObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 * Created by morae on 27/05/2017.
 */
public class CoursesPage extends BasePage<CoursesPageObjectRepository> {

    public CoursesPage(WebDriver driver) {
        super(driver, new CoursesPageObjectRepository(driver));
    }

    public void goTo() {
        driver.get("http://courses.ultimateqa.com/");
    }

    public LoginPage clickSignInLink() {
        objectRepository.signInLink.click();
        return new LoginPage(driver);
    }
}
