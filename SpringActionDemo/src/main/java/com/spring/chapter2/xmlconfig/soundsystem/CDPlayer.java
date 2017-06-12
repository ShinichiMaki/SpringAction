package com.spring.chapter2.xmlconfig.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	/**
	 * 构造函数
	 * 
	 * @param cd
	 */
	@Autowired
	public CDPlayer(CompactDisc cd) {
		// TODO Auto-generated constructor stub
		this.cd = cd;
	}

	public void play() {
		// TODO Auto-generated method stub
		cd.play();
	}
}
