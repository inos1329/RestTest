package nutchel;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestApi {

    String[] array = new String[]{"Hello", "world"};

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI =RequestBody.URL;
    }

    @Test
    public void postRequest() {
        ExPojo ExBody = ExPojo.builder()
                .folderId("b1ga7gnh28dsm7oo9lc1")
                .texts(array)
                .targetLanguageCode("ru")
                .build();

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + RequestBody.YANDEX_API_KEY)
                .body(ExBody)
                .log().all()
                .when()
                .post()
                .then()
                .log().all()
                .extract().response();
    }
}