package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Arrays : 배열을 다루는데 유용한 메소드가 정의되어 있음
// static 요소로 구성

public class ArraysEx {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 0, 4, 5 };
    System.out.println(Arrays.toString(arr));

    int[] arr2 = new int[6];
    Arrays.fill(arr2, 9);
    System.out.println(Arrays.toString(arr2));

    System.out.println("배열 요소 비교 " + Arrays.equals(arr, arr2));

    // Arrays.asList(배열) : 배열을 List 구조로 변경
    List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
    List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
    // UnsupportedOperationException : 반환된 List 크기를 변경할 수 없음 (런타임 예외)
    // list.add(6);
    // 기존 배열 + 새로 추가할 수 있게 하려면 기존 배열을 new ArrayList<>()의 괄호에 감싸서 새로이 생성
    List<Integer> list3 = new ArrayList<>(
      Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 })
    );
    list3.add(6);

    // sort() : 오름차순 정렬
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    // linear search : 순차 검색(첫 번째 요소부터 하나씩 순서대로 검색/정렬 상관없음)
    // binarySearch(): 이진 검색(정렬(오름차순)된 상태여야 함) 못 찾으면 음수로 결과 출력
    System.out.println("2의 위치 " + Arrays.binarySearch(arr, 2));

    // 내림차순 정렬
    // Arrays.sort(arr, Comparator.reverseOrder()); // 컴파일러 예외
    // T[] : 배열이 객체 타입이라는 의미
    // Map<K, V> 에서의 K, V ==> 객체 타입
    // Collection<E> 에서의 E ==> 객체 타입
    // int 객체타입으로 변환 ==> Integer
    Integer arr3[] = { 27, 55, 15, 6, 9, 75 };
    Arrays.sort(arr3, Comparator.reverseOrder());
    System.out.println(Arrays.toString(arr3));

    String[] strArr = { "cat", "Dog", "lion", "tiger", "apple", "zoo" };
    Arrays.sort(strArr);
    System.out.println(Arrays.toString(strArr));
    Arrays.sort(strArr, Comparator.reverseOrder());
    System.out.println(Arrays.toString(strArr));
  }
}
