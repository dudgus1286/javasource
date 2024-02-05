package ch4;

public class CarEx {

  public static void main(String[] args) {
    // 객체 생성 ==> 클래스를 사용할 수 있는 상태로 만듦
    Car car = new Car();
    car.company = "현대";
    car.model = "소나타";
    car.maxSpeed = 180;
    car.forward();

    Car car2 = new Car();
    car2.company = "현대";
    car2.model = "아반떼";
    car2.maxSpeed = 190;
    car2.backward();
  }
}
