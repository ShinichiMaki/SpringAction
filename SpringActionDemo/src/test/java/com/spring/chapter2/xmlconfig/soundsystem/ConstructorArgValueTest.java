package com.spring.chapter2.xmlconfig.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 构造器注入,通过constructor-arg标签传入参数,参数类型为 字面量
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ConstructorArgValueTest {
	@Autowired
	private MediaPlayer player;

	@Test
	public void play() {
		player.play();
	}
}
