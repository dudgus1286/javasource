package ch4;

public class CardEx {

  public static void main(String[] args) {
    Card card1 = new Card("heart", 2);
    Card card2 = new Card("spade", 5);

    System.out.println("카드 크기 " + Card.width);
    System.out.println("카드 크기 " + Card.height);
    // System.out.println("카드 크기 " + card2.width);
    // System.out.println("카드 크기 " + card2.height);

    // 공유값 변경
    Card.width = 80;
    Card.height = 50;

    // static 에서 non-static 메소드, 변수 호출 불가
    // 호출이 가능하려면?
    // 1) 같은 static으로 만들기
    // 2) 인스턴스 생성 후 접근하기
    CardEx obj = new CardEx(); // 2) 새 CardEx 인스턴스를 만들고 그 변수에 메소드 적용
    obj.method1();

    method2(card1);
    System.out.println(card1.shape);
  }

  public void method1() { // 1) void 앞에 static 추가
    System.out.println("인스턴스 메소드");
  }

  static void method2(Card x) {
    x.shape = "하트";
  }
}
