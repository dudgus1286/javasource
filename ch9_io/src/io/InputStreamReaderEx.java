package io;

import java.io.FileInputStream;
import java.io.InputStreamReader;

// 보조스트림: 스트림의 기능 보완
// 자체적으로 데이터 입출력 기능은 없음

// 1) 바이트 기반
// BufferedInputStream / BufferedOutputStream : 버퍼를 이용한 입출력 향상
// DataInputSteam / DataOutputStream : 기본형 단위로 데이터를 처리
//                  PrintStream : 버퍼 사용, print(), println(), printf()
// 2) 문자 기반
// BufferedReader / BufferedWriter : 버퍼를 이용한 입출력 향상

// 브릿지 스트림
// InputStreamReader / OutputStreamReader
// InputStreamReader : 바이트 스트림 => 문자 스트림으로 변환
// OutputStreamReader : 문자 스트림 => 바이트 스트림

public class InputStreamReaderEx {

  public static void main(String[] args) {
    try (
      FileInputStream fis = new FileInputStream("c:\\temp\\test1.txt");
      InputStreamReader ir = new InputStreamReader(fis)
    ) {
      int data = 0;

      // byte 기반
      //   byte b[] = new byte[1024];
      //   while ((data = fis.read()) != -1) {
      //     System.out.print((char) data);
      //   }

      // 문자 데이터 기반
      char cbuf[] = new char[1024];
      while ((data = ir.read(cbuf)) != -1) {
        System.out.println(cbuf);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
