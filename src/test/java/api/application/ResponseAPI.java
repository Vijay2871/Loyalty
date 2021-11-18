package api.application;

import api.RestResource;
import com.segments.pojo.Error;
import com.segments.pojo.Segment;
import com.segments.pojo.Segments;
import io.restassured.response.Response;

import java.io.FileNotFoundException;

import static api.Route.*;
import static api.specbuilder.*;

import static io.restassured.RestAssured.given;

public class ResponseAPI {

public static Response post(Segments fs) throws FileNotFoundException {
    return RestResource.post(loyaltyVersion + loyalty + segments, fs);
}

}
