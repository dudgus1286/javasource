package util;

import java.util.StringTokenizer;

// java.util.StringTokenizer : 긴 문자열을 지정된 구분자를 기준으로 토큰이라는 여러 개의 문자열로 분리
// 구분자는 단 하나의 문자만 사용 가능
public class StringTokenEx {

  public static void main(String[] args) {
    String result = "100,200,300,400";
    String[] delimiter = result.split(",");
    for (String string : delimiter) {
      System.out.println(string);
    }

    StringTokenizer st = new StringTokenizer("100,200,300,400", ",");

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    String str = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
    StringTokenizer st3 = new StringTokenizer(str, ",|");
    while (st3.hasMoreTokens()) {
      System.out.println(st3.nextToken());
    }

    System.out.println();
    st3 = new StringTokenizer(str, "|");
    while (st3.hasMoreTokens()) {
      String token = st3.nextToken();
      StringTokenizer st4 = new StringTokenizer(token, ",");
      while (st4.hasMoreTokens()) {
        System.out.println(st4.nextToken());
      }
      System.out.println("-------------");
    }
  }
}
