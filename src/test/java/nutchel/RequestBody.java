package nutchel;

public class RequestBody {
    protected static final String YANDEX_API_KEY = "t1.9euelZrGjMuUmZiRm8-TmJqYjImPzu3rnpWalsiQyI6QlZaWy5uWlZONlcrl8_dQLGZ3-e8FbhET_t3z9xBbY3f57wVuERP-.K3M8nMOEX6MvwnOYtxbUpS_JwNCq_BsuPCMjAz9eqHWG9MwMWL77D9lTYQo1FRxI-Rou6ZXxOP9t_aU_oZKmDQ";
    protected static final String URL  = "https://translate.api.cloud.yandex.net/translate/v2/translate";
    protected static String folderId = "b1ga7gnh28dsm7oo9lc1";
    protected static String string1 = "Hello";
    protected static String string2 = "World";
    protected static String Body2 =
            "{\n" +
                    "    \"folderId\": \""+folderId+"\",\n" +
                    "    \"texts\": [\""+string1+"\", \""+string2+"\"],\n" +
                    "    \"targetLanguageCode\": \"ru\"\n" +
                    "}";
}
