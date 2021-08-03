package gateway;

import io.joshworks.restclient.http.HttpResponse;
import io.joshworks.restclient.http.Unirest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.SneakyThrows;
import pojo.ResponseBody;
import service.Request;
import com.google.gson.Gson;


public class YandexTranslateGateway {
    private static final String URL = "https://translate.api.cloud.yandex.net/translate/v2/translate";
    private static final String FOLDER_ID = "b1ga7gnh28dsm7oo9lc1";
    private static final String YANDEX_API_KEY = "t1.9euelZqTz52ayYrGjZ6LlcvPlJ2ei-3rnpWalsiQyI6QlZaWy5uWlZONlcrl8_ddEmZ3-e89RHEZ_t3z9x1BY3f57z1EcRn-.RvMgdLXRWviLKT3YAM0-QMBp-jhzPvMLijKPpiLo9jQ_Pg1Y7KDGhPDOWs3ANIhm0pegcplI4THT8NsjLVo9Bg";

    @SneakyThrows
    public Request getTranslate(String[] texts, String targetLanguageCode) {
        Gson gson = new Gson();
        ResponseBody ExBody = ResponseBody.builder()
                .folderId(FOLDER_ID)
                .texts(texts)
                .targetLanguageCode(targetLanguageCode)
                .build();

        HttpResponse<String> response = Unirest.post(URL)
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + YANDEX_API_KEY)
                .body(ExBody)
                .asString();

        return gson.fromJson(response.asString(),Request.class);

        /**RestAssured.baseURI = URL;
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + YANDEX_API_KEY)
                .body(ExBody)
                .log().all()
                .when()
                .post()
                .then()
                .extract().response();

        String strResponse = String.valueOf(response.getBody());
        return gson.fromJson(strResponse, Request.class); */
    }
}
