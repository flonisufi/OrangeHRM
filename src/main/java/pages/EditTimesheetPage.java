package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class EditTimesheetPage {

    public EditTimesheetPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    JavascriptExecutor js;

    @FindBy(css = "a[href='/web/index.php/pim/viewPimModule']")
    private WebElement pim;

    @FindBy(css = ".oxd-table-row--clickable")
    private WebElement employee;

    @FindBy(name = "firstName")
    private WebElement firstNameField;

    @FindBy(name = "middleName")
    private WebElement middleNameField;

    @FindBy(name = "lastName")
    private WebElement lastNameField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement save;

    @FindBy(id = "oxd-toaster_1")
    private WebElement confirmText;

    public void goToPIM()
    {
        BrowserUtilities.waitForElementToAppear(pim);
        pim.click();
    }

    public void clickAnEmployee()
    {
        BrowserUtilities.waitForElementToAppear(employee);
        employee.click();
    }

    public void enterInformations(String firstname,String middlename,String lastname) throws InterruptedException {
        BrowserUtilities.waitForElementToAppear(firstNameField);
        Thread.sleep(2000);
        js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].value = '';", firstNameField);
        firstNameField.clear();
        js.executeScript("arguments[0].value = '';", middleNameField);
        middleNameField.clear();
        js.executeScript("arguments[0].value = '';", lastNameField);
        lastNameField.clear();
        Thread.sleep(2000);

        firstNameField.sendKeys(firstname);
        middleNameField.sendKeys(middlename);
        lastNameField.sendKeys(lastname);



    }

    public String confirmText()
    {
        save.click();
        BrowserUtilities.waitForElementToAppear(confirmText);
        return confirmText.getText();
    }



}
