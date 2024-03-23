package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class ResetPassPage {

    public ResetPassPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".oxd-userdropdown-icon")
    private WebElement menu;

    @FindBy(xpath = "//a[text()='Change Password']")
    private WebElement changePassBtn;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    private WebElement currentPassField;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement newPassField;

    @FindBy(xpath = "(//input[@type='password'])[3]")
    private WebElement confirmPassField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement save;

    @FindBy(id = "oxd-toaster_1")
    private WebElement confirmMsg;


    public void goToRestPass()
    {
        BrowserUtilities.waitForElementToAppear(menu);
        menu.click();
        BrowserUtilities.waitForElementToAppear(changePassBtn);
        changePassBtn.click();
    }

    public void setCurrentPass(String password)
    {
        BrowserUtilities.waitForElementToAppear(currentPassField);
        currentPassField.sendKeys(password);
    }

    public void changePassword(String newPass,String cnfPass)
    {
        newPassField.sendKeys(newPass);
        confirmPassField.sendKeys(cnfPass);
        save.click();
    }

    public String validationMsg()
    {
        BrowserUtilities.waitForElementToAppear(confirmMsg);
        return confirmMsg.getText();

    }
}
