package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtilities {

    private static Actions actions;

    public BrowserUtilities()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static void waitForElementToAppear(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void setActions(WebElement element, Keys down, Keys enter)
    {
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(element,down,enter).build().perform();
    }
}
