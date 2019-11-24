package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;

public class EmpSteps {
    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;

    private String id = "http://localhost:8085/employees{id}";

    @Given("^I perform the GET operation for \"([^\"]*)\"$")
    public void iPerformTheGETOperationFor(String url) throws Throwable {

    }

    @When("^I perform GET for the id number \"([^\"]*)\"$")
    public void iPerformGETForTheIdNumber(String id) throws Throwable {
        BDDStyleMethod.SimpleGETEmp(id);

    }

    @Then("^I should see the firstname as \"([^\"]*)\"$")
    public void iShouldSeeTheFirstnameAs(String arg0) throws Throwable {


    }


    @Given("^I perform POST operation \"([^\"]*)\"$")
    public void iPerformPOSTOperation(String arg0) throws Throwable {
       BDDStyleMethod.performPOSTwithbodyparameter();
    }

    @Given("^I perform DELETE operation for \"([^\"]*)\"$")
    public void iPerformDELETEOperationFor(String ID) throws Throwable {
        BDDStyleMethod.deleteoperation(ID);
    }

    @And("^I perform GET operation for \"([^\"]*)\"$")
    public void iPerformGETOperationFor(String arg0) throws Throwable {


    }


    @Then("^I should not see the body with firstName$")
    public void iShouldNotSeeTheBodyWithFirstName() {
    }
}
