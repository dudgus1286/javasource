package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Collections 클래스 ( != Collection 인터페이스 )
// 컬렉션(List, Set, Map)과 관련된 메소드 제공
// static 요소로만 구성
// 동기화, fill(), copy(), sort(), binarySearch() 등의 유용한 메소드 제공

public class CollectionsEx {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);

    // 오른쪽으로 두 칸씩 이동
    Collections.rotate(list, 2); // [4, 5, 1, 2, 3]
    System.out.println(list);

    Collections.swap(list, 0, 2); // [1, 5, 4, 2, 3] 0번 자리와 2번 자리의 데이터 위치를 맞바꿈
    System.out.println(list);

    Collections.sort(list, Collections.reverseOrder()); // [5, 4, 3, 2, 1] 내림차순 정렬
    // list.sort(Comparator.reverseOrder()); 와 같은 기능
    Collections.sort(list, Comparator.naturalOrder()); // 오름차순 정렬의 경우
    System.out.println(list);

    // binarySearch() : 오름차순 정렬이 되어 있어야 함, 못 찾으면 음수로 결과 출력
    System.out.println(
      "3이 저장된 위치 : " + Collections.binarySearch(list, 3)
    ); // 3이 저장된 위치 : 2

    System.out.println("최대값 : " + Collections.max(list));
    System.out.println("최소값 : " + Collections.min(list));

    // 리스트를 하나의 값으로 채움
    Collections.fill(list, 9); // [9, 9, 9, 9, 9]
    System.out.println(list);
  }
}
