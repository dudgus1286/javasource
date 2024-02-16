package util;

import java.util.Scanner;

// java.lang
// java.util

// java.util.Scanner : 화면, 파일, 문자열 같은 입력 소스로부터 문자 데이터 읽어오기
// System.in : 키보드
// System.out : 화면

public class ScannerEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] argArr = null;

    while (true) {
      String prompt = ">>";
      System.out.println(prompt);

      String input = sc.nextLine();

      input = input.trim();
      // 정규식(Regular expression) : regExp
      argArr = input.split(" +"); // " +"(공백+) => 공백이 최소 1 ~ 무제한이 있음을 뜻함
      // "Hello           World" 라고 입력했을 시 가운데 들어간 여러개의 공백을 잡아냄

      String command = argArr[0].trim();

      if ("".equals(command)) continue;

      command = command.toLowerCase();

      if (command.equals("q")) {
        System.exit(0);
      } else {
        for (int i = 0; i < argArr.length; i++) {
          System.out.println(argArr[i]);
        }
      }
    }
  }
}
