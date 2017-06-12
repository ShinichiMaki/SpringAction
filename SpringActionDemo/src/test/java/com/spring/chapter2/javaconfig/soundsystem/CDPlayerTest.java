package com.spring.chapter2.javaconfig.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 通过JavaConfig的方式注入Bean
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	private MediaPlayer player;

	@Test
	public void play() {
		player.play();
	}

	@Test
	public void testConfig() {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		CompactDisc c1 = annotationContext.getBean("compactDisc", SgtPeppers.class);
		CompactDisc c2 = annotationContext.getBean("compactDisc1", FunkDisc.class);
		c1.play();
		c2.play();
		annotationContext.close();
	}
}
