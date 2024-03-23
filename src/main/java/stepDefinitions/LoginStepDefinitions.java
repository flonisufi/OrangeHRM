package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on Orange HRM Page")
    public void user_is_on_orange_hrm_page()
    {

    }

    @When("User enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password)
    {
        if (username.equalsIgnoreCase("valid"))
        {
            username = "Admin";
            password = "admin123";
        }
        else if (username.equalsIgnoreCase("invalid"))
        {
            username = "floni";
            password = "kingi123";

        }
        loginPage.enterCredentials(username,password);

    }

    @When("User click Login")
    public void user_click_login()
    {
        loginPage.clickLogin();

    }

    @Then("User is on Home Page")
    public void user_is_on_home_page()
    {
        Assert.assertEquals(loginPage.confirmText(),"Time at Work");

    }
}
