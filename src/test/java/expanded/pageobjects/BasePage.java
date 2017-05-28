package expanded.pageobjects;

import expanded.objectrepositories.BasePageObjectRepository;
import org.openqa.selenium.WebDriver;

/**
 * Created by morae on 27/05/2017.
 */
class BasePage<TObjectRepository extends BasePageObjectRepository> {

    final WebDriver driver;
    TObjectRepository objectRepository;

    BasePage(WebDriver driver, TObjectRepository objectRepository) {
        this.driver = driver;
        this.objectRepository = objectRepository;
    }
}
