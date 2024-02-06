package ch4;

public class MemberCall {

  int iv = 10; // 인스턴스 변수, 인스턴스를 생성해야 생김.
  static int cv = 20; // 클래스 변수

  // 클래스 메소드 도 클래스가 로딩될 때 생성, 프로그램 종료될 때 소멸
  static void staticMethod1() {
    // System.out.println(iv);  생성 시점 차이로 인한 오류
    System.out.println(cv); //static 메소드는 같은 static 변수만 가능
  }

  void instanceMethod1() {
    System.out.println(iv);
    System.out.println(cv);
  }
}
