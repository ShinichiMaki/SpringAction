package com.spring.chapter2.mixedconfig.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 多个配置类 进行装配bean
 * 
 * <p>
 * <ui>
 * <li>1、在spring同一个配置文件中，不能存在id相同的两个bean，否则会报错。</li>
 * <li>2、在两个不同的spring配置文件中，可以存在id相同的两个bean，启动时，不会报错。这是因为spring
 * ioc容器在加载bean的过程中，类DefaultListableBeanFactory会对id相同的bean进行处理：后加载的配置文件的bean，覆盖先加载的配置文件的bean。DefaultListableBeanFactory类中，有个属性allowBeanDefinitionOverriding，默认值为true，该值就是用来指定出现两个bean的id相同的情况下，如何进行处理。如果该值为false，则不会进行覆盖，而是抛出异常。</li></ui>
 * </p>
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class ImportJavaConfigTest {
	@Autowired
	private MediaPlayer player;

	@Test
	public void play() {
		player.play();
	}
}
