package com.lld.adapter.designpattern;

public class MkvPlayer implements VideoPlayer {

	@Override
	public void playMP4Video(String fileName) {
		// Do nothing

	}

	@Override
	public void playMKVVideo(String fileName) {
		System.out.println("Playing a Mkv video : " + fileName);
	}

}
