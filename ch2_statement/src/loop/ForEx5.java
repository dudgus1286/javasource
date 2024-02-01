package loop;

public class ForEx5 {

  public static void main(String[] args) {
    // *
    // **
    // ***
    // ****
    // *****
    // 행과 열이 동시에 있는 형태는 for 문 두 개 활용

    for (int j = 1; j <= 5; j++) {
      for (int i = 1; i <= j; i++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
