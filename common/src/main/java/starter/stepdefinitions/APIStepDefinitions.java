package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;

public class APIStepDefinitions {

    String apiUrl;

    @Given("the users REST API")
    public void the_users_rest_api() {
        apiUrl = "https://reqres.in/api/users";
    }

    @When("PUT is used")
    public void put_is_used() {
        final String requestJson = "{\"name\": \"Jo Bloggs\", \"Job\": \"Quality Engineer\"}";
        SerenityRest.rest().body(requestJson).post(apiUrl);
    }

    @When("GET is used")
    public void get_is_used() {
        SerenityRest.rest().get(apiUrl);
    }

    @Then("the status code is {int}")
    public void the_status_code_is(Integer statusCode) {
        SerenityRest.then().statusCode(Matchers.equalTo(statusCode));
    }
}
