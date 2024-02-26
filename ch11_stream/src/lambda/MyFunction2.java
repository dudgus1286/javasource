package lambda;

// 함수형 인터페이스
// 람다식을 포함(추상 메소드는 하나만 사용 가능)
// 람다식 == 익명 클래스 객체

@FunctionalInterface // == 함수 인터페이스
public interface MyFunction2 {
  void method(int x); // 인터페이스이기 때문에 public abstract 기본
  //   void print(); - 이미 하나의 추상 메소드가 있기 때문에 또 입력하면 오류
}
