package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map 인터페이스
 * key, value 를 하나의 쌍으로 묶어서 저장
 * key는 중복 불가, value는 중복 가능
 * 내부 인터페이스 Map.Entry
 * 구현 클래스: Hashtable, HashMap, TreeMap
 */
public class MapEx1 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    // 요소 추가
    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송중기");
    map.put("id_0126", "현빈");

    System.out.println(
      "key 에 해당하는 value 가져오기 get() " + map.get("id_0125")
    );
    System.out.println(
      "지정한 값에 해당하는 key 존재여부 확인 containsKey() " +
      map.containsKey("id_0125")
    );
    System.out.println(
      "지정한 값에 해당하는 value 존재여부 확인 containsKey() " +
      map.containsValue("송중기")
    );
    System.out.println("map 요소 크기 size() " + map.size());
    System.out.println("map 요소 삭제 remove() " + map.remove("id_0126")); // 값에 해당하는 것 제거

    // key 값 모두 가져오기
    Set<String> keys = map.keySet(); // key를 Set 구조로 가져오기
    System.out.println(keys);

    // value 값 모두 가져오기
    Collection<String> values = map.values(); // value를 Collection 구조로 가져오기
    System.out.println(values);
  }
}
