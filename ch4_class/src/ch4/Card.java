package ch4;

public class Card {

  // 인스턴스 변수 : heap에 저장
  // 무늬 (하트, 클로버, ...)
  private String kind;
  // 숫자
  private int number;
  String shape;

  // 클래스 변수 : 공통된 값을 공유, Card 클래스에 저장
  static int width = 100;
  static int height = 150;

  public Card(String kind, int number) {
    this.kind = kind;
    this.number = number;
  }
}
