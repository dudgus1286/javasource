package lang;

// java.lang.Math : 기본적인 수학 계산에 유용한 메소드로 구성된 클래스
// static 메소드, 변수 => 클래스이름.변수, 클래스이름.메소드
// static final : 상수
// public static final double PI = 3.14159265358979323846;
//       => 상수인 파이를 Math.PI로 불려서 쓸 수 있음
public class MathEx {

  public static void main(String[] args) {
    System.out.println(Math.PI);
    // 0 ~ 1 미만의 임의의 숫자 출력
    System.out.println(Math.random());
  }
}
