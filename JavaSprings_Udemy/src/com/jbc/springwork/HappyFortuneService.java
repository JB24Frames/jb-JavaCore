package com.jbc.springwork;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		   return "Lucky to Inject Dependencies : Spring DI-Construcotr Injection";
	}

}
