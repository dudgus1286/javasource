package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

// java.io.* : io(input/output)
// 기본 input : keyboard 입력
// 기본 output : 화면 출력

//스트림:입출력을 수행할 때 어느 한 쪽에서 다른 쪽으로 데이터 전달 시 두 대상을 연결하는 통로 같은 개념
// 단반향만 가능(입력, 출력 => 2 개의 스트림 필요)
// 1. 바이트 기반 스트림 (문자, 이미지, 동영상 ...)
// InputStream(추상 클래스) : 입력 스트림 부모
// OutputStream(추상 클래스) : 출력 스트림 부모
// 추상 클래스이기 때문에 직접 new InputStream(), OutputStream() 불가능

// 2. 문자 기반 스트림 (문자만)
// Reader(추상)
// Writer(추상)

public class InputStreamEx1 {

  public static void main(String[] args) {
    InputStream in = System.in; // 기본값은 키보드 입력, 직접 명시 가능
    // in.read() : 한 바이트 씩 읽어서 int로 리턴(byte로 리턴X)
    // in.read(byte[] b) : byte 배열로 읽어와서 읽어온 byte를 int로 리턴
    // in.read(byte[] b, 0, 100) : byte 배열로 읽어와서 특정 위치의 데이터만 int로 리턴
    // (입력 스트림에서 100byte를 읽어와서 0번 위치부터 저장)
    OutputStream out = System.out; // 기본값은 화면 출력, 직접 명시 가능
    // out.write(byte[] b);
    // out.write(int);
    // out.write(byte[] b, 0, 100);

    try {
      // 한 바이트만 입력 시
      //   int input = in.read();
      //   // System.out.println((char) input);
      //   out.write(input);

      // 여러 바이트 입력 시
      //   int input = 0;
      //   while ((input = in.read()) != -1) {
      //        // System.out.println((char) input);
      //     out.write(input);
      //   }

      // 바이트 배열로 입력
      byte b[] = new byte[100];
      in.read(b);
      // System.out.println(Arrays.toString(b));
      // 결과값: [97, 98, 99, 100, 13, 10, 0, 0, 0, 0, ... 백 번째 위치까지]
      out.write(b); // 결과값: abcd

      in.close();
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
