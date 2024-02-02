package array;

import java.util.Arrays;

public class ArrayEx5 {

  public static void main(String[] args) {
    // 배열명 arr 선언, 생성 1 2 3 4 5
    int arr[] = new int[] { 1, 2, 3, 4, 5 };

    // 기존 배열 arr 의 2배 크기의 새로운 배열 생성 tmp
    int tmp[] = new int[arr.length * 2];

    for (int i = 0; i < arr.length; i++) {
      tmp[1] = arr[i];
    }

    // 시스템 메소드를 이용한 배열 복사
    int tmp2[] = new int[arr.length * 2];
    System.arraycopy(arr, 0, tmp2, 5, arr.length); // [0, 0, 0, 0, 0, (다섯번째 이후로 복붙)]
    System.out.println(Arrays.toString(tmp2));
  }
}
