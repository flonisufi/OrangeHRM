package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LogoutPage;

public class LogoutStepDefinitions {

    LogoutPage logoutPage = new LogoutPage();

    @When("User click on menu and Logout")
    public void user_click_on_menu_and_logout()
    {
        logoutPage.logoutAcc();

    }

    @Then("User is redirected to Login Page")
    public void user_is_redirected_to_login_page()
    {
        Assert.assertTrue(logoutPage.getTitle().isDisplayed());
        System.out.println(logoutPage.getTitle().getText());

    }
}
