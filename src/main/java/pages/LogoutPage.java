package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class LogoutPage {

    public LogoutPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".oxd-userdropdown-icon")
    private WebElement menu;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutBtn;

    @FindBy(css = ".orangehrm-login-title")
    private WebElement title;

    public void logoutAcc()
    {
        BrowserUtilities.waitForElementToAppear(menu);
        menu.click();
        BrowserUtilities.waitForElementToAppear(logoutBtn);
        logoutBtn.click();
    }

    public WebElement getTitle()
    {
        BrowserUtilities.waitForElementToAppear(title);
        return title;
    }



}
