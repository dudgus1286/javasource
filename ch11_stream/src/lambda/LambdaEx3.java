package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// java.util.function 패키지
// 함수형 인터페이스 제공

// 메소드
// 매개변수 없고, 반환값도 없음 : void run() ==> java.lang.Runnable
// 매개변수 없고, 반환값 있음 : int run() ==> Supplier<T> T get()
// 매개변수 있고, 반환값 없음 : void run(int a ...) ==> Consumer<T> void accept(T t)
// 매개변수 있고, 반환값도 있음 : String run(int a ...) ==> Function<T, R> R apply(T t)
// 조건식 표현할 때 사용되는 메소드 : boolean test(int a) ==> Predicate<T> boolean test(T t)

// Bi~~ : 매개변수의 개수가 2개인 함수형 인터페이스
// void run(int a, String str) ==> BiConsumer<T, U> void accept(T t, U u)
// int run(String a, float f) ==> Function<T, U, R> R apply(T t, U u)
// boolean test(int a, double d) ==> BiPredicate<T, U> boolean test(T t, U u)

// Function<T, R> 과 같은 역할
// 매개변수 타입과 반환 타입이 모두 일치할 경우 사용
// UnaryOperator<T> T apply(T t)
// BinaryOperator<T> T apply(T t1, T t2)

// 기본형을 이용하는 함수형 인터페이스
// ToIntFunction<T>  int applyAsInt(T t)

public class LambdaEx3 {

  public static void main(String[] args) {
    Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
    System.out.println("1~100 임의의 수 " + s.get());

    Consumer<Integer> c = i -> System.out.println(i);
    c.accept(10);

    Function<Integer, Integer> f = t -> t / 10 * 10;
    System.out.println(f.apply(10));

    Predicate<Integer> p = i -> i % 2 == 0;
    System.out.println(p.test(10));

    // "5698" ==> 5698 + 30 ==>
    Function<String, Integer> f2 = str -> Integer.parseInt(str) + 30;
    System.out.println(f2.apply("5698"));

    // 문자열의 길이가 0인지 판별
    Predicate<String> p2 = str2 -> str2.length() == 0;
    System.out.println(p2.test(""));

    // 문자열 리턴
    Supplier<String> supplier = () -> "안녕하세요";
    System.out.println(supplier.get());

    // 문자열 받아서 문자열 출력
    Consumer<String> consumer = str3 -> System.out.println(str3);
    consumer.accept("반갑습니다.");

    // 두 개의 숫자를 받아서 더하기 한 후 리턴
    BiFunction<Integer, Integer, Integer> bif = (x, y) -> x + y;
    System.out.println(bif.apply(50, 75));

    // 두 개의 숫자를 받아서 큰 값 출력
    BiConsumer<Integer, Integer> bic = (x, y) ->
      System.out.println(x > y ? x : y);
    bic.accept(10, 5);

    // 두 개의 문자열을 받아서 연결 후 하나의 문자열로 리턴
    BiFunction<String, String, String> bif2 = (str1, str2) ->
      str1.concat(" " + str2);
    System.out.println(bif2.apply("아침", "밥"));
  }
}
