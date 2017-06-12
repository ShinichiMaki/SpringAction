package com.spring.chapter2.javaconfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Bean 将返回的类型 作为Bean的类型，bean的id为方法名
 * @author Administrator
 *
 */
@Configuration
public class CDPlayerConfig {
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}

	@Bean
	public CompactDisc compactDisc1() {
		return new FunkDisc();
	}

	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}
}
