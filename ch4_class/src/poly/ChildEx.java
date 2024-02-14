package poly;

// 다형성(Polymorphism)
// 부모 클래스 타입의 참조변수로 자손 클래스의 인스턴스 참조
// 형변환 : 자손타입 -> 조상타입(자동) Car car = new FireEngine();
//         조상타입 -> 자손타입(강제형변환 필요) fe2 = (FireEngine) car;
//         참조 변수의 타입을 변환하는 것으로 참조할 수 있는 범위를 조절하는 개념

public class ChildEx {

  public static void main(String[] args) {
    Child child = new Child();
    // child1으로 접근 가능한 범위
    // field1, method1(), method2() : Parent 클래스
    // field2, method3() : Child 클래스

    // 상속관계라면 : 부모클래스타입 참조변수명 = new 자식인스턴스();
    Parent child1 = new Child();
    // child1으로 접근 가능한 범위
    // field1, method1(), method2() : Parent 변수, 메소드만 가능
    child1.method2(); // 오버라이딩된 메소드라면 자식 메소드가 실행
  }
}
