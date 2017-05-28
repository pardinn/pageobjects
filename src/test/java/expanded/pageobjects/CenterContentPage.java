package expanded.pageobjects;

import expanded.objectrepositories.CenterContentPageObjectRepository;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by morae on 28/05/2017.
 */
public class CenterContentPage extends BasePage<CenterContentPageObjectRepository> {


    CenterContentPage(WebDriver driver) {
        super(driver, new CenterContentPageObjectRepository(driver));
    }

    public void openToggle() {

        Actions scroll = new Actions(driver);
        scroll.moveToElement(objectRepository.nameField).perform();
        objectRepository.toggle.click();
    }

    public boolean isToggleOpen() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            wait.until(ExpectedConditions.visibilityOf(objectRepository.insideToggle));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}
