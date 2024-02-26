package lambda;

public class AnimalEx {

  public static void main(String[] args) {
    // 인터페이스 활용 방법
    // 인터페이스 -> 구현 클래스 -> 메인에서 사용(번거로움)
    Animal animal = new Lion();
    animal.eat();

    // 람다식으로 활용 (간편함)
    Animal animal2 = () -> System.out.println("풀을 먹는다"); // 1회용 클래스
    animal2.eat();
  }
}
