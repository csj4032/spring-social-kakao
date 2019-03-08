package org.springframework.social.kakao.api.impl;

import org.springframework.social.kakao.api.TranslateObject;
import org.springframework.social.kakao.api.TranslatedText;
import org.springframework.social.kakao.api.TranslationOperation;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class TranslationTemplate extends AbstractKakaoOperations implements TranslationOperation {

	private final RestTemplate adminRestTemplate;

	public TranslationTemplate(RestTemplate adminRestTemplate, boolean isAuthorized) {
		super(isAuthorized);
		this.adminRestTemplate = adminRestTemplate;
	}

	@Override
	public TranslatedText translate(TranslateObject translateObject) {
		MultiValueMap<String, String> param = new LinkedMultiValueMap<>();
		param.set("src_lang", translateObject.getSrcLang().getMark());
		param.set("target_lang", translateObject.getTargetLang().getMark());
		param.set("query", translateObject.getQuery());
		return adminRestTemplate.postForObject(buildApiUri("/v1/translation/translate"), param, TranslatedText.class);
	}
}