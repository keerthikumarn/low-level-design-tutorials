package com.lld.adapter.designpattern;

public class MediaAdapter implements MediaPlayer {

	private VideoPlayer player;

	public MediaAdapter(String type) {
		if (type.equalsIgnoreCase("mp4")) {
			player = new Mp4Player();
		} else if (type.equalsIgnoreCase("mkv")) {
			player = new MkvPlayer();
		}
	}

	@Override
	public void play(String type, String fileName) {
		if (type.equalsIgnoreCase("mp4")) {
			player.playMP4Video(fileName);
		} else if (type.equalsIgnoreCase("mkv")) {
			player.playMKVVideo(fileName);
		}
	}

}
