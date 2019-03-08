package org.springframework.social.kakao.api;

import lombok.Getter;

@Getter
public enum LanguageType {

	KR("한국어", "kr"),
	EN("영어", "en"),
	ID("인도네시아어", "id");

	private String lang;
	private String mark;

	LanguageType(String lang, String mark) {
		this.lang = lang;
		this.mark = mark;
	}
}