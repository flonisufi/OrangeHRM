package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class SearchEmployePage {

    public SearchEmployePage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/web/index.php/directory/viewDirectory']")
    private WebElement directory;

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement hints;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    private WebElement job;

    @FindBy(css = ".orangehrm-left-space")
    private WebElement search;

    @FindBy(css = ".oxd-sheet")
    private WebElement employee;

    public void clickDirecotry()
    {
        BrowserUtilities.waitForElementToAppear(directory);
        directory.click();
    }

    public void employeName()
    {
        BrowserUtilities.waitForElementToAppear(hints);
        hints.sendKeys("eri");
        hints.sendKeys(Keys.DOWN);
        hints.sendKeys(Keys.ENTER);
    }

    public WebElement employee()
    {
        BrowserUtilities.waitForElementToAppear(employee);
        return employee;
    }




}
