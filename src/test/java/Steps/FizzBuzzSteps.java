package Steps;
import com.cu.FizzBuzz;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FizzBuzzSteps {
    FizzBuzz fb;
    String result;

    @Given("^create play$")
    public void createPlay() {
        fb = new FizzBuzz();
    }

    @When("^I give number (\\d+)$")
    public void iGiveNumber(int number) {
        result = fb.Play(number);
    }

    @Then("^I should get Fizz$")
    public void iShouldGetFizz() {
        Assert.assertEquals(result,"Fizz");
    }
}
