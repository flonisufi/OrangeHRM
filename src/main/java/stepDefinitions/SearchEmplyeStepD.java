package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SearchEmployePage;

public class SearchEmplyeStepD {

    SearchEmployePage searchEmployePage = new SearchEmployePage();

    @When("User click on Directory")
    public void user_click_on_directory()
    {
        searchEmployePage.clickDirecotry();
    }

    @When("User give Employee Informations and Search")
    public void user_give_employee_informations_and_search() throws InterruptedException
    {
        searchEmployePage.employeName();


    }
    @Then("Emplooyee should be displayed")
    public void emplooyee_should_be_displayed()
    {
        Assert.assertTrue(searchEmployePage.employee().isDisplayed());

    }
}
