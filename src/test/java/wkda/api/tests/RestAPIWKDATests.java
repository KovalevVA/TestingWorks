package wkda.api.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import wkda.api.EndPointBodyTypes;
import wkda.api.EndPointBuiltDates;
import wkda.api.EndPointMainTypes;
import wkda.api.EndPointManufacturer;

import java.io.FileReader;
import java.io.IOException;
import static org.testng.Assert.assertEquals;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static wkda.api.tests.requestsdata.DataForAPIRequests.*;


public class RestAPIWKDATests {

    private static final String URL_WKDA_API = "http://wkda.de/papi/v1/car-types";


    @Test
    public void getSomeCarsManufacterCodes() {

        RestAssured.baseURI = URL_WKDA_API;
        given()
                .header("User-Agent", "Chrome");
        when()
                .get(EndPointManufacturer.MANUFACTER.addPath(""))
                .then()
                .statusCode(200)
                .assertThat()
                .body("wkda.020", equalTo("Abarth"))
                .body("wkda.340", equalTo("Honda"))
                .body("wkda.235", equalTo("DS Automobiles"))
                .body("wkda.250", equalTo("e.GO"))
                .body("wkda.895", equalTo("Piaggio (Vespa)"));
    }

    @Test
    public void getMainTypesOfParticularManufactures() {
        RestAssured.baseURI = URL_WKDA_API;
        given()
                .header("User-Agent", "Chrome");
        when()
                .get(EndPointMainTypes.MAIN_TYPES.addPath(String.format("?manufacturer=%s",
                        CAR_MANUFACTURE_CODE)))
                .then()
                .statusCode(200)
                .assertThat()
                .body("wkda.Evolution", equalTo("Evolution"));

    }

    @Test
    public void getBuiltDatesOfParticularCar() {

        RestAssured.baseURI = URL_WKDA_API;
        given()
                .header("User-Agent", "Chrome");
        when()
                .get(EndPointBuiltDates.BUILT_DATES.addPath(String.format("?manufacturer=%s&main-type=%s",
                        CAR_MANUFACTURE_CODE, CAR_MAIN_TYPE)))
                .then()
                .statusCode(200)
                .assertThat()
                .body("wkda.2010", equalTo("2010"));

    }

    @Test
    public void getBodyTypesOfParticularCar() {

        RestAssured.baseURI = URL_WKDA_API;
        given()
                .header("User-Agent", "Chrome");
        when()
                .get(EndPointBodyTypes.BODY_TYPES.addPath(String.format("?manufacturer=%s&main-type=%s" +
                                "&built-date=%s",
                        CAR_MANUFACTURE_CODE, CAR_MAIN_TYPE, CAR_BUILT_DATE)))
                .then()
                .statusCode(200)
                .assertThat()
                .body("wkda.1025", equalTo("Limousine"));
    }

    @Test
    public void getMainTypesByParametersOfParticularCar() {

        RestAssured.baseURI = URL_WKDA_API;
        given()
                .header("User-Agent", "Chrome");
        when()
                .get(EndPointMainTypes.MAIN_TYPES.addPath(String.format("?manufacturer=%s&main-type=%s" +
                                "&built-date=%s&body-type=%s",
                        CAR_MANUFACTURE_CODE, CAR_MAIN_TYPE, CAR_BUILT_DATE, CAR_BODY_TYPE)))
                .then()
                .statusCode(200)
                .assertThat()
                .body("wkda", hasItems());

    }


    @Test
    public void checkingPOSTRequestProbe() throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("src/main/java/wkda/api/wkda_post_request.json");
        Object jsonobj = jsonParser.parse(reader);

        RestAssured.baseURI = URL_WKDA_API;
        Response response = null;

        try {
            response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(jsonobj)
                    .post(EndPointManufacturer.MANUFACTER.addPath(""));
        } catch (Exception e) {
            e.printStackTrace();
        }

            System.out.println("Response " + response.asString());
            System.out.println("Status Code " + response.statusCode());

            assertEquals(301, response.statusCode());


        }
    }



