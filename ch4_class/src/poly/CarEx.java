package poly;

public class CarEx {

  public static void main(String[] args) {
    Car car = null;

    FireEngine fe1 = new FireEngine();
    FireEngine fe2 = null;

    Ambulance ambulance = null;
    // ambulance = fe1; (강제 형변환 못함) 상속관계가 아닌 클래스는 형변환 불가 오로지 부모-자식만

    // 자동 형변환 (부모클래스타입참조변수 = 자식참조변수)
    fe1.water();
    car = fe1; // Car car = new FireEngine();

    // cast : 강제 형변환 (자식클래스타입참조변수 = (자식클래스타입) 부모참조변수)
    fe2 = (FireEngine) car;
    fe2.water();

    Car car2 = new Car(); // car 는 실제로는 FireEngine 타입으로 생성됨, car2는 그렇지 않음
    // FireEngine fe3 = (FireEngine) car2; // 실행 시 이 줄 때문에 ClassCastException 에러남
    // fe3.water();
  }
}
