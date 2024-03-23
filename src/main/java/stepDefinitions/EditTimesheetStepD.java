package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.EditTimesheetPage;

public class EditTimesheetStepD {

    EditTimesheetPage editTimesheetPage = new EditTimesheetPage();

    @When("User click on PIM")
    public void userClickOnPIM()
    {
        editTimesheetPage.goToPIM();

    }

    @When("User click on an Employee")
    public void user_click_on_an_employee()
    {
        editTimesheetPage.clickAnEmployee();

    }

    @When("User enter firstname {string} middlename {string} and lastname {string}")
    public void user_enter_firstname_middlename_and_lastname(String firstname, String middlename, String lastname) throws InterruptedException {
        if (firstname.equalsIgnoreCase("firstname"))
        {
            firstname = "Flon";
            middlename = "Jon";
            lastname = "Isufi";
        }
        editTimesheetPage.enterInformations(firstname,middlename,lastname);

    }

    @Then("User Save and Validate that Employee is updated successfully")
    public void user_save_and_validate_that_employee_is_updated_successfully()
    {
        Assert.assertEquals(editTimesheetPage.confirmText(),"Success\n" +
                "Successfully Updated\n" +
                "×");

    }


}
