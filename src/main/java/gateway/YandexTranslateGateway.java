package gateway;

import com.google.gson.Gson;
import io.joshworks.restclient.http.HttpResponse;
import io.joshworks.restclient.http.Unirest;
import lombok.SneakyThrows;
import pojo.ResponseBody;
import service.Request;

//https://cloud.yandex.ru/docs/translate/quickstart

public class YandexTranslateGateway {
    private static final String URL = "https://translate.api.cloud.yandex.net/translate/v2/translate";
    private static final String FOLDER_ID = "b1ga7gnh28dsm7oo9lc1";
    private static final String YANDEX_API_KEY = "t1.9euelZqOx5vIysnMxpKTzZfKmZKcku3rnpWalsiQyI6QlZaWy5" +
            "uWlZONlcrl9PdyYlt3-e9KUFao3fT3MhFZd_nvSlBWqA.30et4cV4n9X626VZ5jUBkelRcgoyxod3g4RJLTVtk4YG6" +
            "Ca9tIs3_gMovkwVuppZTsEB5u-eLIlEI8kMEVp_Dw";  //YANDEX_API_KEY обновлять каждые 12 часов

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
    }
}
