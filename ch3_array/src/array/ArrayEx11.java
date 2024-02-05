package array;

import java.util.Arrays;

public class ArrayEx11 {

  public static void main(String[] args) {
    // String 배열
    String[] names = { "Kim", "Park", "Choi" };

    for (String str : names) {
      System.out.println(str);
    }

    for (int i = 0; i < names.length; i++) {
      String str = names[i];

      for (int j = 0; j < str.length(); j++) {
        char ch = str.charAt(j); // 문자열에서 괄호 안 숫자에 해당하는 문자 출력 메소드
        System.out.printf("str.charAt(%d) : %c\n", j, ch);
      }
    }

    String src = "ABCDE";

    char[] chArr = src.toCharArray(); // 문자열을 캐릭터(문자) 배열로 바꾸는 메소드
    System.out.println(chArr);
  }
}
