package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* 컬렉션 프레임워크 : 데이터 군을 저장하는 클래스들을 표준화한 설계
    Collection
    List    Set (Collection 인터페이스를 상속함)
    Map
 * 
 * List(인터페이스) : 순서가 있는 데이터의 집합(데이터의 중복 허용)
 *  구현 클래스 - ArrayList, LinkedList, Stack, Vector ...
 *  고정 크기 => 크기 변경이 필요하다면 내부적으로 알아서 처리해줌
 * 
 * ArrayList 는 List 를 상속
 * ArrayList 클래스의 private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
 * 
 * 
 * ==> 배열과 동일한 개념 
 * 배열은 고정 크기(크기 변경 시 다른 배열 생성 후 옮기기)
 */

public class ArrayListEx {

  public static void main(String[] args) {
    // initial capacity 배열의 크기 설정하지 않으면 기본적으로 : 10
    List<Integer> list = new ArrayList<>(20); // 클래스명<타입명> 변수명 => 타입은 기본형 안 됨, 해당 타입만 넣음
    ArrayList<Integer> list0 = new ArrayList<>();
    list.add(75);
    list.add(68);
    list.add(35);
    list.add(45);
    list.add(55);
    list.add(65);

    // toString() 오버라이딩 여부 : O
    System.out.println(list);

    // 내림차순
    // list.sort(Comparator.reverseOrder());
    // 오름차순
    list.sort(Comparator.naturalOrder());
    System.out.println(list);

    System.out.println(list.toString());

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("Java");
    list2.add("JSP");
    list2.add("HTML");
    list2.add("CSS");
    list2.add("JAVASCRIPT");
    list2.add("PYTHON");

    // 메소드
    // 배열.length() 와 같음
    System.out.println("size() " + list2.size()); // ArrayList 에 저장된 객체 개수 : 6
    // 배열[3]
    System.out.println("get() " + list2.get(3)); // 지정된 위치에 있는 객체 반환 : "CSS"
    System.out.println("indexOf() " + list2.indexOf("Java")); // 지정된 객체가 저장된 위치 반환
    System.out.println("remove() " + list2.remove("Java")); // 지정된 객체와 맞는 객체 제거
    // boolean 으로 출력, ture면 삭제 완료, false면 삭제 못함
    System.out.println(list2);
    System.out.println("remove() " + list2.remove(2)); // 지정된 위치에 있는 객체 제거
    // 제거되는 객체 반환
    System.out.println(list2);

    // ArrayList ==> 배열로 변환
    Object[] arr = list2.toArray();
    for (Object object : arr) {
      System.out.println(object);
    }

    // 배열 ==> ArrayList로 변환
    // Arrays 클래스
    int[] arr2 = { 3, 5, 6, 7, 9 };
    List<int[]> list3 = Arrays.asList(arr2);
    // ArrayList<int[]> list4 = Arrays.asList(arr2); 로는 안됨

    System.out.println("isEmpty() " + list2.isEmpty()); // ArrayList 가 비어 있는지 확인
    list2.set(1, "Oracle"); // 특정 위치에 객체 추가(기존에 그 자리에 있던 객체는 사라짐)
    System.out.println(list2);
  }
}
