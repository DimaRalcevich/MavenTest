import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@DisplayName("Class With Tests")
public class JUnit5ExampleTests {

    @Test
    @DisplayName("Check QA User")
    void Check_QA_User() {
        RequestSpecification authentificateSpec = given()
                .baseUri("https://qa.flex.cafe/api/v1/Auth/AuthenticateUser")
                .header("Flex-Host", "qa.flex.cafe")
                .header("Content-Type", "application/json")
                .body(String.format("{\"username\": \"%s\", \"password\": \"%s\"}", "categories_trusted", "Password1!"));

        var response = authentificateSpec
                .post()
                .then()
                .extract().response();

        Assertions.assertEquals(200, response.statusCode());

        var token = response.jsonPath().getString("token");
        var id = response.jsonPath().get("session.user.id");

        System.out.println(token);
    }

    @Test
    @DisplayName("Check UAT User")
    void Check_UAT_User() {
        RequestSpecification authentificateSpec = given()
                .baseUri("https://uat.flex.cafe/api/v1/Auth/AuthenticateUser")
                .header("Flex-Host", "uat.flex.cafe")
                .header("Content-Type", "application/json")
                .body(String.format("{\"username\": \"%s\", \"password\": \"%s\"}", "categories_trusted", "Password1!"));

        var response = authentificateSpec
                .post()
                .then()
                .extract().response();

        Assertions.assertEquals(200, response.statusCode());

        var token = response.jsonPath().getString("token");
        var id = response.jsonPath().get("session.user.id");

        System.out.println(token);
    }
}
