package com.spring.chapter2.xmlconfig.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * setter注入 p-命名空间 将对象的引用注入到属性中
 * 
 * <p>
 * 格式： p:属性名-ref="所注入bean的id"
 * </p>
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class PNamespaceRefTest {
	@Autowired
	private MediaPlayer player;

	@Test
	public void play() {
		player.play();
	}
}
