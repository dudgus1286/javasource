package interfacetest;

// 추상클래스가 인터페이스 클래스를 상속
public abstract class Calculator implements Calc {

  //times, divide 추상 메소드
  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int substract(int num1, int num2) {
    return num1 - num2;
  }
}
