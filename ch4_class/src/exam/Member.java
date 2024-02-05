package exam;

public class Member {

  private String id;
  private String password;
  private String name;
  private int age;
  private String job;
  private String grade = "silver";
  private int point;

  // 생성자
  // 디폴트 생성자는 추가하지 않음
  public Member(String id, String password, String name) {
    this.id = id;
    this.password = password;
    this.name = name;
  }

  public Member(String id, String password, String name, int age, String job) {
    this.id = id;
    this.password = password;
    this.name = name;
    this.age = age;
    this.job = job;
  }
}
