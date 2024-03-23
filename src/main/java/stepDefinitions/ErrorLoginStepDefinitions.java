package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ErrorLoginPage;
import pages.LoginPage;

public class ErrorLoginStepDefinitions {

    ErrorLoginPage errorLoginPage = new ErrorLoginPage();
    LoginPage loginPage = new LoginPage();

    @When("User enter invalid username {string} and password {string}")
    public void userEnterInvalidUsernameAndPassword(String username, String password)
    {
        if (username.equalsIgnoreCase("invalid"))
        {
            username = "flonbaba";
            password = "kingi123";
        }
        loginPage.enterCredentials(username,password);

    }

    @Then("An Error Message should be displayed")
    public void an_error_message_should_be_displayed()
    {
        Assert.assertEquals(errorLoginPage.errorText(),"Invalid credentials");
    }


}
