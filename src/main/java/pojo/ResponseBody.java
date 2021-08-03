package pojo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseBody {
	private String folderId;
	private String [] texts;
	private String targetLanguageCode;
}