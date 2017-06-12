package com.spring.chapter2.xmlconfig.soundsystem;

public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;

	/**
	 * 构造函数
	 * 
	 * @param title
	 * @param artist
	 */
	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
