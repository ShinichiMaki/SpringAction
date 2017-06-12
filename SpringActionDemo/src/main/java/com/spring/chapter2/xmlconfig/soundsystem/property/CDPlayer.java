package com.spring.chapter2.xmlconfig.soundsystem.property;

import com.spring.chapter2.xmlconfig.soundsystem.CompactDisc;
import com.spring.chapter2.xmlconfig.soundsystem.MediaPlayer;

public class CDPlayer implements MediaPlayer {

	private CompactDisc compactDisc;

	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}

	public void play() {
		// TODO Auto-generated method stub
		compactDisc.play();
	}
}
