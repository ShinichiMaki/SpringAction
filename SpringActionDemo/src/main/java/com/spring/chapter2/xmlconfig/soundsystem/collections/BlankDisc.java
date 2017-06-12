package com.spring.chapter2.xmlconfig.soundsystem.collections;

import java.util.List;

import com.spring.chapter2.xmlconfig.soundsystem.CompactDisc;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;

	/**
	 * 构造函数
	 * 
	 * @param title
	 * @param artist
	 * @param tracks
	 */
	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}

}
