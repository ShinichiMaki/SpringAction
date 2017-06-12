package com.spring.chapter2.xmlconfig.soundsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/spring/chapter2/xmlconfig/soundsystem/ConstructorArgCollectionTest-context.xml");
		MediaPlayer mediaPlayer = (MediaPlayer) context.getBean("cdPlayer");
		mediaPlayer.play();
		context.close();
	}

}
