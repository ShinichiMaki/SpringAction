package com.spring.chapter2.mixedconfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	@Bean
	public CDPlayer cdPlayer(CompactDisc blankDisc) {
		return new CDPlayer(blankDisc);
	}
}
