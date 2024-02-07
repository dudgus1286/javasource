package ch4;

public final class Person {

  // 멤버 변수에 final 이 붙은 경우
  // 초기화(클래스 안에서 선언 or 생성자) 반드시 해야 함
  // 수정 불가
  // 상수 개념

  // 클래스에 final 이 붙은 경우 - 상속 금지
  // 메소드에 final 이 붙은 경우 - 오버라이딩 금지

  private String name;
  private final String nation; // = "Korea";

  // 객체들끼리 공유하는 상수 개념
  // 상수는 대문자로 표현
  private static final double PI = 3.141592; // final static 순서 상관없음

  public Person(String name, String nation) {
    this.name = name;
    this.nation = nation;
  }

  // 멤버 변수는 private로 선언

  public final String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static double getPi() {
    return PI;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}
