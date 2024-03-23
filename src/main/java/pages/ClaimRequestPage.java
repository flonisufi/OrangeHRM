package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class ClaimRequestPage {

    public ClaimRequestPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[href='/web/index.php/claim/viewClaimModule']")
    private WebElement claim;

    @FindBy(xpath = "//a[text()='Assign Claim']")
    private WebElement assignClaim;

    @FindBy(css = "input[placeholder='Type for hints...']")
    private WebElement hints;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]")
    private WebElement event;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
    private WebElement currency;

    @FindBy(css = ".oxd-textarea")
    private WebElement remarks;

    @FindBy(css = ".orangehrm-left-space")
    private WebElement create;

    @FindBy(css = ".oxd-toast--success")
    private WebElement confirmText;

    public void claimPage()
    {
        BrowserUtilities.waitForElementToAppear(claim);
        claim.click();
    }

    public void assingPage()
    {
        BrowserUtilities.waitForElementToAppear(assignClaim);
        assignClaim.click();
    }



    public void employeName() throws InterruptedException {
        BrowserUtilities.waitForElementToAppear(hints);
        hints.sendKeys("a");
        Thread.sleep(3000);
        hints.sendKeys(Keys.DOWN);
        hints.sendKeys(Keys.ENTER);

    }

    public void setEvent()
    {
        BrowserUtilities.setActions(event,Keys.DOWN,Keys.ENTER);

    }

    public void setCurrency()
    {
        BrowserUtilities.setActions(currency,Keys.DOWN,Keys.ENTER);
    }


    public void setRemarks()
    {
        remarks.sendKeys("Everything is good!!Thank youu");
        create.click();
    }

    public String getClaimText()
    {
        BrowserUtilities.waitForElementToAppear(confirmText);
        return confirmText.getText();
    }


}
