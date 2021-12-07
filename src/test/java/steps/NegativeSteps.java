package steps;

import Utils.FakeData;
import api.StatusCode;
import api.application.ResponseAPI;
import com.segments.pojo.Error;
import com.segments.pojo.Segment;
import com.segments.pojo.Segments;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.MatcherAssert.assertThat;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class NegativeSteps {
    Segments fs=new Segments();
    Segment s1=new Segment();
    Error error;
    Response response;
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    String C=FakeData.generateCustomerId();
    @Given("I has a request with null customer Id")
    public void i_has_a_request_with_null_customer_id() {

        s1.setSegment(FakeData.generateSegment());
       List<Segment> jsonArray=new ArrayList<>();
       jsonArray.add(s1);
        fs.setSegments(jsonArray);

    }
    @Given("I has a request with empty storeid")
    public void i_has_a_request_with_empty_storeid() {
        s1.setSegment(FakeData.generateSegment());

        s1.setCustomerId(C);

        List<String> storelist=new ArrayList<>();
        s1.setSelectedStores(storelist);
        List<Segment> jsonArray=new ArrayList<>();
        jsonArray.add(s1);
        fs.setSegments(jsonArray);
    }
    @When("I hit the post request")
    public void i_hit_the_post_request() throws FileNotFoundException {
        response= ResponseAPI.post(fs);
       error=response.as(Error.class);

    }
    @Then("I get a Error status codes")
    public void i_get_a_error_status_codes() {
        assertThat(error.getError().getStatus(),equalTo(StatusCode.STATUS_CODE_400.getCode()));

    }
    @Then("I get the Error message")
    public void i_get_the_error_message() {
        assertThat(error.getError().getMessage(),equalTo("CustomerID is mandatory"));
    }
    @Then("I get a Error status for segments")
    public void i_get_a_error_status_for_segments() {
        assertThat(error.getError().getStatus(),equalTo(StatusCode.STATUS_CODE_422.getCode()));
    }
    @Then("I get the Error message for segments")
    public void i_get_the_error_message_for_segments() {
        assertThat(error.getError().getMessage(),equalTo("Segment is not created for custID : "+C+" as a preferred store was not selected"));
    }
}
