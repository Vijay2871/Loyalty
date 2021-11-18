package steps;


import Utils.FakeData;
import api.StatusCode;
import api.application.ResponseAPI;
import com.segments.pojo.Error;
import com.segments.pojo.PostResponse;
import com.segments.pojo.Segment;
import com.segments.pojo.Segments;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class Steps {
    Segments fs=new Segments();
    Segment s1=new Segment();
    PostResponse postResponse=new PostResponse();
    Response response;
    @Given("^I has a request with all fields$")
    public void i_has_a_request_with_all_fields() throws Throwable {

       s1.setSegment(FakeData.generateSegment());
       s1.setCustomerId(FakeData.generateCustomerId());

//List<String> storelist=new ArrayList<>();
//storelist.add("");
//storelist.add("88");
//storelist.add("432");
//s1.setSelectedStores(storelist);


        List<Segment> jsonArray=new ArrayList<>();
        jsonArray.add(s1);
      fs.setSegments(jsonArray);


//Segments resp=new BodyBuilder().body("23","df");

    }

    @When("I has the post request")
    public void i_has_the_post_request() throws FileNotFoundException {

    response=ResponseAPI.post(fs);
        postResponse=response.as(PostResponse.class);
    }

    @Then("I get a success status codes")
    public void i_get_a_success_status_codes() {
        assertThat(response.statusCode(),equalTo(StatusCode.STATUS_CODE_201.getCode()));

    }

    @Then("I get the Success Response message")
    public void i_get_the_success_response_message() {
        assertThat(postResponse.getMessage(),equalTo("Segment has been created successfully."));
    }
}
