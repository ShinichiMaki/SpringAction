package com.spring.chapter2.xmlconfig.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 构造器注入 c-命名空间 将对象的引用注入到构造器中
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CNamespaceReferenceTest {

	@Autowired
	private MediaPlayer player;

	@Test
	public void test() {
		player.play();
	}

}
