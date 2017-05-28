package expanded.pageobjects;

import expanded.objectrepositories.ComplicatedPageObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 * Created by morae on 28/05/2017.
 */
public class ComplicatedPage extends BasePage<ComplicatedPageObjectRepository> {

    public SocialMediaPage socialMediaSection = new SocialMediaPage(driver);
    public LeftSidebarPage leftSidebar = new LeftSidebarPage(driver);
    public CenterContentPage centerContent = new CenterContentPage(driver);

    public ComplicatedPage(WebDriver driver) {
        super(driver, new ComplicatedPageObjectRepository(driver));
    }

    public void goTo() {
        driver.get("http://www.ultimateqa.com/complicated-page/");
    }

    public boolean isAt() {
        return driver.getCurrentUrl().contains("complicated-page");
    }
}
