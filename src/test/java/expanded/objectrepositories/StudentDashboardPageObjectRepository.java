package expanded.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by morae on 28/05/2017.
 */
public class StudentDashboardPageObjectRepository extends BasePageObjectRepository {

    @FindBy(tagName = "html")
    public WebElement htmlTag;
    @FindBy(xpath = "//*[@href='/courses/take/working-with-elements/lessons/1197847-brief-course-overview']")
    public WebElement resumeWorkingWithElementsCourseButton;

    public StudentDashboardPageObjectRepository(WebDriver driver) {
        super(driver);
    }
}
