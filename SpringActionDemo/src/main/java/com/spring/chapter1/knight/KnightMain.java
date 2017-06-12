package com.spring.chapter1.knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext(
		 * "/com/spring/chapter1/knight/knight.xml");
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/chapter1/knight/minstrel.xml");
		// Knight knight = context.getBean(Knight.class);
		// Knight knight = (Knight) context.getBean("knight");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

}
