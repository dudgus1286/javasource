package exam;

public class Equation {

  public static void main(String[] args) {
    // 4x + 5y = 60 이 되는 모든 해 구하기
    // x, y 는 10 이하의 자연수

    for (int x = 1; x <= 10; x++) {
      for (int y = 1; y <= 10; y++) {
        if (4 * x + 5 * y == 60) {
          System.out.println(x + ", " + y);
        }
      }
    }
  }
}
