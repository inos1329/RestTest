import gateway.YandexTranslateGateway;
import org.testng.annotations.Test;
import service.Request;

import static org.testng.Assert.assertEquals;

public class YandexTranslateTest {
    private static final String[] texts = new String[]{"Hello","world"};
    private static final String targetLanguageCode = "ru";
    private static final String hello = "Привет";
    private static final String world = "мир";
    //private static final String hello = "Всем";
    //private static final String world = "привет";

    @Test
    public void getHelloTranslate(){
        YandexTranslateGateway yandexTranslateGateway = new YandexTranslateGateway();
        Request testTranslate = yandexTranslateGateway.getTranslate(texts,targetLanguageCode);
        assertEquals(testTranslate.getTranslations().get(0).getText(),hello);
        assertEquals(testTranslate.getTranslations().get(1).getText(),world);
    }
}
