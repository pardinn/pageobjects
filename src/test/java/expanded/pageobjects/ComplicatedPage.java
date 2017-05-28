package expanded.pageobjects;

import expanded.objectrepositories.ComplicatedPageObjectRepository;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by morae on 28/05/2017.
 */
public class ComplicatedPage extends BasePage<ComplicatedPageObjectRepository> {

    public ComplicatedPage(WebDriver driver) {
        super(driver, new ComplicatedPageObjectRepository(driver));
    }

    public void goTo() {
        driver.get("http://www.ultimateqa.com/complicated-page/");
    }

    public boolean isAt() {
        return driver.getCurrentUrl().contains("complicated-page");
    }

    public void clickFirstTwitterButton() {
        objectRepository.firstTwitterButton.click();
    }

    public void search(String searchString) {
        objectRepository.searchBox.sendKeys(searchString);
        objectRepository.searchButton.click();
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
