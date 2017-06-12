package com.spring.chapter2.mixedconfig.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:com/spring/chapter2/mixedconfig/soundsystem/cd-config.xml")
@Import({ CDPlayerConfig.class, CDConfig.class })
public class SoundSystemConfig {

}
