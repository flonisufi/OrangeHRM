package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class ErrorLoginPage {

    public ErrorLoginPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".oxd-alert-content-text")
    private WebElement msg;

    public String errorText()
    {
        BrowserUtilities.waitForElementToAppear(msg);
        return msg.getText();
    }
}
