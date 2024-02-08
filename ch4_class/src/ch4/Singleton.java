package ch4;

// Singleton 패턴
// 단 하나의 객체만을 생성할 수 있도록 하는 패턴
public class Singleton {

  private static Singleton singleton;

  // 외부, 다른 클래스에서 쓸 수 없는 생성자
  private Singleton() {}

  static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}
