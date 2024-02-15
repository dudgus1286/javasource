package lang;

// java.lang.* => 기본 패키지(import 구문 없이 사용가능)
// java.lang.Object : 모든 클래스의 최고 조상
//          .equals() 는 == 과 같은 역할(주소비교)
//          .toString() 는 객체 자신의 정보를 문자열로 반환
public class ObjectEx {

  public static void main(String[] args) {
    //인스턴스 생성
    Object obj1 = new Object();
    Object obj2 = new Object();

    if (obj1.equals(obj2)) { // 서로 다른 오브젝트의 주소를 묻고있음
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두 객체는 다르다");
    }

    if (obj1 == obj2) { // 서로 다른 오브젝트의 주소를 묻고있음
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두 객체는 다르다");
    }

    Value value1 = new Value(10);
    Value value2 = new Value(10);

    if (value1.equals(value2)) { // Value 클래스 equals()를 재정의해서 값을 비교하는 것으로 바뀜
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두 객체는 다르다");
    }

    // 메소드 재정의 전 : lang.Value@4517d9a3
    System.out.println("value1 toString() " + value1.toString()); // 오버라이딩 후 : Value [value=10]
    System.out.println("value1 toString() " + value1); // toString() 오버라이딩 후에는 이렇게 써도 됨

    Member member1 = new Member("hong123");
    Member member2 = new Member("hong123");

    // equals() : 값 비교로 재정의
    // == : 전과 같이 주소 비교
    System.out.println(member1.equals(member2) ? "같다" : "다르다");
    System.out.println(member1 == member2 ? "같다" : "다르다");

    Person person1 = new Person("hong123", "홍길동");
    Person person2 = new Person("hong12", "홍길동");

    System.out.println(person1.equals(person2) ? "같은 사람" : "다른 사람");

    System.out.println("obj1 toString() " + obj1.toString());
    System.out.println("obj2 toString() " + obj2.toString());
  }
}
