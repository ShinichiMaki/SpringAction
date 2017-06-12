package com.spring.chapter1.knight;

import java.io.PrintStream;

public class Minstrel {

	private PrintStream stream;

	/**
	 * 构造函数
	 * 
	 * @param stream
	 */
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}

	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so brave!");
	}

	public void singAfterQuest() {
		stream.println("Tee hee hee, the brave knight " + "did embark on a quest!");
	}

}
