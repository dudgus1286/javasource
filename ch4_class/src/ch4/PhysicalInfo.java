package ch4;

public class PhysicalInfo {

  // name, age, height, weight
  private String name;
  private int age;
  private double height;
  private double weight;

  public PhysicalInfo(String name, int age, double height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0) return;
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if (height < 0.0) return;
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    if (weight < 0.0) return;
    this.weight = weight;
  }

  // 메소드 오버로딩
  void update(int age) {
    this.age = age;
  }

  void update(int age, double height) {
    // this.age = age; // 바로 위의 메소드 코드와 일치
    update(age); // 메소드 안에 메소드가 들어갈 수 있음
    this.height = height;
  }

  void update(int age, double height, double weight) {
    // this.age = age;
    // this.height = height;
    update(age, height);
    this.weight = weight;
  }
}
