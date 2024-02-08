package inheritance;

public class Child2 extends Parent {

  // 디폴트 생성자에도 super 메소드가 숨어있음
  //   Child2() {
  //     //super();
  //   }

  public Child2(int age) {
    // 부모의 생성자 호출
    super(age);
    //TODO Auto-generated constructor stub
  }
}
