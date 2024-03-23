package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ResetPassPage;

public class ResetPassStepDefinitions {

    ResetPassPage resetPassPage = new ResetPassPage();
    String password = "Pakokosare1";

    @When("User click on menu and Change Password")
    public void user_click_on_menu_and_change_password()
    {
        resetPassPage.goToRestPass();

    }

    @When("User enter current password {string}")
    public void user_enter_current_password(String password)
    {
        resetPassPage.setCurrentPass(password);

    }

    @When("User enter new Password {string} and confirm Password {string} and Save")
    public void user_enter_new_password_and_confirm_password_and_save(String newPass, String currentPass)
    {
        if (newPass.equalsIgnoreCase("newPass"))
        {
            newPass = password;
            currentPass = password;

        }
        resetPassPage.changePassword(newPass,currentPass);

    }

    @Then("Validate that password its changed successfully")
    public void validate_that_password_its_changed_successfully()
    {

        Assert.assertEquals(resetPassPage.validationMsg(),"Success\n" +
                "Successfully Saved\n" +
                "×");

    }
}
