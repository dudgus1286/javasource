package array;

import java.util.Arrays;

public class ArrayEx4 {

  public static void main(String[] args) {
    // 문자만 값 출력, 나머지 데이터 주소

    // 'a', 'b', 'c', 'd' char 1차원 선언, 생성
    char chArr[] = { 'a', 'b', 'c', 'd' };
    System.out.println(chArr);

    int intArr[] = { 78, 88, 9, 86, 55 };
    System.out.println(intArr); // 데이터 주소
    System.out.println(Arrays.toString(intArr)); // 대괄호 안에 데이터 값 출력, 위에 import ... 필요

    // 배열 복사
    int temp[] = new int[intArr.length * 2];
    // i < temp.length 였을 때 오류
    // : ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    for (int i = 0; i < intArr.length; i++) {
      temp[i] = intArr[i];
    }
    intArr = temp;
    System.out.println("복사 후 " + Arrays.toString(intArr));

    // "abc", "def", "hij", "apple"
    String strArr[] = { "abc", "def", "hij", "apple" };
    System.out.println(strArr);
    System.out.println(Arrays.toString(strArr));
  }
}
