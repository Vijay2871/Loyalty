package api;

import Utils.ConfigLoader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class specbuilder {

    public static RequestSpecification getRequestSpecification() throws FileNotFoundException {
        PrintStream fileOutPutStream=new PrintStream(new File("Loyalty.log"));
        return new RequestSpecBuilder().addFilter(new RequestLoggingFilter(fileOutPutStream)).
                addFilter(new ResponseLoggingFilter(fileOutPutStream)).
                setBaseUri("https://test-api.twg.co.nz")
                .addHeader("x-api-key", ConfigLoader.getInstance().getHeader()).
                setContentType(ContentType.JSON).log(LogDetail.ALL).build();

    }

    public static ResponseSpecification getResponseSpecification(){

        return new ResponseSpecBuilder().log(LogDetail.ALL).build();

    }

}
