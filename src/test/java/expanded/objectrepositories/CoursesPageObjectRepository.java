package expanded.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by morae on 28/05/2017.
 */
public class CoursesPageObjectRepository extends BasePageObjectRepository{
    @FindBy(className = "my-account")
    public WebElement signInLink;

    public CoursesPageObjectRepository(WebDriver driver) {
        super(driver);
    }
}
