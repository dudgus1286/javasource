package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ioEx {

  public static void main(String[] args) {
    // 사용자에게 입력받기 => q 문자열이 입력되면 종료
    // 사용자한테 입력받은 문자 파일(FileWriter, BufferedWrite) 에 쓰기

    try (
      Scanner sc = new Scanner(System.in);
      FileWriter fw = new FileWriter("c:\\temp\\test100.txt", true);
      BufferedWriter bw = new BufferedWriter(fw)
    ) {
      System.out.println("파일에 작성할 데이터를 입력하세요");
      System.out.println("작성을 중단하려면 q 를 입력하세요");
      String str = null;
      do {
        System.out.print(">> ");
        str = sc.nextLine();

        if (!str.equalsIgnoreCase("q")) {
          bw.write(str);
          bw.newLine();
        }
      } while (!str.equals("q"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
