package steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 같은 종류의 데이터 다룰 때 사용했던 방법
// 배열, List, Set, Map
// for, Iterator
// list.sort(), Collections.sort()
// Arrays.sort()

// stream
// 같은 기능의 메소드들이 중복, 컬렉션이나 배열을 다루는 방법이 제각각 이것을 해결하기 위해 사용
// 데이터 소스를 추상화하고, 자주 사용하는 메소드들을 정의해 놓음
// 데이터 소스를 변경하지 않음(데이터를 읽기만 함)
// 일회용임(스트림 한 번 사용하면 닫힘)
// 작업을 내부 반복으로 처리

public class FromArrayEx1 {

  public static void main(String[] args) {
    // 기존방법 - 배열, 리스트 여부에 따라 정렬 방법이 다르고 원본 자체가 정렬이 일어남
    String[] strArr = { "ad", "abc", "aaa" };
    List<String> list = Arrays.asList(strArr);
    // Arrays.sort(strArr);
    // Collections.sort(list);

    // System.out.println(Arrays.toString(strArr));
    // System.out.println(list); // 원본 자체의 순서가 변경

    // Stream 사용 방식 - 데이터 소스는 다르나 정렬/출력 방법 동일
    Stream<String> stream1 = Arrays.stream(strArr);
    Stream<String> stream2 = list.stream();

    stream1.sorted().forEach(item -> System.out.println(item));
    stream2.sorted().forEach(item -> System.out.println(item));

    // 정렬된 결과가 필요하다면
    List<String> sortedList = stream2.sorted().collect(Collectors.toList());

    System.out.println("정렬 후");
    System.out.println(Arrays.toString(strArr));
    System.out.println(list);
  }
}
