package lang;

import static java.lang.Math.*;

// Math : 구성 요소가 모두 static 상태
// 일부러 Math 클래스를 임포트 하면 Math.메소드명 으로 쓰던 걸 메소드명만 간단하게 쓸 수 있음
public class MathEx2 {

  public static void main(String[] args) {
    System.out.println(PI);
    // 0 ~ 1 미만의 임의의 숫자 출력
    System.out.println(random());

    // round() : 반올림, double은 long으로, float은 int로 리턴
    double val = 90.7552;
    System.out.println("round() " + round(val));
  }
}
