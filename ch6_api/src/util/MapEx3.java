package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx3 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    // 요소 추가
    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송중기");
    map.put("id_0126", "현빈");

    // Iterator 사용 시
    // Iterator로 하려면 먼저 List, Set 구조여야 함

    // key 값을 Set 으로 가져오기
    Set<String> set = map.keySet();
    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      // Map 의 key만 Set으로 만들고 Set 구조의 key 값으로 value를 불려냄
      String key = iterator.next();
      String value = map.get(key);
      System.out.println(key + ": " + value);
    }

    System.out.println();

    // Map => Map.Entry(내부 인터페이스의 형태로 가지고 있음)
    // Map.Entry 를 다시 Set 구조로 들어서 key, value 둘 다 담음
    Set<Entry<String, String>> entries = map.entrySet();
    Iterator<Entry<String, String>> iterator2 = entries.iterator();
    while (iterator2.hasNext()) {
      Entry<String, String> entry = iterator2.next();
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
