package firstlevel.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by morae on 27/05/2017.
 */
public class WorkingWithElementsCoursePage {

    private WebDriver driver;

    @FindBy(className = "icon-fullscreen")
    private WebElement expandingElementLocator;

    public WorkingWithElementsCoursePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isAt() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(expandingElementLocator));
        } catch (WebDriverException e) {
            return false;
        }
        return true;
    }
}
