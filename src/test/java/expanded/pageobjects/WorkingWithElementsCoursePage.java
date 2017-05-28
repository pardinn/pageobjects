package expanded.pageobjects;

import expanded.objectrepositories.WorkingWithElementsCoursePageObjectRepository;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by morae on 27/05/2017.
 */
public class WorkingWithElementsCoursePage extends BasePage<WorkingWithElementsCoursePageObjectRepository> {

    public WorkingWithElementsCoursePage(WebDriver driver) {
        super(driver, new WorkingWithElementsCoursePageObjectRepository(driver));
    }

    public boolean isAt() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(objectRepository.expandingElementLocator));
        } catch (TimeoutException e) {
            return false;
        }
        return true;
    }
}
