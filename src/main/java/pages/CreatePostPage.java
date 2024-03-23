package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class CreatePostPage {

    public CreatePostPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/web/index.php/buzz/viewBuzz']")
    private WebElement buzz;

    @FindBy(css = ".oxd-buzz-post-input")
    private WebElement postField;

    @FindBy(css = "button[type='submit']")
    private WebElement submit;

    @FindBy(id = "oxd-toaster_1")
    private WebElement confirmMessage;

    public void buzzPage()
    {
        BrowserUtilities.waitForElementToAppear(buzz);
        buzz.click();
    }

    public void sharePost(String message)
    {
        BrowserUtilities.waitForElementToAppear(postField);
        postField.sendKeys(message);
        System.out.println(message);
        submit.click();

    }

    public String getMessage()
    {
        BrowserUtilities.waitForElementToAppear(confirmMessage);
        return confirmMessage.getText();
    }


}
