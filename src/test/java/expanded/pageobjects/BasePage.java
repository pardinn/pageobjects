package expanded.pageobjects;

import expanded.objectrepositories.BasePageObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by morae on 27/05/2017.
 */
public class BasePage<TObjectRepository extends BasePageObjectRepository> {

    final WebDriver driver;
    TObjectRepository objectRepository;

    public BasePage(WebDriver driver, TObjectRepository objectRepository){
        this.driver = driver;
        this.objectRepository = objectRepository;
    }
}
