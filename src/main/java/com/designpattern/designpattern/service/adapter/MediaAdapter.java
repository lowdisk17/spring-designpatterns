package com.designpattern.designpattern.service.adapter;

public class MediaAdapter implements MediaPlayer {

  private String filename;
  private MusicPlayer musicPlayer;

  public MediaAdapter (String filename) {
    this.filename = filename;
  }

  @Override
  public void play() {
    if (filename.contains("mp3")) {
      musicPlayer = new MusicPlayer(this.filename);
      musicPlayer.play();
    } else if (filename.contains("vlc")) {
      System.out.println("Video playing: " + this.filename);
    }
  }
  
}
