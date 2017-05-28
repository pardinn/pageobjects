package expanded.pageobjects;

import expanded.objectrepositories.LeftSidebarPageObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 * Created by morae on 28/05/2017.
 */
public class LeftSidebarPage extends BasePage<LeftSidebarPageObjectRepository> {
    LeftSidebarPage(WebDriver driver) {
        super(driver, new LeftSidebarPageObjectRepository(driver));
    }

    public void search(String searchString) {
        objectRepository.searchBox.sendKeys(searchString);
        objectRepository.searchButton.click();
    }
}
