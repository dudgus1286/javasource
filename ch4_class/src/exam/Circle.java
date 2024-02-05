package exam;

public class Circle {

  // 속성: 반지름(3.5) - radius
  private double radius;

  // 생성자
  // 선언된 생성자가 하나도 없다면 컴파일러는 default 생성자를 자동으로 만들어줌
  //   public Circle() {}

  // 생성자 하나라도 있으면 자동으로 default 생성자를 만들지 않음
  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle() {
    //TODO Auto-generated constructor stub 에디터 퀵픽스 기능으로 자동으로 만들어진 default 생성자
  }

  //반지름*반지름*3.14 결과값 리턴
  double getArea() {
    return this.radius * this.radius * 3.14;
  }
}
