package com.lld.adapter.designpattern;

public class AdvancedMediaPlayer implements MediaPlayer {

	private MediaAdapter adapter;

	@Override
	public void play(String type, String fileName) {
		if (type.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file: " + fileName);
		}
		// mediaAdapter is providing support to play other file formats
		else if (type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("mkv")) {
			adapter = new MediaAdapter(type);
			adapter.play(type, fileName);
		} else {
			System.out.println("Invalid media. " + type + " format not supported");
		}
	}

}
