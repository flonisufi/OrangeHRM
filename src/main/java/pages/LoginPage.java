package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class LoginPage {

    public LoginPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @FindBy(css = "input[placeholder='Username']")
    private WebElement usernameField;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordField;

    @FindBy(css = ".orangehrm-login-button")
    private WebElement loginBtn;

    @FindBy(xpath = "//p[text()='Time at Work']")
    private WebElement text;

    @FindBy(css = ".orangehrm-login-title")
    private WebElement title;

    public void enterCredentials(String username,String password)
    {

        if (Driver.getDriver().getCurrentUrl().equalsIgnoreCase(url))
        {
            BrowserUtilities.waitForElementToAppear(usernameField);
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
        }

    }

    public void clickLogin()
    {
        if (Driver.getDriver().getCurrentUrl().equalsIgnoreCase(url))
        {
            loginBtn.click();
        }

    }

    public String confirmText()
    {
        BrowserUtilities.waitForElementToAppear(text);
        return text.getText();
    }
}
