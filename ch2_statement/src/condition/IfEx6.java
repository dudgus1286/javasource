package condition;

// Math.random() : 0.0 <= Math.random() < 1.0
// Math.random() 으로 나오는 숫자는 0.0 보다 크거나 같고, 1보다는 작다.

public class IfEx6 {

  public static void main(String[] args) {
    System.out.println((int) (Math.random() * 6) + 1);
    // 0 ~ 5 + 1 == 1 ~ 6 : 주사위
    int dice = (int) (Math.random() * 6) + 1;

    // 주사위 몇 번이 나옴
    if (dice == 1) {
      System.out.println("주사위 1번 나옴");
    } else if (dice == 2) {
      System.out.println("주사위 2번 나옴");
    } else if (dice == 3) {
      System.out.println("주사위 3번 나옴");
    } else if (dice == 4) {
      System.out.println("주사위 4번 나옴");
    } else if (dice == 5) {
      System.out.println("주사위 5번 나옴");
    } else {
      System.out.println("주사위 6번 나옴");
    }
  }
}
