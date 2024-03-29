package StepDefinition;

import Context.ThreadContextForScenarios;
import Enums.Constants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class APISteps {


    public APISteps(){

    }

    @Given("^Location Query Service API$")
    public void forecastWeatherAPI(){
        System.out.println("*********Location Query Service API**************");
    }

    @When("^user sends the request with valid MSDIN$")
    public void userSendsRequest(){
        RestAssured.baseURI =Constants.API_URL.value;
        Response response = given()
                .relaxedHTTPSValidation()
               . contentType(ContentType.XML)
                .accept(ContentType.XML)
                .body(Constants.REQUEST_BODY.value)
                .when()
                .post("/LocationQueryService");
        System.out.println("Post Response :" + response.asString());
        XmlPath xmlPath = new XmlPath(response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
    }

    @When("^user sends the request with invalid MSDIN$")
    public void userSendsRequestWithInvalidMSDIN(){
        RestAssured.baseURI =Constants.API_URL.value;
        Response response = given()
                .relaxedHTTPSValidation()
                . contentType(ContentType.XML)
                .accept(ContentType.XML)
                .body(Constants.REQUEST_BODY_INVALID_MSDIN.value)
                .when()
                .post("/LocationQueryService");
        System.out.println("Post Response :" + response.asString());
        XmlPath xmlPath = new XmlPath(response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
    }

    @When("^user sends the request with invalid client$")
    public void userSendsRequestWithInvalidClient(){
        RestAssured.baseURI =Constants.API_URL.value;
        Response response = given()
                .relaxedHTTPSValidation()
                . contentType(ContentType.XML)
                .accept(ContentType.XML)
                .body(Constants.REQUEST_BODY_INVALID_CLIENT.value)
                .when()
                .post("/LocationQueryService");
        System.out.println("Post Response :" + response.asString());
        XmlPath xmlPath = new XmlPath(response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
    }

    @Then("^user should get a valid response with statuscode \"([^\"]*)\"$")
    public void validateResponse(String statusCode){
     Response response= (Response) ThreadContextForScenarios.getScenarioContext("Response");
     System.out.println(response.getStatusCode());
     Assert.assertEquals(Integer.parseInt(statusCode) , response.getStatusCode(), "Correct status code returned");
    }

    @Given("^user search a location by Name$")
    public void searchLocationByName(){
        System.out.println("Search Location By name");
    }

    @When("^user sends the request for location \"([^\"]*)\"$")
    public void sendRequestByName(String location){
        RestAssured.baseURI = Constants.API_URL.value;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.queryParam("query",location).get("/api/location/search");
        ThreadContextForScenarios.setScenarioContext("Response",response);
    }
    @Then("^user should get status code \"([^\"]*)\"$")
    public void validateStatusCode(String statusCode){
        Response response= (Response) ThreadContextForScenarios.getScenarioContext("Response");
        System.out.println(response.getStatusCode());
        Assert.assertEquals(Integer.parseInt(statusCode) , response.getStatusCode() , "Correct status code returned");
    }

    @And("^user should validate the response having location \"([^\"]*)\"$")
    public void validateResponseContainsLocation(String location){
        Response response= (Response) ThreadContextForScenarios.getScenarioContext("Response");
        String jsonString = response.asString();
        Assert.assertEquals(jsonString.toUpperCase().contains(location.toUpperCase()), true);
    }

    @Given("^user search a location by earth ID$")
    public void searchLocationByEarthID(){
        System.out.println("Search Location By earthID");
    }

    @When("^user sends the request for earthID \"([^\"]*)\"$")
    public void sendRequestForLocationUsingEarthID(String earthID){
        RestAssured.baseURI = Constants.API_URL.value;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/api/location/"+earthID+"");
        ThreadContextForScenarios.setScenarioContext("Response",response);
    }
}
