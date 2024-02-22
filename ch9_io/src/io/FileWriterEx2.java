package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.nio.charset.Charset;

public class FileWriterEx2 {

  public static void main(String[] args) {
    // 현재 폴더에서 java 소스 읽은 후 다른 파일에 출력

    // FileEx1.java 읽기 (경로: .\ch9_io\src\io\FileEx1.java )
    // c:\\temp\\output2.txt 로 출력

    try (
      Reader reader = new FileReader(
        ".\\ch9_io\\src\\io\\FileEx1.java",
        Charset.forName("utf-8")
      );
      FileWriter fw = new FileWriter("c:\\temp\\output2.txt")
    ) {
      int data = 0;
      //   while ((data = reader.read()) != -1) { // data에 읽은 데이터가 담김
      //     fw.write(data);
      char cbuf[] = new char[8192]; // 배열을 쓰는 게 더 빠름
      while ((data = reader.read(cbuf)) != -1) { // 여기서의 data는 배열에서 읽은 개수가 들어옴
        fw.write(cbuf);
      }
      //   char ch[] = new char[1024];
      //   reader.read(ch);
      //   fw.write(ch);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
