package ch4;

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
