package com.spring.chapter2.mixedconfig.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 在XML文件中引用JavaConfig配置
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration("classpath:com/spring/chapter2/mixedconfig/soundsystem/cdplayer-config.xml")
// @ContextConfiguration(locations = {
// "classpath:com/spring/chapter2/mixedconfig/soundsystem/cdplayer-config.xml",
// "classpath:com/spring/chapter2/mixedconfig/soundsystem/cd-config.xml" })
@ContextConfiguration("classpath:com/spring/chapter2/mixedconfig/soundsystem/soundsystem-config.xml")
public class ImportXmlConfigTest {
	@Autowired
	private MediaPlayer player;

	@Test
	public void play() {
		player.play();
	}
}
