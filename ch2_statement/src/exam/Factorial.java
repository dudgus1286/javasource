package exam;

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    // 숫자 입력 받은 후 입력받은 숫자의 n! 계산
    // 6 => 6! => 6 *5 * 4* 3* 2* 1

    Scanner sc = new Scanner(System.in);
    System.out.print("숫자를 입력하시오 ");
    int num = sc.nextInt();

    int facto = 1;
    for (int i = 1; i <= num; i++) {
      facto *= i;
    }
    System.out.printf("%d 의 팩토리얼은 %d 입니다.\n", num, facto);
  }
}
