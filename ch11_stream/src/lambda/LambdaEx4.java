package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

// 컬렉션 프레임워크 함수형 인터페이스를 매개변수로 사용하는 메소드 존재

public class LambdaEx4 {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }

    // list 값 사용하려면
    // for( int i = 0; i<list.size(),i++ ),
    // for(int i : list)
    // forEach(Consumer<? super T> action)

    // forEach(Consumer<? super T> action)
    //  Consumer<Object, Integer> con = i -> System.out.println(i);
    list.forEach(i -> System.out.println(i));

    // list에서 2 또는 3의 배수를 제거
    // removeIf(Predicate<? super E> filter)
    // list.removeIf(null);

    // list.forEach(i -> {
    //   if (i % 2 == 0 || i % 3 == 0) {
    //     list.remove(i);
    //   }
    // });

    list.removeIf(i2 -> i2 % 2 == 0 || i2 % 3 == 0);

    // list의 각 요소에 10 곱하기
    list.replaceAll(i -> i * 10);
    System.out.println(list); // 결과값: [10, 50, 70] / 0~9까지의 숫자 중 2의 배수, 3의 배수 삭제 후 *10

    Map<String, String> map = new HashMap<>();
    map.put("1", "1");
    map.put("2", "2");
    map.put("3", "3");
    map.put("4", "4");

    // map 의 모든 요소를 {key, value} 출력
    map.forEach((k, v) -> System.out.printf("{%s, %s}\n", k, v));
  }
}
