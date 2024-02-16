package util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenEx3 {

  public static void main(String[] args) {
    //키보드로 문자열을 읽어서 분리하는 프로그램 작성
    // 입력) 아빠/엄마/수연 ... : /를 기준으로 분리
    Scanner sc = new Scanner(System.in);
    System.out.println("/로 구분하여 입력하시오 >>> ");
    String input = sc.nextLine();
    StringTokenizer st = new StringTokenizer(input, "/");

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
