package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class AddEmployeePage {

    public AddEmployeePage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Add Employee']")
    private WebElement addEmp;

    @FindBy(name = "firstName")
    private WebElement firstName;

    @FindBy(name = "middleName")
    private WebElement middleName;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(css = ".orangehrm-left-space")
    private WebElement save;

    @FindBy(css = ".oxd-toast--success ")
    private WebElement addText;

    public void addEmployee()
    {
        BrowserUtilities.waitForElementToAppear(addEmp);
        addEmp.click();
    }

    public void giveInfo(String name,String midName,String lstName)
    {
        BrowserUtilities.waitForElementToAppear(firstName);
        firstName.sendKeys(name);
        middleName.sendKeys(midName);
        lastName.sendKeys(lstName);
        save.click();
    }

    public String getText()
    {
        BrowserUtilities.waitForElementToAppear(addText);
        return addText.getText();
    }
}
