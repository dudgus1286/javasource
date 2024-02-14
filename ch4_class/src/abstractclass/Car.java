package abstractclass;

public abstract class Car {

  String color;
  int door;

  // 자식 클래스들이 다 다르게 구현하기 때문
  abstract void drive();

  void stop() {
    System.out.println("stop!!!");
  }
}
