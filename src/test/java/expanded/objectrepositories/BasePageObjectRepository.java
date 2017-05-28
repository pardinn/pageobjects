package expanded.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by morae on 27/05/2017.
 */
public class BasePageObjectRepository {

    private final WebDriver driver;

    public BasePageObjectRepository(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
