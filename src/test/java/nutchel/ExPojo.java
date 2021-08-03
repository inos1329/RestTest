package nutchel;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExPojo {
    private String folderId;
    private String [] texts;
    private String targetLanguageCode;
}
