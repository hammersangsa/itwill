package com.day21;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Test3 {
  private final static String IMAGE_URL = "https://www.google.com/favicon.ico";
  public static void main(String[] args) {
    try {
      // if you want to get png or jpg ... you can do it
      URL url = new URL(IMAGE_URL);
      String extension = IMAGE_URL.substring(IMAGE_URL.indexOf('.') + 1);

      BufferedImage image = ImageIO.read(url);
      File file = new File("test.ico");

      ImageIO.write(image, extension, file);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}