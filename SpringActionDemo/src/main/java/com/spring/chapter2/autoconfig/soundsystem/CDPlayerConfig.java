package com.spring.chapter2.autoconfig.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/**
 * 
 * @ComponentScan 默认扫描与配置类 相同包，查找该包及子包内带有@Component注解的类
 */
// @ComponentScan
@ComponentScan(basePackages = "com.spring.chapter2.autoconfig.soundsystem")
public class CDPlayerConfig {

}
