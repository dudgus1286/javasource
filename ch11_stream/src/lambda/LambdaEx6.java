package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

// 메소드 참조
// 람다식을 더욱 간결하게 사용하는 방법
// 람다식이 하나의 메소드만 호출하는 경우에 사용할 수 있다
// 클래스이름::메소드명 형식

public class LambdaEx6 {

  public static void main(String[] args) {
    // "5698" ==> 5698 + 30 ==>
    // Function<String, Integer> f2 = str -> Integer.parseInt(str) + 30;
    Function<String, Integer> f2 = Integer::parseInt;

    // 두 개의 문자열을 받아서 문자열이 동일한지 리턴
    // BiFunction<String, String, Boolean> f1 = (s1, s2) -> s1.equals(s2);
    BiFunction<String, String, Boolean> f1 = String::equals;

    Supplier<Student> s = Student::new;
  }
}
