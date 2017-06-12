package com.spring.chapter2.javaconfig.soundsystem;

public class FunkDisc implements CompactDisc {

	private String title = "In the end";
	private String artist = "Linken Park Band";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
