package com.spring.chapter2.xmlconfig.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * setter注入 p-命名空间 将字面量注入到属性中,当含有集合时，除了用<property>标签外，还可以用Spring util-命名空间提供的元素
 * 
 * <p>
 * 格式： p:属性名="所注入字面量"
 * </p>
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class PNamespaceWithUtilNamespaceTest {
	@Autowired
	private MediaPlayer player;

	@Test
	public void play() {
		player.play();
	}
}
