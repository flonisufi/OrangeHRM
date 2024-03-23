package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ClaimRequestPage;

public class ClaimRequestStepD {

    ClaimRequestPage claimRequestPage = new ClaimRequestPage();

    @When("User click on Claim")
    public void user_click_in_claim()
    {
        claimRequestPage.claimPage();

    }
    @When("User click on Assign Claim")
    public void user_click_on_assign_claim()
    {
       claimRequestPage.assingPage();
    }

    @When("User give Informations and Create")
    public void user_give_informations_and_create() throws InterruptedException {
        claimRequestPage.employeName();
        claimRequestPage.setEvent();
        claimRequestPage.setCurrency();
        claimRequestPage.setRemarks();

    }
    @Then("Validate that request has been sent successfully")
    public void validate_that_request_has_been_sent_successfully()
    {
        Assert.assertEquals(claimRequestPage.getClaimText(),"Success\n" +
                "Successfully Saved\n" +
                "×");

    }

}
