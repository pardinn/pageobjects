package expanded.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by morae on 28/05/2017.
 */
public class LeftSidebarPageObjectRepository extends BasePageObjectRepository {
    @FindBy(xpath = "(//form[@role='search'])[2]//*[@id='s']")
    public WebElement searchBox;
    @FindBy(xpath = "(//form[@role='search'])[2]//*[@id='searchsubmit']")
    public WebElement searchButton;

    public LeftSidebarPageObjectRepository(WebDriver driver) {
        super(driver);
    }
}
