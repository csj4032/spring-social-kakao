package org.springframework.social.kakao.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TranslatedText {
	@JsonProperty("translated_text")
	private Object[] translatedText;
}
