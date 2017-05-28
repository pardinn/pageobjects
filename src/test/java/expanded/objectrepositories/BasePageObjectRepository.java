package expanded.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by morae on 27/05/2017.
 */
public class BasePageObjectRepository {

    public BasePageObjectRepository(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
