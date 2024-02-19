package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Iterater 인터페이스
 * 컬렉션에 저장된 요소를 접근하는 데 사용되는 인터페이스
 *
 */
public class IteratorEx {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    // List에서의 요소 접근
    for (int i = 0; i < list.size(); i++) {
      String item = list.get(i);
    }
    for (String item : list) {
      System.out.println(item);
    }

    Set<String> set = new HashSet<>();
    // Set에서의 요소 접근
    for (int i = 0; i < set.size(); i++) {
      // 순서라는 개념이 없는 Set에서는 get() 메소드 사용불가
      // String item = set.get(i);
    }
    for (String item : set) {
      System.out.println(item); // 무작위로 뽑는 거라 가능
    }
    // Map 의 경우 get(key)
    // 데이터는 담는 구조에 따라 접근방식이 다름
    // 컬렉션 요소를 읽어오는 방법 표준화 => iterator
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
