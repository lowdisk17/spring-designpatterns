package com.designpattern.designpattern.service.adapter;

public class MusicPlayer {

  private String filename;

  public MusicPlayer (String filename) {
    this.filename = filename;
  }

  public void play () {
    System.out.println("Music playing: " + filename);
  }

}
