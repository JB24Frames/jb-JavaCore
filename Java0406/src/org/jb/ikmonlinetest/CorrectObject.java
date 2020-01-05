package org.jb.ikmonlinetest;

import java.util.Locale;

public class CorrectObject {

	public static void main(String[] args) {
/*		Locale locale = new Locale(); we have to add args to this to match ,see below
		Locale locale = new Locale(null);*/
		Locale locale1 = new Locale.Builder().setLanguage("en").setRegion("GB").build();
		Locale locale2 = new Locale("th", "TH");
		Locale locale3 = Locale.forLanguageTag("zh-CN");
//		Locale locale4 = new Locale("en", "US", true); we have to remove args here to match .
	}

}
