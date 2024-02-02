package array;

import java.util.Arrays;

public class ArrayEx8 {

  public static void main(String[] args) {
    //45개의 정수 값을 지정하기 위한 배열 생성
    int numArr[] = new int[45], var1 = 1;

    // 배열에 1 ~ 45의 정수 담기
    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = i + 1;
    }

    System.out.println(Arrays.toString(numArr));
    int tmp = 0;

    // i : 자리를 바꿀 대상 위치번호
    for (int i = 0; i < 6; i++) {
      // 무작위 숫자 0~44
      int num = (int) (Math.random() * 45);
      // 임시 숫자 저장용 변수
      tmp = numArr[i];

      numArr[i] = numArr[num];
      numArr[num] = tmp;
    }

    System.out.println(Arrays.toString(numArr));
  }
}
