package ch4;

public class PersonEx {

  public static void main(String[] args) {
    // Person person = new Person();
    // person.setName("홍길동");
    // System.out.println(person.getName());
    // System.out.println(person); // toString 메소드 만들기 전: ch4.Person@5ca881b5
    // // toString 메소드 만든 후: Person [name=홍길동]

    // Person person2 = new Person();
    // person2.setName("성춘향");
    // System.out.println(person2.getName());

    Person person = new Person("홍길동", "Korea");
    person.setName("김길동");
    Person person2 = new Person("장길동", "Korea");
    person2.setName("김길동");
    // person.PI = 1426363; static final 이라서 수정 불가
    System.out.println(person.getPi());

    System.out.println(person == person2); // false
  }
}
