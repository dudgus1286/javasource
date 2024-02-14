package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 자동 자원 반환 - try-with-resources 문
public class TryWithResourceEx {

  public static void main(String[] args) {
    // FileInputStream fis = null;
    // try {
    //   fis = new FileInputStream("Test.txt"); // 파일에서 데이터를 찾는 명령어
    // } catch (FileNotFoundException e) {
    //   e.printStackTrace();
    // } finally {
    //   if (fis != null) {
    //     try {
    //       fis.close(); // 명령어를 끝내는 문
    //     } catch (IOException e) {
    //       e.printStackTrace();
    //     }
    //   }
    // } - 아래와 동일

    // try () 안에 close할 객체들이 들어감
    // 자동으로 닫아줌(finally를 명시하지 않아도 됨)
    try (FileInputStream fis = new FileInputStream("Test.txt")) {
      fis.read();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
