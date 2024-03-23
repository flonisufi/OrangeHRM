package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CreatePostPage;

public class CreatePostStepD {

    CreatePostPage createPostPage = new CreatePostPage();
    Faker faker = new Faker();


    @When("User click on Buzz")
    public void user_click_on_buzz()
    {
        createPostPage.buzzPage();

    }
    @When("User post {string} and click on Post")
    public void user_post_and_click_on_post(String message)
    {
        if (message.equalsIgnoreCase("message"))
        {
            message = faker.chuckNorris().fact();
        }
        createPostPage.sharePost(message);

    }
    @Then("Validate that post has been sent")
    public void validate_that_post_has_been_sent()
    {

        Assert.assertEquals(createPostPage.getMessage(),"Success\n" +
                "Successfully Saved\n" +
                "×");

    }


}
