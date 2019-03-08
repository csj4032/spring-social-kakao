package org.springframework.social.kakao.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TranslateObject {
	private String query;
	private LanguageType srcLang;
	private LanguageType targetLang;
}
