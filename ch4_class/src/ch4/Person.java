package ch4;

public class Person {

  private String name;

  // 멤버 변수는 private로 선언

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}
