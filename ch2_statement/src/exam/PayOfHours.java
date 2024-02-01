package exam;

import java.util.Scanner;

public class PayOfHours {

  public static void main(String[] args) {
    // 근무시간 입력 후
    // 시간 당 9800원
    // 8 시간 이상 원래 받는 금액의 1.5배 추가
    // 오늘 받는 임금은 15000

    System.out.print("근무시간을 입력하시오 : ");
    Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();
    int pay, rate = 9800;

    if (hour > 8) {
      pay = (int) ((hour - 8) * 9800 * 1.5) + (rate * 8);
    } else {
      pay = hour * rate;
    }

    System.out.println("오늘 받는 임금은 " + pay);
  }
}
