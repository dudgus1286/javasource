package util;

import java.util.StringTokenizer;

public class StringTokenEx2 {

  public static void main(String[] args) {
    String str = "This is a test";

    // 기준을 주지 않을 경우 스페이스바 한 번 기준으로 잘라 줌
    StringTokenizer st = new StringTokenizer(str);
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    str = "x=100*(200+300)/2";
    StringTokenizer st2 = new StringTokenizer(str, "=*/+()", true);
    // returnDelims : true => 문자열을 나누는 기준 delim의 값을 받을 거냐? 예.
    // true 면 결과에 delim값이 반영됨
    while (st2.hasMoreTokens()) {
      System.out.println(st2.nextToken());
    }
  }
}
