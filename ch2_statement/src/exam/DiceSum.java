package exam;

public class DiceSum {

  public static void main(String[] args) {
    /* 주사위 2개 굴려 나오는 숫자 (숫자1, 숫자2) 형태로 출력
     * 주사위 두 개 합이 5일 때 멈춤
     * while, break 문 활용
     */
    while (true) {
      int num1 = (int) (Math.random() * 6 + 1);
      int num2 = (int) (Math.random() * 6 + 1);
      System.out.printf("(%d, %d)", num1, num2);
      if (num1 + num2 == 5) break;
    }
  }
}
