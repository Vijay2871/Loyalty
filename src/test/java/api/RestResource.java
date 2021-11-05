package api;

import com.segments.pojo.Segments;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

import java.io.FileNotFoundException;

import static api.specbuilder.getRequestSpecification;
import static api.specbuilder.getResponseSpecification;
import static io.restassured.RestAssured.given;

public class RestResource {

public static Response post(String path,Segments fs) throws FileNotFoundException {
    return SerenityRest.given(getRequestSpecification()).body(fs).when().post(path).then()
            .spec(getResponseSpecification()).assertThat()
            .extract().response();
}
}
