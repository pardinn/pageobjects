package expanded.pageobjects;

import expanded.objectrepositories.SocialMediaPageObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 * Created by morae on 28/05/2017.
 */
public class SocialMediaPage extends BasePage<SocialMediaPageObjectRepository> {

    SocialMediaPage(WebDriver driver) {
        super(driver, new SocialMediaPageObjectRepository(driver));
    }

    public void clickFirstTwitterButton() {
        objectRepository.firstTwitterButton.click();
    }
}
