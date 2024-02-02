package loop;

public class ContinueEx1 {

  // continue : 반복문 안에서 이후의 구문을 건너뛰게 함 (종료시키는 것 아님)
  public static void main(String[] args) {
    for (int i = 0; i < 11; i++) {
      if (i % 3 == 0) continue;
      System.out.println(i);
    }

    System.out.println("\n\n");

    for (int i = 0; i < 11; i++) {
      if (i % 2 != 0) {
        continue;
      }
      System.out.println(i);
    }
  }
}
