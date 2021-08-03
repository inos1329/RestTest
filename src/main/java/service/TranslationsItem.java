package service;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TranslationsItem{
	private String text;
	private String detectedLanguageCode;
}
