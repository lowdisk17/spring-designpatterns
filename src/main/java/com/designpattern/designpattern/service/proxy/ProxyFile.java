package com.designpattern.designpattern.service.proxy;

public class ProxyFile implements File {

  private RealFile realFile;

  public ProxyFile (String name) {
    this.realFile = new RealFile(name);
  }

  @Override
  public void preview() {
    realFile.preview();
  }
  
}
