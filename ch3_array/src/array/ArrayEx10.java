package array;

import java.util.Arrays;

// 알고리즘 - 정렬 (선택정렬, 버블정렬)
public class ArrayEx10 {

  public static void main(String[] args) {
    int arr[] = { 25, 85, 55, 65, 5, 3 };
    // int temp = 0;

    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = 0; j < arr.length; j++) {
    //     if (arr[i] < arr[j]) {
    //       temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }
    // System.out.println(Arrays.toString(arr));

    // 자바가 제공하는 sort
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
