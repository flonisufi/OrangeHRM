package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AddEmployeePage;

public class AddEmployeeStepD {

    Faker faker = new Faker();

    AddEmployeePage addEmployeePage = new AddEmployeePage();

    @When("User click Add Employee")
    public void user_click_add_employee()
    {
        addEmployeePage.addEmployee();

    }

    @When("User give name {string} and middlename {string} and lastName {string} and Save")
    public void user_give_name_and_middlename_and_lastName_and_save(String name, String midname, String lastname)
    {
        if (name.equalsIgnoreCase("name"))
        {
            name = faker.name().firstName();
            midname = faker.name().name();
            lastname = faker.name().lastName();
        }
        addEmployeePage.giveInfo(name,midname,lastname);

    }
    @Then("Validate that Employes is Added")
    public void validate_that_employes_is_added()
    {

        Assert.assertEquals(addEmployeePage.getText(),"Success\n" +
                "Successfully Saved\n" +
                "×");

    }


}
