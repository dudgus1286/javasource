package interfacetest;

// interface
// 모든 멤버 변수는 public static final 이어야 함
// 모든 멤버 메소드는 무조건 자동으로 public abstract 임 (abstract 생략 가능)
// 추상클래스보다 추상화가 높은 상태(기초 설계도)
// 여러 개 구현 가능
// - public class 클래스명 implements 인터페이스클래스1, 인터페이스클래스2
// - public class 클래스명 extends 부모클래스 implements 인터페이스클래스1, 인터페이스클래스2
//          (단일상속만 되는 부모-자식 상속관계와는 다름)

// static, default 멤버 메소드만 body({})를 가짐 (1.8 버전에서 추가)
// 일종의 템플릿 : 멤버 메소드 만들때 출력할타입 메소드명 기본틀

public interface Account {
  // accountNo; only public, static & final 오류
  // private String accountNo; 멤버 변수 선언 불가

  public static final int SPADE = 4; // 상수

  // 뒤에 body({})를 넣으면 Abstract methods do not specify a body 오류
  public void deposit();

  static void getCardKind() {}

  default void getCard() {}
}
