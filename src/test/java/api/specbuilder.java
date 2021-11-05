package api;

import Utils.ConfigLoader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.io.FileNotFoundException;

public class specbuilder {

    public static RequestSpecification getRequestSpecification() throws FileNotFoundException {
        return new RequestSpecBuilder().setBaseUri("https://test-api.twg.co.nz")
                .addHeader("x-api-key", ConfigLoader.getInstance().getHeader()).
                setContentType(ContentType.JSON).log(LogDetail.ALL).build();

    }

    public static ResponseSpecification getResponseSpecification(){

        return new ResponseSpecBuilder().log(LogDetail.ALL).build();

    }
}
