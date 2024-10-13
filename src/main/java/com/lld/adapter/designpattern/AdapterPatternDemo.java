package com.lld.adapter.designpattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		System.out.println("About to start playing media files...");
		AdvancedMediaPlayer player = new AdvancedMediaPlayer();
		player.play("mp3", "test_song_1.mp3");
		player.play("wav", "test_song_2.wav");
		player.play("mkv", "movie1.mkv");
		player.play("mp4", "new_movie.mp4");
		player.play("mp5", "latest_movie.mp5");
		System.out.println("Done with playing all the media files..");
	}

}
