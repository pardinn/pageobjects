package expanded.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by morae on 28/05/2017.
 */
public class WorkingWithElementsCoursePageObjectRepository extends BasePageObjectRepository {
    @FindBy(className = "icon-fullscreen")
    public WebElement expandingElementLocator;

    public WorkingWithElementsCoursePageObjectRepository(WebDriver driver) {
        super(driver);
    }
}
