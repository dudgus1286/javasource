package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

// FileInputStream 만 사용 시 : 248345, + BufferedInputStream : 2554
// 배열 사용 시: 104 , + BufferedInputStream + 배열 둘 다 사용 시: 73
public class BufferedStreamEx2 {

  public static void main(String[] args) {
    // InputStream 사용 시
    try (FileInputStream fis = new FileInputStream("c:\\temp\\kbs_1.mp4")) {
      byte data[] = new byte[4096];
      long start = System.currentTimeMillis();
      while (fis.read(data) != -1) {}
      long end = System.currentTimeMillis();
      System.out.println("FileInputStream 만 사용 시 " + (end - start));
    } catch (Exception e) {
      e.printStackTrace();
    }
    // BufferedInputStream 사용시
    try (
      FileInputStream fis = new FileInputStream("c:\\temp\\kbs_1.mp4");
      BufferedInputStream bis = new BufferedInputStream(fis)
    ) {
      byte data[] = new byte[4096];
      long start = System.currentTimeMillis();
      while (bis.read(data) != -1) {}
      long end = System.currentTimeMillis();
      System.out.println(
        "FileInputStream + BufferedInputStream 사용 시 " + (end - start)
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
