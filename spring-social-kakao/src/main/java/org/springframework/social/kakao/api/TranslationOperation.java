package org.springframework.social.kakao.api;

public interface TranslationOperation {

	/**
	 * <pre>
	 * 현재 입력된 텍스트를 기반으로 번역 텍스트 결과를 전달해주는 기능을 제공합니다.
	 * </pre>
	 * @return
	 */
	TranslatedText translate(TranslateObject translateObject);
}
