package com.lld.adapter.designpattern;

public class Mp4Player implements VideoPlayer {

	@Override
	public void playMP4Video(String fileName) {
		System.out.println("Playing a MP4 video : " + fileName);
	}

	@Override
	public void playMKVVideo(String fileName) {
		// Do nothing
	}

}
