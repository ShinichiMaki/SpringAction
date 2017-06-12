package com.spring.chapter1.knight;

import java.io.PrintStream;

/**
 * 
 * @author Administrator
 *
 */
public class SlayDragonQuest implements Quest {

	private PrintStream stream;

	/**
	 * 构造函数
	 * 
	 * @param stream
	 */
	public SlayDragonQuest(PrintStream stream) {
		// TODO Auto-generated constructor stub
		this.stream = stream;
	}

	public void embark() {
		// TODO Auto-generated method stub
		stream.println("Embarking on quest to slay the dragon!");
	}
}
