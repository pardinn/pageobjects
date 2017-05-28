package expanded.pageobjects;

import expanded.objectrepositories.StudentDashboardPageObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 * Created by morae on 27/05/2017.
 */
public class StudentDashboardPage extends BasePage<StudentDashboardPageObjectRepository> {

    StudentDashboardPage(WebDriver driver) {
        super(driver, new StudentDashboardPageObjectRepository(driver));
    }

    public boolean isAt() {
        return objectRepository.htmlTag.getText().contains("Your Student Dashboard");
    }

    public WorkingWithElementsCoursePage ResumeCourse() {
        objectRepository.resumeWorkingWithElementsCourseButton.click();
        return new WorkingWithElementsCoursePage(driver);
    }
}
