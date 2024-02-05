package ch4;

public class Student2 {

  // 멤버 변수(=인스턴스 변수, property, 속성, 필드) - 학생 객체가 가져야 하는 특징
  // 학번(20241011), 이름(홍길동), 주소(서울시 종로구), 주민번호(071215-2011237), 핸드폰(010-1234-1234)
  private String id; // 학번 저장
  private String name;
  private String addr;
  private String hp;

  // 멤버 메소드(=인스턴스 메소드, 기능, 동작)
  // 속성을 변경시킬 수 있도록 메소드로 작성
  // 메소드 작성 규칙
  // 리턴타입 메소드명(){}
  // return type: 정수형, 실수형, 불린형, 문자형, String, 배열, void
  void changeAddr(String addr) {
    // 멤버변수 addr의 값을 변경
    this.addr = addr;
    // 그리고 리턴값은 없음

  }

  void changeHp(String hp) {
    this.hp = hp;
  }

  // 생성자(constructor)
  // 클래스를 객체로 생성할 때 필수로 필요
  // 생성자는 여러 개 만들 수 있으나 괄호 안은 달라야 한다
  Student2() {} // -- 멤버 변수 초기화(초기화를 안 하면 기본값이기 때문에)

  public Student2(String id, String name, String addr) {
    this.id = id;
    this.name = name;
    this.addr = addr;
  }

  // 상단 속성 != 괄호 안 속성, 대괄호 안에 상단의 속성과 괄호 안 속성을 연결하는 식
  Student2(String id, String name, String addr, String hp) {
    this.id = id;
    this.name = name;
    this.addr = addr;
    this.hp = hp;
  }

  // 마우스 오른쪽 버튼, 소스 액션 클릭, 투 스프링... ,
  @Override
  public String toString() {
    return (
      "Student2 [id=" +
      id +
      ", name=" +
      name +
      ", addr=" +
      addr +
      ", hp=" +
      hp +
      "]"
    );
  }
}
