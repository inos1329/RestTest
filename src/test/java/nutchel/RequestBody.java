package nutchel;

public class RequestBody {
    protected static final String YANDEX_API_KEY = "t1.9euelZqOx5vIysnMxpKTzZfKmZKcku3rnpWalsiQyI6QlZaWy5uWlZONlcrl9PdyYlt3-e9KUFao3fT3MhFZd_nvSlBWqA.30et4cV4n9X626VZ5jUBkelRcgoyxod3g4RJLTVtk4YG6Ca9tIs3_gMovkwVuppZTsEB5u-eLIlEI8kMEVp_Dw";
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
