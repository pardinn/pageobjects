package expanded.objectrepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by morae on 28/05/2017.
 */
public class CenterContentPageObjectRepository extends BasePageObjectRepository {
    @FindBy(className = "et_pb_toggle_title")
    public WebElement toggle;
    @FindBy(xpath = "(//*[@id='et_pb_contact_name_1'])[2]")
    public WebElement nameField;
    @FindBy(xpath = "//p[text()='Inside of toggle']")
    public WebElement insideToggle;

    public CenterContentPageObjectRepository(WebDriver driver) {
        super(driver);
    }


}
