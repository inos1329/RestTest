import gateway.YandexTranslateGateway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.Request;

public class YandexTranslateTest {
    private static final String[] texts = new String[]{"Hello","world"};
    private static final String targetLanguageCode = "ru";
    private static final String hello = "Привет";
    private static final String world = "мир";

    @Test
    public void getHelloTranslate(){
        YandexTranslateGateway yandexTranslateGateway = new YandexTranslateGateway();
        Request testTranslate = yandexTranslateGateway.getTranslate(texts,targetLanguageCode);
        Assertions.assertEquals(testTranslate.getTranslations().get(0).getText(),hello);
        Assertions.assertEquals(testTranslate.getTranslations().get(1).getText(),world);
    }
}
