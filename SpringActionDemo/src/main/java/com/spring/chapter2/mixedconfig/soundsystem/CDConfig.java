package com.spring.chapter2.mixedconfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Administrator
 *
 */
@Configuration
public class CDConfig {
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
}
