package service;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Request{
	private List<TranslationsItem> translations;
}