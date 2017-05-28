package firstlevel.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by morae on 27/05/2017.
 */
public class StudentDashboardPage {

    private WebDriver driver;

    @FindBy(tagName = "html")
    private WebElement htmlTag;
    @FindBy(xpath = "//*[@href='/courses/take/working-with-elements/lessons/1197847-brief-course-overview']")
    private WebElement resumeWorkingWithElementsCourseButton;

    public StudentDashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isAt() {
        return htmlTag.getText().contains("Your Student Dashboard");
    }

    public WorkingWithElementsCoursePage ResumeCourse() {
        resumeWorkingWithElementsCourseButton.click();
        return new WorkingWithElementsCoursePage(driver);
    }
}
