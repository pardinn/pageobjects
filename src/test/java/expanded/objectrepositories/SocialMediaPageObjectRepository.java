package expanded.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by morae on 28/05/2017.
 */
public class SocialMediaPageObjectRepository extends BasePageObjectRepository {
    @FindBy(xpath = "(//*[@title='Twitter'])[1]")
    public WebElement firstTwitterButton;

    public SocialMediaPageObjectRepository(WebDriver driver) {
        super(driver);
    }
}
